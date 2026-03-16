# Reto CCCF

El centro comercial CF de El Alisal trabaja de 9 de la mañana a 9 de la noche vendiendo diversos artículos.

Un estudio previo determinó que la probabilidad de llegada de un cliente nuevo a la cola se estima en un 60% por minuto.

Para la gestión de la venta dispone de 4 cajas que van atendiendo a los clientes, que a su vez van situándose en fila conforme concluyen sus compras esperando una caja vacía que les atienda.

Cuando una caja está libre (es decir, no está atendiendo a ningún cliente), puede recibir a un nuevo cliente de la cola. Este cliente llevará su compra, la cual el estudio anteriormente citado midió en **packs de items**.

El usuario puede llevar un mínimo de 5 y un máximo de 15 pack de items para su atención.

Se tiene calculado que las cajas tardan 1 minuto en atender un pack de items.

|Escenario
|-|
|![](/imagenes/retoCCCF.png)

Desarrolle un programa que modele y simule el sistema explicado líneas arriba, teniendo en cuenta las condiciones indicadas.

## Reto base

Este programa debe ir mostrando los siguientes datos conforme avance el tiempo:

* Llegada de las personas
* Número de personas en cola
* El estado de atención de las cajas.

## Reto extendido

Extienda el programa anterior para que, al finalizar la jornada, presente un resumen con los siguientes datos:

* Número de minutos en que no hubo nadie en cola.
* Número de personas que estaban en cola al finalizar el día.
* Número de personas atendidas durante el día.
* Número de items vendidos en el día.

## Reto ampliado

Extienda el programa anterior para que soporte los siguientes supuestos:

* En caso que haya más de 15 personas en cola, agregue una persona más en caja, que atienda como mínimo a 5 personas (o mientras hayan más de 15 personas en cola).
* Agregue el rol de superadministrador del sistema, que permita encender o apagar cajas (suponga que puede gestionar hasta 6 cajas).

> Nota: Debido a su complejidad, se sugiere que los retos ampliados se resuelvan uno a la vez y que, dominados los conceptos, se integren en una única solución.

# Sugerencia de presentación

```bash
manuel@manuel-OptiPlex-7020:~/Documentos/miJava$ java TestParcial
MINUTO 1 - Llega 1 persona - En Cola: 0
Caja1:[13] | Caja2:[0] | Caja3:[0] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 2 - No llega nadie  - En Cola: 0
Caja1:[12] | Caja2:[0] | Caja3:[0] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 3 - Llega 1 persona - En Cola: 0
Caja1:[11] | Caja2:[6] | Caja3:[0] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 4 - Llega 1 persona - En Cola: 0
Caja1:[10] | Caja2:[5] | Caja3:[4] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 5 - No llega nadie  - En Cola: 0
Caja1:[9] | Caja2:[4] | Caja3:[3] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 6 - Llega 1 persona - En Cola: 0
Caja1:[8] | Caja2:[3] | Caja3:[2] | Caja4:[4]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 7 - Llega 1 persona - En Cola: 1
Caja1:[7] | Caja2:[2] | Caja3:[1] | Caja4:[3]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 8 - No llega nadie  - En Cola: 1
Caja1:[6] | Caja2:[1] | Caja3:[0] | Caja4:[2]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 9 - Llega 1 persona - En Cola: 1
Caja1:[5] | Caja2:[0] | Caja3:[7] | Caja4:[1]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 10 - No llega nadie  - En Cola: 0
Caja1:[4] | Caja2:[6] | Caja3:[6] | Caja4:[0]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 11 - Llega 1 persona - En Cola: 0
Caja1:[3] | Caja2:[5] | Caja3:[5] | Caja4:[4]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 12 - Llega 1 persona - En Cola: 1
Caja1:[2] | Caja2:[4] | Caja3:[4] | Caja4:[3]
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
MINUTO 720 - No llega nadie  - En Cola: 7
Caja1:[1] | Caja2:[4] | Caja3:[4] | Caja4:[2]
- - - - - - - - - - - - - - - - - - - - - - - - - - - -
RESUMEN
============================================================
Minutos con cola en cero  	  : 216
Personas en la cola al cierre : 7
Personas atendidas en el dia  : 295
Articulos vendidos en el dia  : 2684
============================================================
```
