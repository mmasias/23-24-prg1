# Java: Variables

## ¿Por qué?

|||
|-|-|
En el proceso de construcción de programas y aplicaciones, los desarrolladores se encuentran constantemente con la necesidad de almacenar temporalmente información, manipular datos y mantener un registro de ciertos valores durante la ejecución del programa.|Además, en la dinámica de la programación, se requiere una forma de mantener, pasar y manipular datos entre diferentes partes del código..

*Por ejemplo, podrían necesitar mantener un registro de la puntuación en un juego, el nombre de un usuario, los totales en una aplicación financiera, entre otros.*

Registrado esto, se puede necesitar realizar operaciones sobre datos, como sumas, restas o verificaciones de condiciones.

Por lo tanto, surge la necesidad de tener una manera estructurada y eficiente de manejar estos datos.

## ¿Qué?

Las variables son contenedores etiquetados utilizados para almacenar datos en un programa. Funcionan como cajas etiquetadas en un almacén, donde cada caja tiene un nombre único y puede contener un tipo específico de elemento. 

En el contexto de la programación, estas "cajas" pueden contener diferentes tipos de información, como números, caracteres, textos o incluso estructuras de datos más complejas. 

Las variables tienen un tipo asociado que determina la naturaleza del dato que pueden almacenar y las operaciones que se pueden realizar con ellas. Por lo tanto, al definir una variable, se le está diciendo al programa que reserve un espacio en la memoria para almacenar un valor, y este espacio puede ser accesado y modificado mediante un nombre que identifica a la variable.

## ¿Para qué?

La introducción de variables en la programación sirve como un primer paso crucial hacia la creación y manipulación de datos en un programa. 

| | |
|-|-|
CRUD de datos|Permite gestionar información relevante que será utilizada a lo largo del programa.
Facilitar la comprensión|Al darle un nombre descriptivo a una variable, se puede hacer el código más legible y fácil de entender, lo cual es fundamental para la colaboración y el mantenimiento del código a largo plazo.
Optimizar recursos|Las variables permiten una gestión eficiente de los recursos del sistema, ya que permiten reutilizar el espacio en memoria y evitar redundancias.

Este concepto se convierte en una base sobre la cual se construyen conceptos más avanzados y complejos de programación.

## ¿Cómo?

### Declaración de variables

<div align=center>

|Declaración|Tipo|Identificador|
|-|-|-|
|```int miOrden;```|int|miorden
|```double miCosto;```|double|miCosto
|```String miNombre;```|String|miNombre

</div>

#### Tipo

Define el espacio de memoria en el que se almacena el valor de la variable.

<div align=center>

|Tipos primitivos|
|-:|
|![](/imagenes/modelosUML/tiposPrimitivos.svg)|
|*Autor: Prof. Luis Fernández*

</div>

#### Identificador

- Es el nombre de la variable.
- ```[a-zA-Z_$][a-zA-z0-9_$]*```
  - Compuesto por letras, dígitos, _ (guión bajo) y $ (signo de dólar).
  - Ha de empezar por una letra.
  - No puede contener espacios.
- Sensible a mayúsculas/minúsculas.
- Empiezan por una letra minúscula.
- Por convención de código limpio, si el nombre está conformado por varias palabras, se utiliza [camel case](/documentos/nomenclaturas.md).
- No puede ser una **palabra reservada**. *(Una palabra reservada de un lenguaje es una palabra que tiene un significado gramatical especial para ese lenguaje y por tanto no puede ser utilizada como un identificador)*

> ***Nota***: ```[a-zA-Z_$][a-zA-z0-9_$]*``` es una [expresión regular](/documentos/expresionesRegulares.md) que resume formalmente los tres puntos mencionados (*compuesto por... ha de empezar por... No puede contener...*)

### Asignación de valores

Una vez declarada la variable, mediante el *operador de asignación*.

<div align=center>

|Asignación|Variable|Operador|Literal|
|-|-|:-:|-|
|```miOrden = 3;```|miorden|=|3
|```miCosto = 150.25;```|miCosto|=|150.25
|```miNombre = "Ricardo";```|miNombre|=|"Ricardo"

</div>

> ***Literal***: Representación de un valor en el código fuente.

[Literales de tipo String](literalesString.md)

<div align=center>

|||
|-|-|
```int a, b;```|Declaración
```a = 1234;```|Asignación
```b = 99;```|Asignación
```int c = 45;```|Declaración y asignación

</div>

### "Pequeñas" anécdotas sobre la asignación

<div align=center>

|Como sentencia|Como operador|
|-|-|
Asigna/actualiza/"iguala" a la variable identificada a la izquierda el resultado de la evaluación de la expresión (con restricción al tipo de la variable)|Devuelve el valor recién asignado a la variable
```x = 3 + 1;```|

|Comando|Respuesta|
|-|-|
```int x;```
```int y;```
```int z = -1;```
```x = y = z;```
```System.out.println(x)```|-1
```x = 0;```
```System.out.println(x);```|0
```x = x + 1;```
```System.out.println(x);```|1
```System.out.println(x + 1);```|2
```System.out.println(x);```|1
```System.out.println(x = x + 1);```|2
```System.out.println(x);```|2

</div>

> NOTA: **¡No se recomienda!**

### Operadores binarios

#### Valores numéricos: aritméticos

Operan sobre valores numéricos del mismo tipo, y devuelven un valor del tipo de los operandos (menos *byte*, *short* y *char*, que devuelven *int*)

<div align=center>

|Operador|Devuelve|
|:-:|-|
+|la suma dos expresiones.
-|la resta dos expresiones.
*|la multiplicación de dos expresiones.
/|la división de dos expresiones.
%|el resto de la división entera de dos expresiones.

</div>

#### String: concatenación

<div align=center>

|Operador|Devuelve|
|:-:|-|
+|otra cadena de caracteres con los primeros caracteres iguales al primer string y los últimos caracteres iguales a los del segundo string.

</div>

|||
|-|-|
"Programacion" + " 1"|"Programacion 1"
"Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"+<br>"Donec rhoncus sollicitudin enim vitae tempor.\n"+<br>"Nullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.\n"+<br>"..."|"Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br>Donec rhoncus sollicitudin enim vitae tempor.<br>Nullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.<br>..."

> ***Expresión***: Literal, variable o secuencia de operaciones entre literales y/o variables que produce un valor.

<div align=center>

|||
|:-:|:-:|
```3```|3
```"Hola"```|"Hola"
```3+2```|5
```"Hola" + " mundo"```|"Hola mundo"

</div>

### Funciones matemáticas

Utilizando la clase **Math**, y como complemento a los operadores, para extender las capacidades de cálculo que tenemos actualmente.

> ```Math.método(parámetros)```

<div align=center>

|Método|Descripción|Parámetros|Devuelve
|-|-|-|-
abs|Valor absoluto|Un valor de tipo int, long,float o double|Tipo de dato introducido
sqrt|Raíz cuadrada|Double|Double
pow|Potenciación|Base y exponente (Double)|Double
random|Aleatorio entre 0 y 1|Ninguno|Double

</div>

```java
double a = Math.pow(3,2);
double n = Math.random();
``````

### Declaración de constantes

- Anteponiendo la palabra reservada ```final`````` antes de la declaración de la variable.
- Por convención de código limpio, se escriben en mayúsculas y en snake case.

```java
final double GRAVEDAD = 9.8;
final double IVA_GENERAL = 0.21;
final double IVA_REDUCIDO = 0.1;
final double IVA_SUPERREDUCIDO = 0.05;
```

### Operadores relacionales

#### Para tipos numéricos

<div align=center>

```
<expresion> <operadorRelacional> <expresion>
```
</div>

Dados dos valores del mismo tipo numérico, devuelve un valor de tipo boolean correspondiente a la relación de cada operador según el orden de los números reales

<div align=center>

|Operador||
|:-:|-|
==|igualdad en valor
!=|desigualdad en valor
<|menor
<=|menor o igual
\>|mayor
\>=|mayor o igual

</div>

De acuerdo a esto, entonces:

<div align=center>

||Devuelve|
|:-:|:-:|
5 == 5|true
5 != 6|true
5 < 6|true
5 <= 5|true
5 > 4|true
5 >= 5|true

</div>

### El operador ternario

<div align=center>

```
<expresión> ? <expresión> : <expresión> 
```
</div>

El operador ternario evalua una expresión y devuelve la evaluación del segundo argumento si la evaluación del primer argumento resulta cierto o la evaluación del tercero argumento en caso contrario.

```java
final int MAYORIA_DE_EDAD = 18;
int edad = 20;
boolean mayorDeEdad = edad > MAYORIA_DE_EDAD ? true : false;
```

<!-- TODO: #2 extender la reflexión sobre los operadores -->
<!-- TODO: #3 extender la reflexión sobre la precedencia -->
### Operador paréntesis

El operador paréntesis devuelve la evaluación de la expresión anidada.

#### #2Think

<div align=center>

|||
|-|:-:|
```100/(2-1)```|¿100 o 49?
```4>=7 && (2==4 \|\| 5<6)```|¿false o true?
```100/(2/2)```|¿100 o 25?
```1-(1-1)```|¿1 o -1?
```5 * (4+4) * 2```|¿80 o 28?
```(5+4) / (4+2)```|¿1 u 8?

</div>