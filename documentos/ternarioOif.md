# ¿*if* u *operador ternario*?

El operador ternario y el if tradicional en Java tienen diferentes propósitos y su elección depende del contexto específico en el que se estén usando.

<table>
    <tr>
        <td width="50%">
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

## Operador ternario (? :)

### Ventajas

- Es más conciso para asignaciones simples basadas en condiciones.
- Puede hacer que el código sea más legible **si se utiliza adecuadamente**.

### Desventajas

- Si se anidan múltiples operadores ternarios o se utilizan en condiciones complejas, puede hacer que el código sea difícil de leer.
- No puede manejar múltiples instrucciones en cada rama del ternario.

## Instrucción if

### Ventajas

- Es más flexible que el operador ternario y puede manejar múltiples instrucciones dentro de cada bloque.
- Es más familiar y fácil de leer en condiciones complejas o cuando se requieren múltiples acciones.

### Desventajas

- Puede ser más verboso para condiciones simples.

## ¿Cuándo usar cuál?

- El operador ternario viene bien para asignaciones simples y concisas basadas en condiciones.
- La instrucción if viene bien cuando se necesita realizar múltiples acciones basadas en una condición o cuando el código se vuelve difícil de leer con el operador ternario.
- Como en muchas decisiones de programación, la legibilidad y mantenibilidad del código son clave. Si el uso del operador ternario hace que el código más difícil de entender, se opta por el if tradicional. 
- Por otro lado, en situaciones simples, el operador ternario puede ser una forma elegante y concisa de expresar una condición.
