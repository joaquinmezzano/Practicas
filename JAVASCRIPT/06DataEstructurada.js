/*
Hace referencia a una estructura predeterminada que siguen los datos en una página para ficilitar su procesamiento y análisis.

JSON es un formato de datos estructurados ligeto y fácil de usar que se basa en la sintaxis de objetos de JS. Se utiliza principalmente para almacenar e intercambiar datos entre sistemas, como servidores y clientes.

CONVERSIÓN ENTRE JSON Y OBJETOS JS:*/
// CONVERTIR DE OBJETO A JSON (stringify):
const usuario = {
    nombre: "Juan",
    edad: 25,
    activo: true
};
  
const usuarioJSON = JSON.stringify(usuario);
console.log(usuarioJSON);
// Resultado: '{"nombre":"Juan","edad":25,"activo":true}'

// CONVERTIR DE JSON A OBJETO (parse):
const datosJSON = '{"nombre":"Juan","edad":25,"activo":true}';

const datosObjeto = JSON.parse(datosJSON);
console.log(datosObjeto);
// Resultado: { nombre: 'Juan', edad: 25, activo: true }
