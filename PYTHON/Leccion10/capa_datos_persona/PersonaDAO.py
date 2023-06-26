from Conexion import Conexion
from Persona import Persona
from logger_base import log


class PersonaDAO:
    _SELECCIONAR = 'SELECT * FROM personas ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO personas(nombre, apellido, email)VALUES(%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE personas SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM personas WHERE id_persona=%s'

    @classmethod
    def seleccionar(cls):
        # with Conexion.obtenerConexion():
        with Conexion.obtenerCursor() as cursor:
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()
            personas = []
            for registro in registros:
                persona = Persona(
                    registro[0], registro[1], registro[2], registro[3])
                personas.append(persona)
            return personas

    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f"Persona insertada: {persona}")
                return cursor.rowcount
            
    @classmethod 
    def actualizar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                log.debug(f"Persona Actualizada: {persona}")
                return cursor.rowcount

    @classmethod 
    def eliminar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.id_persona,)
                cursor.execute(cls._ELIMINAR, valores)
                log.debug(f"Registro eliminado: {persona}")
                return cursor.rowcount

if __name__ == '__main__':
    # Eliminar un registro
    # persona1 = Persona(id_persona=26, nombre='Gabriel', apellido='Batistuta', email='batimail@mail')
    # registros_eliminados = PersonaDAO.eliminar(persona1)
    # log.debug(f"Registros eliminados: {registros_eliminados}")


    # Actualizar un registro
    # persona1 = Persona(26,'Gabriel', 'Batistuta', 'batimail@mail')
    # registros_actualizadas = PersonaDAO.actualizar(persona1)
    # log.debug(f"Registros Actualizados: {registros_actualizadas}")
    
    # Insertar un registro
    # persona1 = Persona(id_persona=28, nombre='Pedro',
    #                    apellido='Fernandez', email='pfer@mail')
    # registros_insertados = PersonaDAO.insertar(persona1)
    # log.debug(f"Registro Insertado: {registros_insertados}")

    # Seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)