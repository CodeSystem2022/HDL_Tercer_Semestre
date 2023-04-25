import psycopg2 # Conectamos a postgres


try:
    conexion = psycopg2.connect(
        user='postgres',
        password='admin',
        host='127.0.0.1',
        port='5432',
        database='test_db')
    
    cursor = conexion.cursor()
    sentencia = 'SELECT * FROM persona'
    cursor.execute(sentencia) # Ejecutamos sentencia
    registros = cursor.fetchall() # Listamos todos registros 
    print(registros)

    cursor.close()
    conexion.close()

except Exception as e:

    print(e)
