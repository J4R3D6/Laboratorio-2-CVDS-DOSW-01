# 📝 Laboratorio 02 – SOLID, Patrones de Diseño y UML

**Integrantes:**
- Nombre Completo 1  
- Nombre Completo 2  
- Nombre Completo 3  

**Nombre de la rama:**  
`feature/RodriguezMariaPaula_PiedrahitaCarlos_UsecheDaniel_FarfanJared_2025-2`

---

## ✅ Retos Completados

## PREGUNTAS INICIALES: 

- ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto? 

    El polimorfismo permite que objetos distintos implementen un mismo método de diferentes formas, evitando así el uso de múltiples condicionales 

- ¿Por qué una clase inmutable puede mejorar la seguridad? 

    Porque una clase inmutable no se puede modificar una vez ha sido creada. Evitando así cambios inesperados 

- ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados? 

    Queda libre el acceso a la estructura interna de las clases, al no tener getters ni setters pueden surgir modificaciones no deseadas sin ningún tipo de validación o control 

- ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente? 

    Según el principio de Abierto/Cerrado, lo que se debe hacer es extender el código con las nuevas funcionalidades evitando modificar el código ya implementado 

- ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere? 

    Porque este principio dice que una clase debe tener una sola razón para cambiar, lo cual facilita tanto el mantenimiento como las pruebas del código. 

    Por ejemplo, se tiene una clase Carro, con dos métodos; mover el carro y encender/apagar el carro. Es decir, le estamos dando más de una razón para cambiar lo que violaría este principio. Lo correcto sería dejar la clase carro con el método de moverlo y otra clase que sea el motor del carro que se encargue de encender y apagar el carro 

- ¿Qué es y porque usamos el pom.xml? 

    Es un archivo de configuración usado en Maven que contiene ya sean librerías, versiones y configuraciones del proyecto. Se usa para automatizar la construcción del proyecto dándole un mejor manejo a las dependencias facilitando su portabilidad 

- ¿Qué diferencia hay entre mvn compile, mvn package y mvn install? 

    mvn compile: Compila el código fuente del proyecto 

    mvn package: Compila y empaqueta el código en un archivo .jar o .war 

    mvn install: Compila, empaqueta e instala el proyecto empaquetado en el repositorio local de Maven para que pueda ser usado por otros proyectos en el mismo equipo 

- ¿Qué diferencia existe entre una interfaz y una clase abstracta? 

    Una interfaz es un contrato que define comportamiento y por otro lado la clase abstracta define más que todo atributos y métodos abstractos sin implementación. 

## Desafios:

### Reto 1 :

El patrón implementado es *Strategy Pattern*, el cual se clasifica como patrón comportamental porque determina cómo se debe realizar el intercambio de mensajes entre diferentes objetos para resolver una tarea, tambien se uso el patrón *Factory* para mejorar la creacion de los diferentes tipos de cliente.

Clases necesarias Reto1TiendaDeDonPepe, Client, ClientFactory, DiscountStrategy, FrequentClient, NewClient, Product y ShoppingCart.

Usamos este patrón de diseño ya que desacopla la forma en la que hacemos el descuento de los clientes, pues en caso de crear un nuevo tipo de cliente y este no contar con un descuento se tendría que cambiar el comportamiento de la clase padre (cliente) violando los princio SOLID (open close).

### Reto 2 :

El patrón implementado es *Builder*, el cual se clasifica como patrón creacional pues que el problema en cuestión plantea una construcción distinta al mismo objeto

Clases necesarias Reto2ChefDeHamburguesas, Hamburguesa, Builder

### Reto 3 :

Patrón de Diseño 
Se utilizaron dos clases de patrones, tanto el creacional como el estructural
Patrón Utilizado
Patrón #1: Factory Method.
Patrón #2: Decorator.
Justificación
Patrón #1: Se utilizó para que por medio de este pudiéramos centralizar la creación de los distintos tipos de vehículos. 
Patrón #2: Este tuvo un uso para poder agregar características adicionales a los vehículos de manera dinámica.
Cómo Lo aplico
Patrón #1: Por medio de la clase ‘VehicleFactory’ la cual cuenta con un método estático que recibe los parámetros que ingresa el usuario y regresa la instancia del respectivo vehículo.
Patrón #2: Con la clase ‘DecoratorCategory’ la cual se tomó como base se realizaron unos decoradores específicos como por ejemplo “luxury” los cuales se encargan de alterar los valores determinados.

### Reto 4 :

### Reto 5 :

### Reto 6 :

Patrón de Diseño 
Comportamiento
Patrón Utilizado
Chain of responsibility
Justificación
Este patrón nos ayudó mucho ya que por medio de este pasábamos las solicitudes a diferentes objetos hasta que uno se encargará de esta.
Cómo Lo aplico
Ponemos a los técnicos en una cola que tiene orden de prioridad y cuando llega una nueva solicitud para atender el programa revisa en la cola y selecciona automáticamente el técnico que más se adecue al problema.

### Reto 7 :

El patrón implemtado es *Command*, el cual se clasifica como patrón creacional Cada acción (Encender luz, Abrir puerta, etc.) se encapsula como un objeto comando y este sabe cómo ejecutarse y cómo deshacerse, el control remoto no necesita conocer la lógica interna de cada dispositivo solo manda execute() o undo().

Permite mantener un historial de comandos ejecutados, lo cual facilita saber quién ejecutó qué.

### Reto 8 :