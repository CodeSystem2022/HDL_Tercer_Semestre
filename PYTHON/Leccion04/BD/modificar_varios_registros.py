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
            # Placheholder
            sentencia = 'UPDATE personas SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'

            valores = (
                        ('Carles', 'Puyol', 'puyicharles@gmail.com', 3),
                        ('Gonzalo', 'Higuain', 'pipo@gmail.com', 6),
                        ('David', 'Alaba', 'alabaalseñor@gmail.com', 7),
                        ('Omero', 'Diaz', 'homerosinh@gmail.com', 10),
                       )
            cursor.executemany(sentencia, valores)  # Ejecutamos sentencia
            registros_modificados = cursor.rowcount
            print(f"Los registros modificados son: {registros_modificados}")
except Exception as e:
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()
