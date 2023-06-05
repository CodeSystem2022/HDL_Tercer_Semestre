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
            sentencia = 'INSERT INTO personas (nombre, apellido, email)VALUES (%s, %s, %s)'
            valores = ('Marcelo', 'Cascon', 'marcelocasc@gmail.com')
            cursor.execute(sentencia, valores)  # Ejecutamos sentencia
            registros_insertados = cursor.rowcount
            print(f"Los registros insertados son: {registros_insertados}")
except Exception as e:
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()
