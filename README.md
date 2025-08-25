# 📝 Laboratorio 02 – SOLID, Patrones de Diseño y UML

**Integrantes:**
- Daniel Eduardo Useche
- Jared Farfan
- Carlos Piedrahita
- Maria Paula Rodriguez 

**Nombre de la rama:**  
`feature/Apellido1_Apellido2_Apellido3_2025-2`

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

 
