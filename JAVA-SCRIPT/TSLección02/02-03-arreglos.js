//Creación de Array o arreglos
//let autos = new Array('Ferrari', 'Renault', 'BMW'); Esta es la sintaxis vieja
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

//Recorremos los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+' : ' +autos[i])
}

//Modificamos los elemetos del arreglo
autos[1] = 'PORSHE';
console.log(autos[1]);

//Agregamos nuevos valores al arreglo
autos.push('Audi');
console.log(autos);

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'SUZUKI';
console.log(autos);

//Tercera forma de agregar elementos, ¡TENER CUIDADO CON ESTA FORMA!
autos[6] = 'Renault'
console.log(autos);

//Como preguntar si es un Arrayo Arreglo
console.log(Array.isArray(autos)); //Devuelve un booleano

//Segunda forma de comprobar si es un Array
console.log(autos instanceof Array); //preguntamos si la variable es una instancia de la clase Array