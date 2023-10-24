# Whac-A-Mole

> [Definición extendida en Wikipedia](https://es.wikipedia.org/wiki/Whac-A-Mole)

Whac-A-Mole es un popular juego de arcade que consiste en un gabinete al nivel de la cintura con un área de juego y una pantalla de visualización, y un mazo grande, suave y negro. Tiene agujeros en la parte superior del área de juego que están llenos de pequeños monigotes de plástico que aparecen al azar. Los puntos se obtienen golpeando cada monigote tal como aparece. Cuanto más rápida sea la reacción, mayor será la puntuación. 

En Japón, Mole Buster (モグラ退治 mogura taiji) es un popular juego de arcade inventado en 1975 por Kazuo Yamada de TOGO, basado en diez de los bocetos a lápiz del diseñador de 1974, con licencia de Bandai en 1977. También se puede encontrar comúnmente en festivales japoneses. 

Supongamos una implementación del juego de acuerdo a las siguientes pautas:

<div align="center">

|Juego|Presentación sugerida 
|-|- 
|![](/imagenes/retoWhatcAMole001.png)|![](/imagenes/retoWhatcAMole.png)

</div>

El mundo consta de un número concreto de agujeros (por ejemplo, 16), en los que -en cada turno- puede aparecer un monigote. Este monigote aparece de manera aleatoria en uno de los agujeros.

Antes de cada turno, el jugador elige en qué agujero golpear.

Al momento del turno, se visualiza el resultado de la elección del jugador, pudiendo ser que acierte o no a golpear el agujero en el que aparece el topo. En ese caso, suma un acierto.

El jugador tiene 15 turnos. Al finalizar los turnos, el programa le muestra los aciertos.

## Reto

Implemente una versión visual del juego anteriormente indicado. Se sugiere utilizar la siguiente nomenclatura para la representación de los elementos del juego:

```java
Agujero                             (  )
Agujero con monigote                (‘’)
Agujero golpeado                    [[]]
Agujero con monigote, golpeado      [**]
```
## Retos extendidos

* Implemente dos monigotes.
* Agregue el código necesario para evitar que el monigote (o monigotes) aparezcan en el mismo agujero en dos jugadas. (Puede resolverlo para uno, si no ha resuelto el reto extendido anterior).
