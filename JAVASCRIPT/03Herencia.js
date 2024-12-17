/*
En JavaScript la herencia se implementa a traves del Prototypal Inheritance donde a diferencia de lenguajes de POO en el cual la herencia es por clases, en JS se utilizan objetos y prototipos para permitir que un objeto "herede" propiedades y métodos de otro objeto. 

(A partir de ES6 se puede realizar herencia mediante class, el cual internamente utiliza prototipos pero es más fácil y moderno con class)

En JS cada objeto tiene un prototipo asociado, si intentas acceder a una propiedad o método de un objeto y no existe en el mismo, JS buscara en su prototipo (y luego en el prototipo del prototipo, hasta llegar a null), esta cadena de búsqueda se llama cadena de prototipos (prototype chain)

Todos los objetos (excepto null) heredan de Object.prototype.
*/

const obj = {};
console.log(obj.toString()); // [object Object]

/*
Aunque no definimos el método toString en obj, este existe porque obj hereda de Object.prototype que si tiene ese método.
*/

// PROPIEDAD __proto__ Y Object.getPrototypeOf
// La propiedad __proto__ hace referencia al prototipo de un objeto:
console.log(obj.__proto__);

// El método estándar Object.getPrototypeOf devuelve el prototipo de un objeto:
console.log(Object.getPrototypeOf(obj));

// __proto__ es poco utilizado y fue reemplazado por: Object.getPrototypeOf y Object.setPrototypeOf.

/*
Utilizando Class, como mencionamos anteriormente, es un proceso más fácil y moderno que hace su semejanza a lenguajes tradicionales como Java o C.
Utilizamos extends, this y super como en Java.
*/
class Padre {
    constructor(nombre) {
      this.nombre = nombre;
    }
  
    saludar() {
      console.log(`Hola, soy ${this.nombre} desde la clase Padre`);
    }
}

class Hijo extends Padre {
    constructor(nombre, edad) {
      super(nombre); // Llama al constructor de Padre
      this.edad = edad;
    }
  
    despedir() {
      console.log(`Adiós, soy ${this.nombre} de ${this.edad} años`);
    }
}
  
const hijo = new Hijo("Juan", 25);
hijo.saludar();  // "Hola, soy Juan desde la clase Padre" (heredado)
hijo.despedir(); // "Adiós, soy Juan de 25 años"