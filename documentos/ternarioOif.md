# ¿*if* u *operador ternario*?

## ¿Por qué?

La toma de decisiones es una parte fundamental en la programación. Nos encontramos con situaciones en las que necesitamos que nuestro código actúe de manera diferente según ciertas condiciones. Por ello, los lenguajes de programación, como Java, ofrecen estructuras para manejar estas decisiones.

## ¿Qué?

En Java, existen dos estructuras comúnmente utilizadas para manejar decisiones simples: el operador ternario (? :) y la instrucción if.

## ¿Para qué?

Ambas estructuras nos permiten elegir entre diferentes acciones o valores basados en una condición, pero tienen diferentes propósitos y aplicaciones:

- El operador ternario es útil cuando necesitamos decidir rápidamente entre dos valores en función de una condición, como asignar un valor a una variable o decidir qué valor devolver en un método.
- La instrucción if, por otro lado, es más versátil y se usa para controlar bloques de código más extensos, permitiendo una mayor flexibilidad y complejidad en las decisiones.

## ¿Cómo?

El operador ternario y el if tradicional en Java tienen diferentes propósitos y su elección depende del contexto específico en el que se estén usando.

<div align=center>

<table>
    <tr>
        <td>
            <pre>
int max = (a > b) ? a : b;
            </pre>
        </td>
        <td>
<pre>
int max;
if (a > b) {
    max = a;
} else {
    max = b;
}
</pre>
        </td>
    <tr>
</table>

</div>

La esencia de la diferencia entre if y el operador ternario radica en su propósito y forma de uso:

|Operador ternario|Instrucción if|
|-|-|
Es una **expresión**: Esto significa que siempre devuelve un valor.|Es una **sentencia**: No devuelve un valor por sí misma.
Compacto: Ideal para decisiones simples en una sola línea.|Flexible: Puede contener múltiples líneas de código y puede manejar casos más complejos y variados.
Solo para asignaciones o retornos: Su uso principal es para asignar un valor a una variable o devolver un valor en función de una condición.|Control de flujo más amplio: Puede usarse para controlar bloques más grandes de código, no solo asignaciones.

### Operador ternario (? :)

#### Ventajas

- Es más conciso para asignaciones simples basadas en condiciones.
- Puede hacer que el código sea más legible **si se utiliza adecuadamente**.

#### Desventajas

- Si se anidan múltiples operadores ternarios o se utilizan en condiciones complejas, puede hacer que el código sea difícil de leer.
- No puede manejar múltiples instrucciones en cada rama del ternario.

### Instrucción if

#### Ventajas

- Es más flexible que el operador ternario y puede manejar múltiples instrucciones dentro de cada bloque.
- Es más familiar y fácil de leer en condiciones complejas o cuando se requieren múltiples acciones.

#### Desventajas

- Puede ser más verboso para condiciones simples.

### ¿Cuándo usar cuál?

- El operador ternario viene bien para asignaciones simples y concisas basadas en condiciones.
- La instrucción if viene bien cuando se necesita realizar múltiples acciones basadas en una condición o cuando el código se vuelve difícil de leer con el operador ternario.
- Como en muchas decisiones de programación, la legibilidad y mantenibilidad del código son clave. Si el uso del operador ternario hace que el código más difícil de entender, se opta por el if tradicional. 
- Por otro lado, en situaciones simples, el operador ternario puede ser una forma elegante y concisa de expresar una condición.
