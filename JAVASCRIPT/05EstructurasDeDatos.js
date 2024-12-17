/*
Las estructuras de datos nos sirven para organizar, manejar y guardar datos de una manera eficiente.
JavaScript cuenta con 2 tipos de estructuras de datos:
-Colecciones Indexadas: tienen indices númericos con los cuales podemos acceder a los elementos de la colección.
.ARRAY:
    -Almacena valores ordenados.
    -Los índices comienzan en 0.
    -Puede almacenar cualquier tipo de valor.
    -Proporciona métodos para manipular arrays.
    -Es dínamico (tamaño variable)

.TYPEDARRAY:
    -Es como un Array pero maneja datos binarios y númericos.
    -Solo puede contener un tipo especifico de datos númericos (Int8, Uint8, Float32, etc.)
    -Se utiliza en aplicaciones de procesamiento de datos, gráficos y WebGL.
*/

/*
EJEMPLO ARRAY
*/
const arreglo = [1, 2, 3, "Hola"];
// Acceder a valores
console.log(arreglo[0]); // 1
// Añadir elementos
arreglo.push(4);
// Iterar sobre un array
arreglo.forEach((valor) => console.log(valor));
// Filtrar valores
const filtrado = arreglo.filter((x) => typeof x === "number");
console.log(filtrado); // [1, 2, 3, 4]

/*
EJEMPLO TYPEDARRAY
*/
// Crear un TypedArray de 4 enteros sin signo (8 bits cada uno)
const typedArray = new Uint8Array(4);
// Asignar valores
typedArray[0] = 10;
typedArray[1] = 20;
console.log(typedArray); // Uint8Array(4) [10, 20, 0, 0]
// Iterar sobre un TypedArray
for (const valor of typedArray) {
  console.log(valor);
}

/*
-Colecciones con llaves: contienen llaves únicas con las cuales podemos acceder a los elementos de la colección.
.MAP: 
    -Almacena pares clave-valor.
    -Las claves pueden ser de cualquier tipo (No solo Strings o simbolos).
    -Mantiene el orden de inserción de las claves.
    -Proporciona métodos para añadir, eliminar y buscar elementos.
    -Es iterable.

.WEAKMAP:
    -Almacena pares clave-valor.
    -Las claves DEBEN ser objetos.
    -Las claves son "weakly referenced" lo que significa que si un objeto clave no tiene otras referencias, el recolector de basura lo elimina.
    -No es iterable y no tiene propiedades como el size.

.SET:
    -Almacena valores únicos (No permite duplicados).
    -Puede contener cualquier tipo de valor: primitivas u objetos.
    -Mantiene el orden de inserción.
    -Proporciona métodos para añadir, eliminar y buscar elementos.
    -Es iterable.

.WEAKSET:
    -SOLO almacena objetos.
    -Los objetos son "weakly referenced".
    -No es iterable y no tiene propiedades como el size.
*/

/* 
EJEMPLO MAP
*/
const mapa = new Map();
// Agrega elementos
mapa.set("nombre", "Juan");
mapa.set(123, "ID de usuario");
mapa.set(true, "Booleano");
// Muestra elementos
console.log(mapa.get("nombre")); // "Juan"
console.log(mapa.get(123));      // "ID de usuario"
// Verificar existencia
console.log(mapa.has(true)); // true
// Eliminar un elemento
mapa.delete(123);
// Iterar sobre un Map
for (const [clave, valor] of mapa) {
  console.log(`${clave}: ${valor}`);
}

/*
EJEMPLO WEAKMAP
*/
const weakMap = new WeakMap();
let objeto = { id: 1 };
// Asociar una clave
weakMap.set(objeto, "Información del objeto");
console.log(weakMap.get(objeto)); // "Información del objeto"
// Eliminar la referencia
objeto = null; // El objeto es eliminado automáticamente

/* 
EJEMPLO SET 
*/
const conjunto = new Set();
// Añadir valores
conjunto.add(1);
conjunto.add(2);
conjunto.add(2); // Ignorado porque ya existe
conjunto.add("Hola");
// Comprobar existencia
console.log(conjunto.has(1)); // true
// Eliminar un valor
conjunto.delete(2);
// Iterar sobre un Set
for (const valor of conjunto) {
  console.log(valor); // 1, "Hola"
}

/*
EJEMPLO WEAKSET
*/
const weakSet = new WeakSet();
let objeto1 = { nombre: "Juan" };
let objeto2 = { nombre: "Maria" };
// Añadir objetos
weakSet.add(objeto1);
weakSet.add(objeto2);
console.log(weakSet.has(objeto1)); // true
// Eliminar referencia
objeto1 = null; // El objeto se elimina automáticamente del WeakSet