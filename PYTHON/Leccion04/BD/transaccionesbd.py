import psycopg2 as bd # Conectamos a postgres

conexion = bd.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd')

try:
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO personas(nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Sergio', 'Ramos', 'sergi@gmail.com')
    cursor.execute(sentencia, valores)
    conexion.commit()
    print('Terminamos la transaccion.')
except Exception as e:
    conexion.rollback()
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()

# 