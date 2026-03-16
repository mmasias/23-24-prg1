<img src="../../imagenes/DALL·E-2023-10-23%2022.53.31-80s-themed-charcoal-drawing.png" width="40%" align="right"/>

# El guerrero vs el vampiro

## Reto base

Un guerrero -equipado con un hacha- se encuentra durante una travesía con un vampiro hostil e inician una lucha. El vampiro, aunque débil, es muy ágil y puede atacar mordiendo al guerrero con sus afilados dientes.

Desarrolle un algoritmo que simule y describa cada paso de esta batalla y finalmente diga quién ha ganado. Para simular la batalla, asuma que cada oponente da un golpe a la vez, y que la probabilidad de acertar con dicho golpe es del 50%.

A continuación, datos relevantes de ambos luchadores:

| | Guerrero | Vampiro |
|-|:-:|:-:|
|Poder:|20 HP|10 HP|
|Ataque:|2|4|
|% éxito|50%|50%

## Reto extendido

El Héroe y el Vampiro cuentan con una energía inicial de 150 y 60 puntos respectivamente.

El Héroe cuenta con tres armas que responden a las siguientes reglas:

| | Ataque | Probabilidad de éxito |
|-|:-:|:-:|
| Arma 1 | 7 | 50 % |
| Arma 2 | 15 | 25 % |
| Arma 3 | 30 | 12 % |

El Vampiro cuenta con tres ataques que responden a las siguientes reglas:

| | Ataque | Probabilidad de éxito |
|-|:-:|:-:|
| Ataque 1 | 5 | 90 % |
| Ataque 2 | 10 | 60 % |
| Ataque 3 | 20 | 40 % |

El usuario controla las acciones del Héroe, pudiendo elegir el arma en cada turno de batalla.

El programa controla las acciones del Vampiro, eligiendo aleatoriamente el ataque que realiza. Los tres ataques tienen la misma probabilidad de ser elegidos.

## Retos adicionales

### Reto adicional 1

Dote al Héroe de la capacidad de elegir defenderse del golpe. 

Si el Héroe elige defenderse, dicha defensa tiene una probabilidad de éxito del 80% y reduce el ataque del Vampiro en 5 puntos.

### Reto adicional 2

Extienda el programa anterior de modo que si la energía cae por debajo de un límite (30 puntos en el caso del Héroe, 20 puntos en el caso del Vampiro), el personaje se desmaya, perdiendo la capacidad de atacar y recuperando 2 puntos de energía por turno.

### Reto adicional 3

Extienda el programa anterior para dotar al Héroe de la posibilidad de beber una poción que le permita recuperar toda su energía. Para que esta poción haga efecto ha de pasar un tiempo de 3 turnos, durante los cuales el Héroe no puede ni atacar ni defenderse, aunque sí recibe ataques. Pasado el tiempo (si ha sobrevivido), el Héroe recupera su energía.
