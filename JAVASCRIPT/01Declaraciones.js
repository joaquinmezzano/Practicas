// VAR: declara una variable que puede utilizarse globalmente, fuera del bloque donde fue declarada.
var nombre1;
var nombre2 = valor2;
var nombre3 = valor3, nombre4 = valor4;
var nombre5, nombre6 = valor56;

{
    var x = 10;
    console.log(x); // 10
}
console.log(x); // 10

// LET: declara una variable pero solo existen dentro del bloque en las que son declaradas.
let nombre1;
let nombre2 = valor2;
let nombre3 = valor3, nombre4 = valor4;
let nombre5, nombre6 = valor56;

{
    let y = 10;
    console.log(y); // 10
}
console.log(y); // ReferenceError: x is not defined

// CONST: declara una constante, un valor inmutable.
const NAME = "Joaquin";
console.log(NAME);

// Declaraciones dentro de funciones solo existen dentro de ellas mismas.