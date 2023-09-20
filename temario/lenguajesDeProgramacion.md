# Lenguajes de programación
<!-- TODO: #1 Enlace a ejemplos de lenguajes de programación -->

> *Ejemplos de [HelloWorldCollection](http://helloworldcollection.de/)*

## ¿Por qué?

- **Orígenes**: Los primeros ordenadores se programaban en lenguaje máquina, un código directamente entendible por las máquinas pero arduo para los humanos.
- **Evolución**: Con el tiempo, surgieron lenguajes de programación de alto nivel, como [FORTRAN](http://helloworldcollection.de/#Fortran) y [COBOL](http://helloworldcollection.de/#Fortran), que simplificaron el proceso. Aparecieron distintos paradigmas de programación: estructurado ([C](http://helloworldcollection.de/#C%C2%A0(ANSI))), orientado a objetos ([Smalltalk](http://helloworldcollection.de/#Smalltalk%C2%A0(simple)), [C++](http://helloworldcollection.de/#C++)), funcional ([LISP](http://helloworldcollection.de/#Lisp-Emacs), [Haskell](http://helloworldcollection.de/#Haskell)), entre otros.
- **Necesidad**: La creciente complejidad de los sistemas y aplicaciones demandó lenguajes más versátiles y fáciles de mantener, llevando a la evolución y creación de nuevos lenguajes y paradigmas.

<div align="center">

||
|:-:|
![](/imagenes/modelosUML/lenguajesProgramacion.svg)
Lenguajes de programación (*Autor: Prof. Luis Fernández*)

</div>

## ¿Qué?

- **Diversidad**: Actualmente, existe una amplia variedad de lenguajes adaptados a diferentes necesidades: desde desarrollo web, móvil, sistemas, juegos, análisis de datos, entre otros.
- **Paradigmas**: En el ámbito de la programación, existen varios paradigmas que hemos de ser capaces de entender y abordar si hace falta. Estos paradigmas ofrecen diferentes enfoques y técnicas para la construcción de software.
- **Tendencias Actuales**: El mundo del software está en constante cambio. La nube, la inteligencia artificial, el desarrollo móvil y web son áreas que siguen evolucionando y requieren lenguajes y herramientas adecuadas.

## ¿Para qué?

|Pedagogía|MundoReal™️|
|-|-|
Entender la programación es fundamental para cualquier ingeniero informático. No solo es una herramienta para crear software, sino una forma de estructurar el pensamiento, resolver problemas y entender el mundo digital que nos rodea.|Los lenguajes de programación son la base de muchas soluciones empresariales. Dominarlos abre puertas a una variedad de oportunidades laborales en desarrollo, investigación, análisis de datos, entre otras áreas.


## ¿Cómo?

|Teoría|Práctica|Colaboración
|-|-|-
Es esencial comprender las **bases y conceptos teóricos del lenguaje**. Se recomienda empezar por la sintaxis, conceptos básicos (variables, tipos de datos) y avanzar hacia conceptos más complejos (POO, estructuras de datos, algoritmos).|La programación es una **habilidad práctica**. Es crucial escribir código, resolver problemas y construir proyectos.|Fomentar el **trabajo en equipo y el aprendizaje colaborativo**. La revisión de código entre pares, el trabajo en proyectos grupales y la discusión de problemas y soluciones en grupo pueden ser herramientas poderosas para el aprendizaje.

### Clasificación 

#### Por nivel

<div align="center">

|Bajo nivel|Medio nivel|Alto nivel|
|-|-|-|
Enfocados a la máquina|Enfocados a la máquina y al desarrollador|Enfocados al desarrollador
|![](/imagenes/ensamblador.png)|![](/imagenes/c.jpg)|![](/imagenes/javascript.png)
código binario, [ensamblador](http://helloworldcollection.de/#Assembler%C2%A0(Win32)), ...​|[C](http://helloworldcollection.de/#C%C2%A0(ANSI)), [C++](http://helloworldcollection.de/#C++)), ...​|[Java](http://helloworldcollection.de/#Java), [Javascript](http://helloworldcollection.de/#JavaScript), [Scala](http://helloworldcollection.de/#Scala), [PHP](http://helloworldcollection.de/#PHP), [Basic](http://helloworldcollection.de/#BASIC), ...

</div>

#### Por el Sistema de Tipos

<div align="center">

|Fuertemente Tipados|Debilmente Tipados|Con Inferencia de Tipos
|:-:|:-:|:-:
fuerte|debil|inferencia
![](/imagenes/modelosUML/lenguajeTipoFuerte.svg)|![](/imagenes/modelosUML/lenguajeTipoDebil.svg)|![](/imagenes/modelosUML/lenguajeTipoInferencia.svg)
Java, …|Javascript, …​|[Typescript](http://helloworldcollection.de/#TypeScript), …​

</div>

#### Por la ejecución

<div align="center">

|Interpretado|Compilado|Híbrido
|:-:|:-:|:-:
|![](/imagenes/modelosUML/lenguajeEjecucionInterpretado.svg)|![](/imagenes/modelosUML/lenguajeEjecucionCompilado.svg)|![](/imagenes/modelosUML/lenguajeEjecucionHibrido.svg)
Javascript, Typescript, [Python](http://helloworldcollection.de/#Python%C2%A03)|C, C++|Java

|Lenguaje|Tiempo de desarrollo|Tiempo de ejecución|Portabilidad
|-|:-:|:-:|:-:
Interpretado|Bajo|Alto|Alta
Compilado|Alto|Bajo|Bajo
Híbrido|Medio|Medio|Alta

</div>

***Portabilidad***: facilidad de migración sobre otros sistemas operativos/ plataformas/ hardware, …​

### Paradigmas

Los paradigmas de programación describen diferentes enfoques o estilos para especificar *cómo* se debe resolver un problema.

#### Una clasificación

Orientados a Procesos, a Datos y a Objetos

<div align="center">

|Paradigma Orientado a Procesos|Paradigma Orientado a Datos|Paradigma Orientado a Objetos
|-|-|-|
Preponderancia de las operaciones sobre los datos|Preponderancia de los datos sobre las operaciones (1ª forma normal, 2ª forma normal, …​, Boyce-Codd)|Equilibrio entre datos y operaciones, conformando una clase de objetos reinstanciable
C, Pascal, …​|[SQL](http://helloworldcollection.de/#SQL), …​|Smalltalk, C++, Java, [CLOS](http://helloworldcollection.de/#Common%C2%A0Lisp), Python, …​

</div>

#### Otra clasificación & un esquema

Crear un esquema que relacione todos estos paradigmas puede ser un desafío debido a la naturaleza diversa y a veces superpuesta de estos enfoques. Sin embargo, se propone una estructura que puede ayudar a visualizar cómo estos paradigmas se relacionan y diferencian entre sí:

<div align="center">

![](/imagenes/modelosUML/paradigmas.svg)

</div>

Este esquema es una simplificación y hay muchos matices y superposiciones entre estos paradigmas en la práctica real. Además, algunos lenguajes de programación permiten utilizar múltiples paradigmas, lo que hace que las líneas entre ellos sean aún más borrosas. Sin embargo, el esquema ayuda a proporcionar una visión general de cómo se relacionan estos diferentes enfoques.

Algunas reflexiones:

- **Declarativo** vs. **Imperativo**: Son dos enfoques principales sobre cómo se especifican las soluciones a problemas. En el paradigma declarativo, le decimos al ordenador qué queremos lograr (por ejemplo, a través de funciones o relaciones). En el paradigma imperativo, le decimos al ordenador cómo hacerlo mediante instrucciones paso a paso.
- **Funcional** y **Lógico**: Son subcategorías del paradigma declarativo. Mientras que el funcional se basa en la evaluación de funciones, el lógico se basa en la definición y satisfacción de relaciones y reglas.
- **OOP** y **Concurrente**: Son subcategorías o estilos que pueden encontrarse dentro del paradigma imperativo (aunque la programación concurrente también puede tener características declarativas en algunos contextos). El OOP se centra en la estructuración de programas alrededor de objetos, mientras que el enfoque concurrente se concentra en la ejecución simultánea de tareas.
- **Orientado a Componentes**: Aunque estrechamente relacionado con OOP (por lo que se encuentra bajo él en el esquema), se centra en la construcción de software a partir de componentes reutilizables y autocontenidos.
- **Orientado a Eventos**: Es un enfoque diferente en el que el flujo de programas está determinado por eventos y sus respuestas. Puede incorporar elementos de varios de los otros paradigmas, pero su enfoque principal está en los eventos.
- **Orientado a Datos**: Se centra en cómo se estructuran y organizan los datos en el sistema. Es una subcategoría del paradigma declarativo porque a menudo implica definir estructuras de datos y luego declarar operaciones sobre esas estructuras sin especificar necesariamente un orden de ejecución.
- **Orientado a Procesos**: Enfocado en el flujo de trabajo y en cómo se procesa la información, es una subcategoría del paradigma imperativo. A diferencia de la programación orientada a objetos, que organiza el código alrededor de "objetos", la programación orientada a procesos organiza el código alrededor de "procesos" o funciones.

#### Comparativa entre Imperativo, funcional y lógico

||Imperativo|Funcional|Lógico|
|-|-|-|-|
**Enfoque**|El programador especifica *cómo* el programa debe lograr una tarea a través de una secuencia de comandos o instrucciones.|La computación se ve como la evaluación de funciones matemáticas y se evita el estado y los datos mutables.|El programador especifica *qué* necesita ser hecho, pero no *cómo*. El programa se compone de una serie de declaraciones y hechos, y el sistema de ejecución, a través de un proceso de inferencia, encuentra cómo llegar a la solución.
**Estado**|Central en este paradigma. Las variables almacenan y modifican estados, y los programas cambian estos estados a lo largo de su ejecución.|No hay "estado" en el sentido tradicional. Las funciones toman entradas y producen salidas sin efectos secundarios.|No se centra en el cambio de estado. En cambio, se basa en la satisfacción de condiciones y reglas.
**Ejemplo**|Los lenguajes como C, Pascal y FORTRAN se basan en el paradigma imperativo.|LISP, Haskell y Erlang son ejemplos de lenguajes funcionales.|Prolog es el lenguaje lógico más conocido.
**Características clave**|Uso de bucles, condicionales y asignaciones.|Funciones como ciudadanos de primera clase: pueden ser pasadas como argumentos, retornadas como valores y asignadas a variables.|Programas basados en la definición de relaciones y reglas.
||Flujo de control secuencial, con la posibilidad de ramificación y bucles.|Inmutabilidad: Una vez que se crea una estructura de datos, no se puede modificar.|Backtracking: El sistema intenta diferentes soluciones hasta encontrar una que cumpla todas las condiciones.
|||Uso extensivo de la recursión en lugar de bucles tradicionales.|Declarativo: Se centra en la descripción de la relación entre datos más que en el procedimiento específico para resolver un problema.
