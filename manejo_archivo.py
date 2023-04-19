# declaramos variable
try:
    archivo = open("prueba.txt","w", encoding="utf8")
    archivo.write("Soy lo mas grande que existe en la tierra\n")
    archivo.write("Soy un Accíon camión\n")
    archivo.write("PUTITOS")
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close()
