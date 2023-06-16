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
            valores = (
                ('Santiago', 'Cascon', 'casconsanti@gmail.com'),
                ('Jose', 'sacon', 'jocasc@gmail.com'),
                ('Alfredo', 'Montes', 'alfremontes@gmail.com'),
                ('Higuain', 'Gonzalo', '2604310229@gmail.com'),
                ('Fernando', 'Miembro', 'comolevadonmiembro@gmail.com'),
                )
            cursor.executemany(sentencia, valores)  # Ejecutamos sentencia
            registros_insertados = cursor.rowcount
            print(f"Los registros insertados son: {registros_insertados}")
except Exception as e:
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()
