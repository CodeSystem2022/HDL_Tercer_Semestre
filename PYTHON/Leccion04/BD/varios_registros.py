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
            sentencia = 'SELECT * FROM personas WHERE id_persona IN %s' #Placheholder
            entrada = input("Digite los id a buscar: ")
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.execute(sentencia, llaves_primarias)  # Ejecutamos sentencia
            registros = cursor.fetchall()  # Listamos todos registros
            for registro in registros:
                print(registro)
except Exception as e:
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()

