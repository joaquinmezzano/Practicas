/*TIPOS SIMPLES (PRIMITIVOS)*/
// Int y Float
var entero = 1;
var flotante = 1.2;

// Strings
var cadena = "Hola";
cadena[0] // "H"
cadena.length // 4

// Booleans
var bool = true;
var bool2 = false;

// Undefined, una variable mantendra este valor hasta que no obtenga uno propio.
var undef;
console.log(undef); // undefined

// Null, valor que se le da a un elemento para indicar que no esta referenciando a nada. Es un falsy.
var nada = null;

// Symbol, sirve para crear identificadores únicos que no colisionan con otras propiedades, lo que lo hace útil para evitar conflictos, especialmente en objetos.
const ID = Symbol('id');

const usuario = {
  nombre: 'Joaquín',
  [ID]: 1234, // clave usando un símbolo
};

console.log(usuario[ID]); // 1234
console.log(usuario); // { nombre: 'Joaquín', [Symbol(id)]: 1234 }


/*TIPOS COMPUESTOS (OBJETOS)*/
// Para poder utilizar los tipos compuestos tenemos que instanciarlos con un new.
// Hay 2 tipos de formas de crear un nuevo objeto vacio:
let user = new Object();
let user2 = {};

// Ejemplo
let user3 = {
    name: 'Joaquin',
    age: 23,
};
console.log(user3.name) // Joaquin
console.log(user3.age) // 23

// Podemos agregar o eliminar elementos del tipo compuesto que creamos
user3.isAdmin = true;
delete user3.isAdmin;

// Objetos Built-in, son aquellos que vienen por defecto en el lenguaje y estan listos para ser utilizados sin necesidad de definirlos.
// OBJETOS GLOBALES: Object, Array, Function, String, Number, Boolean
const obj = { clave: 'valor' };
console.log(Object.keys(obj)); // ['clave']
console.log(Object.values(obj)); // ['valor']

const array = [1, 2, 3]
console.log(array.length); // 3
array.push(4);
console.log(array); // [1, 2, 3, 4]

// OBJETOS MATEMATICOS: Math, Number, BigInt
// OBJETOS PARA FECHAS: Date
// OBJETOS PARA ESTRUCTURAS DE DATOS: Map, Set, WeakMap, WeakSet
// OBJETOS PARA TEXTO: String, RegExp
// OBJETOS PARA ERRORES: Error, TypeError, SyntaxError
// OBJETOS DE INTERNACIONALIZACIÓN: Intl, Intl.DateTimeFormat
// OBJETOS ÚTILES: Promise, JSON, Reflect, Proxy