import psycopg2  # Conexión base de datos

conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'
            valores = (
                ('Carlos', 'Soto', 'csoto@mail.com'),
                ('Marcos', 'Solis', 'msolis@mail.com'),
                ('Marcelo', 'Casco', 'mcasco@mail.com')
            )
            cursor.executemany(sentencia, valores)  # Guardamos los cambios en la base de datos
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()