import psycopg2  # Conectamos a postgres

conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM personas'
            # sentencia = 'SELECT id_persona, nombre FROM personas'
            # sentencia = 'SELECT * FROM personas WHERE id_persona = 1'
            # sentencia = 'SELECT * FROM personas WHERE id_persona = %s' #Placheholder
            # id_persona = input("Digite un numero para id_persona: ")
            cursor.execute(sentencia)  # Ejecutamos sentencia
            registros = cursor.fetchall()  # Listamos todos registros
            print(registros)
except Exception as e:
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()

# 