let x = 10; // Variable primitiva
console.log(x.length);
console.log("TIPOS PRIMITIVOS")
// Creamos un OBJETO y definimos sus propiedades/metodos
let persona = {
    nombre: "Santiago",
    apellido: "Cascon",
    email: "casconsanti@gmail.com",
    edad: 22,
    // Creamos metodos para nuestro Objeto
    nombreCompleto: function(){
        return this.nombre + " " + this.apellido
    },
    direccion: "Sgto. Cabral",
    dicNum: 1031,
    direccionCompleta: function(){
        return "Direccion: " + this.direccion + " " + this.dicNum
    }
}


// Accedemos a las propiedades de nuestro objeto
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log("EJECUTANDO CON UN OBJETO")
// Mostramos el Objeto completo
console.log(persona);

// Mostramos por consola el metodo creado
console.log(persona.nombreCompleto());
console.log(persona.direccionCompleta());
console.log("MOSTRAMOS METODOS");
// Distintas formas de crear un OBJETO
let persona2 = new Object(); // Crea un nuevo objeto en memoria
persona2.nombre = "Jose";
persona2.apellido = "Gonzalez";
persona2.email = "josegon@gmail.com";
console.log(persona2);
console.log("CREAMOS UN NUEVO OBJETO")
// Como acceder a las propiedades de un objeto

console.log(persona["apellido"]); // Accedemos como si fuese un array

// FOR IN
for(propiedad in persona){
    console.log(propiedad); // Accedemos a la propiedad
    console.log(persona[propiedad]); // Accedemos a los valores de las propiedades
}
console.log("UTILIZAMOS CICLO FOR IN")
// Agregamos nueva propiedad
persona.apellida = "Fernandez"; // Cambiamos apellido del objeto "persona"
console.log(persona.apellida);
delete persona.apellida;
console.log("AGREGAMOS UNA PROPIEDAD Y LA ELIMINAMOS")
console.log(persona.apellida);

// Distintas formas para imprimir objetos
// Opcion 1
console.log("Opcion 1:");
console.log(persona.nombre+","+persona.apellido+"email:"+persona.email+"edad: "+persona.edad)

// Opcion 2
console.log("Opcion 2:");
for(propPersona in persona2){
    console.log(persona2[propPersona]);
}

// Opcion 3
console.log("Opcion 3:");
let personaArray = Object.values(persona);
console.log(personaArray);

// Opcion 4
console.log("Opcion 4:");
console.log("Metodo JSON.stringify");
let personaString = JSON.stringify(persona);
console.log(personaString);
