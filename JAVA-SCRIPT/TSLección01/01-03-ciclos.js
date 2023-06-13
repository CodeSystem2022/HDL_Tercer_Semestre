// while.

let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}

console.log("Fin del ciclo");

// Ciclo do while

conteo = 0
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("fin del ciclo do while");


// Ciclo for
for(let contando = 0; contando < 3; contando++){
    console.log(contando);
}
console.log("Fin del ciclo");


//Palabra reservada break
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando); // Muestra todos los pares
        break;
    }
}
console.log("Termina el ciclo al encontrar el primer numero par");

//Palabra reservada continue
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue; // Ir a la siguiente iteración
    }
    console.log(contando);
}
console.log("Termina el ciclo");

// Etiqueta labels y continue
inicio:

for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue inicio; // Ir a la siguiente iteración
    }
    console.log(contando);
}
console.log("Termina el ciclo");

