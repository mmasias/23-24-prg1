# Matrices

## ¿Por qué?

En el mundo de la programación, a menudo se enfrenta el desafío de manejar y organizar datos de manera eficiente. Aquí es donde entran en juego los arrays o matrices. Son fundamentales en cualquier lenguaje de programación porque proporcionan una estructura para almacenar y manipular conjuntos de datos relacionados de una manera organizada y accesible. Comprender los arrays es crucial para cualquier programador, ya que son una de las estructuras de datos más básicas y utilizadas, sirviendo como pilar para conceptos más avanzados y aplicaciones en el mundo real.

> Una estructura de datos es una forma específica de organizar y almacenar datos para que puedan ser utilizados de manera eficiente. Define no solo la organización física de los datos, sino también las relaciones entre ellos y las operaciones que se pueden realizar sobre estos datos.

## ¿Qué?

Un array o matriz es una colección de elementos, todos del mismo tipo, almacenados en una estructura de datos contigua. Los elementos de un array se almacenan en posiciones consecutivas en la memoria y cada uno de ellos se puede acceder directamente utilizando un índice o una clave numérica. Los arrays pueden ser de una dimensión (como una lista lineal de elementos) o multidimensionales (como tablas de dos o más dimensiones).

## ¿Para qué?

|||
|-|-|
|Almacenamiento organizado|Permiten almacenar conjuntos de datos de manera ordenada y estructurada, facilitando su acceso y manipulación.
|Procesamiento de datos|Son esenciales para realizar operaciones en conjuntos de datos, como cálculos matemáticos o análisis estadísticos.
|Eficiencia en el acceso y la modificación|Ofrecen una forma rápida y eficiente de acceder y modificar datos mediante el uso de índices.
|Base para estructuras de datos más complejas|Los arrays son el fundamento sobre el cual se construyen estructuras de datos más avanzadas y especializadas.
|Simplicidad en la implementación|Proporcionan una manera relativamente simple y directa de manejar colecciones de datos, lo cual es ideal para entender conceptos básicos de programación y algoritmos.

## ¿Cómo?

En java

|||Ejemplo|
|-|-|-|
Declaración|Especificando el tipo de los elementos que contendrá, seguido de corchetes|```int[] miArray;```
Inicialización|Definiendo su tamaño |```miArray = new int[10];```
||Directamente con los elementos|```int[] miArray = {1, 2, 3, 4, 5};```
Acceso a elementos|Mediante índices. En Java, los índices comienzan en 0|```miArray[0]```<br> accede al primer elemento del array.
Modificación de elementos|Asignando un nuevo valor al índice correspondiente.|```miArray[0] = 100;```<br>cambia el primer elemento a 100.
Arrays multidimensionales|Se pueden crear arrays multidimensionales.|```int[][] matriz = new int[3][4];```<br>crea una matriz de 3 por 4.
Iteración|Se puede recorrer un array usando bucles, como for o while, para acceder o modificar sus elementos.

### Operador new

||Operador|Operandos|Devuelve|
|-|-|-|-|
**new**|unario prefijo|tipo de tabla|Dirección de memoria donde se ha reservado el espacio para dicha tabla

#### Tipo de tabla

|Tipo primitivo|Tipo estructurado/compuesto|
|-|-|
Number, string, boolean, undefined|Los propios arrays pudiendo construir arrays de arrays de tipos primitivos, tablas bidimensionales, …​ arrays de arrays de …​ de tipos primitivos, tablas n-dimensionales

### Tras la creación

|Tipo|Valor por defecto|
|-|-|
Número|0
Lógico|false
Caracter|\0
String|null

> Es altamente recomendado que el array se trate de una ***colección de elementos homogéneos, todos ellos del mismo tipo y de la misma naturaleza***: no combinar 5 contadores y un acumulador

> La dirección **null** es el valor de aquella dirección donde no hay valores

