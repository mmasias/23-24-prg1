# Java: entrada por consola

## ¿Por qué?

La interacción dinámica con aplicaciones en tiempo real es esencial en el proceso de aprendizaje de la programación. Proporcionar y recibir datos, tomar decisiones basadas en entradas en tiempo real y observar los resultados directamente llevan a una comprensión más profunda de la ejecución del programa. Esta interacción no solo aporta flexibilidad y personalización, sino que también sienta las bases para entender cómo los sistemas de software interactúan con los usuarios y otros sistemas.

## ¿Qué?

La entrada por consola en programación es la capacidad que tiene una aplicación para aceptar información proporcionada en tiempo real mientras se está ejecutando.

En el contexto del lenguaje de programación Java, esto se logra mediante la **clase Scanner**, una herramienta proporcionada en la biblioteca estándar. Esta clase permite leer datos introducidos por el usuario y convertirlos en tipos utilizables dentro del código.

## ¿Para qué?

|||
|-|-|
|Interactividad|La entrada por consola mejora la experiencia al permitir una comunicación bidireccional entre el usuario y la aplicación.
|Flexibilidad|Los programas pueden adaptarse y tomar decisiones basadas en la entrada proporcionada, ofreciendo un comportamiento dinámico en lugar de estático.
|Aprendizaje|La entrada por consola actúa como un puente entre el código estático y su ejecución dinámica, permitiendo una comprensión directa de la relación entre el código y sus efectos.
|Pruebas y Depuración|Sirve como herramienta para probar y depurar, permitiendo a los desarrolladores experimentar con diferentes entradas sin modificar el código.

## ¿Cómo?

En Java, la entrada desde la consola se facilita mediante la clase Scanner del paquete java.util. 

A continuación, se presenta un enfoque general sobre su uso:

### Importación de la Clase Scanner:

```java
import java.util.Scanner;
```

### Creación de un Objeto Scanner:

Se crea una instancia de la clase Scanner para comenzar a recibir entradas.

```java
Scanner scanner = new Scanner(System.in);
```

### Lectura de Entrada:

La clase Scanner proporciona varios métodos para leer diferentes tipos de datos, como:

- ```nextInt()``` para enteros
- ```nextLine()``` para cadenas 
- ```nextDouble()``` para números decimales.

```java
System.out.print("Por favor, introduce un número entero: ");
int numero = scanner.nextInt();
System.out.println("Has introducido el número: " + numero);
```

### Finalización:

Una vez que la entrada ha sido leída y ya no se necesita el objeto Scanner, es recomendable cerrarlo para liberar recursos.

```java
scanner.close();
```

Utilizando estos pasos, los programas en Java pueden capturar y utilizar la entrada del usuario en tiempo real, permitiendo una interacción dinámica y adaptativa.
