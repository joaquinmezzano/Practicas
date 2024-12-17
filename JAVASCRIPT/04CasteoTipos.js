/*
El casteo de tipos es la transferencia de datos de un tipo hacia otro.
Sucede en la compilación (para lenguajes compilados) o en ejecución (para scripts como JS).

Hay 2 tipos de casteos: Type Coercion y Type Conversion.
-Type Coercion: se realiza automaticamente por el motor de JS, ocurre cuando se mezclan valores de distintos tipos en expresiones o comparaciones y JS necesita convertir alguno para evaluar la operación. */

const resultado = "5" + 2;
console.log(resultado); // "52" (el 2 se convierte en string)

const resta = "5" - 2;
console.log(resta); // 3 (el 5 se convierte a número)

/* -Type Conversion: es una conversión explicita realizada directamente por el desarrollador, en el cual se utilizan funciones o métodos para pasar manualmente de un tipo a otro. */

const str = "123";
const num = Number(str);
console.log(num); // 123

const num2 = parseInt("456");
console.log(num2); // 456