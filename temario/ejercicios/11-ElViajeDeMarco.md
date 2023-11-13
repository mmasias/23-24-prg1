# El viaje de Marco

## Introducción

> *Marco, de los Apeninos a los Andes* es un relato breve de ficción incluido por Edmundo de Amicis en su novela Corazón, publicada en 1886. Narra la historia del extenso y complicado viaje de un niño de trece años, Marco, desde Italia hacia Argentina, en busca de su madre, que había emigrado a aquel país sudamericano dos años antes. [Fuente: Wikipedia](https://es.wikipedia.org/wiki/Marco,_de_los_Apeninos_a_los_Andes)

En Génova, al norte de Italia, reside una familia con dos hijos de dieciocho y once años. La madre se ve obligada a marchar a Argentina para encontrar trabajo sirviendo en una casa. Durante un tiempo la familia recibe, por escrito, noticias de la madre, pero al cabo de un año las cartas cesan, luego de una en la que se daba cuenta de problemas de salud, con lo que se crea una situación de preocupación e incertidumbre. 

Tras tratar de conseguir noticias a través del Consulado italiano en Buenos Aires, a los dos años de la partida de la madre, el más pequeño de los dos hijos, Marco, decide afrontar, salvando las iniciales reticencias de su padre, el largo viaje de veintisiete días que entonces debían sufrir los emigrantes a bordo de grandes buques mercantes.

A su llegada a la capital argentina no consigue encontrar a su madre, pues la familia para la que trabaja ha trasladado su residencia a Córdoba. Tras pasar una noche en Buenos Aires, Marco inicia el recorrido... 

## Problema

Marco inicia la búsqueda andando a paso firme y ansioso por encontrar a su madre. La velocidad del chaval –en promedio diario- es de 10 a 15 Km/h (teniendo en cuenta que a ratos corre, a otros ratos trota y a otros camina), y que realiza de 8 a 10 horas de trayecto.

El camino en sí tiene pocos inconvenientes –además del caminar, claro está-, aunque existe la probabilidad de lluvia. Hay un 10% de probabilidad de lluvia fuerte (en cuyo caso la velocidad de Marco se reduce al 25%) y un 30% de probabilidad de lluvia normal (en cuyo caso la velocidad se reduce en un 25%). El restante 60% de probabilidad le corresponde a un buen clima.

Y, por supuesto, Marco viaja con su mono Amedio, quien le hace de buena compañía. Sin embargo, Amedio, mono al fin, tiene días mejores y peores: en algunos se cansa y Marco tiene que llevarlo en brazos (lo que reduce su velocidad en un 10%) y otros días –¡los peores!- se escapa, lo que obliga a Marco a correr en su búsqueda, perdiendo dos valiosas horas de recorrido.  La probabilidad que Amedio se escape es del 15%, y de que se canse es del 25%. Desafortunadamente para Marco es posible que en un mismo día el mono se escape y se canse.

Por su parte, la madre –que inicialmente está a 350 kilometros de Marco- recorre Argentina en un carruaje tirado por caballos, avanzando 80 kilómetros cada día…  

Escriba un programa que nos permita hacer el seguimiento de las peripecias de Marco, y nos diga –finalmente- en cuantos días Marco encuentra a su madre.

### Extensión 1

Extienda el programa anterior para que la madre, en lugar de avanzar 80 kilómetros por día, recorra el camino a una velocidad de 6 a 9 km/h al día, haciendo tramos de entre 6 a 9 horas de trayecto por día. Durante el trayecto, cada día, debido a lo irregular del clima, hay un 60% de probabilidad de buen tiempo, un 30% de probabilidad de lluvia y un 10% de probabilidad de lluvia muy fuerte. Si llueve, la velocidad del carruaje se ve disminuida en un 25% y si llueve muy fuerte, el carruaje ve disminuida su velocidad en un 50%. 

### Extensión 2

Extienda el programa anterior para que contemple que si al final del día la distancia entre la madre y Marco es menor a 50 km, existe el 50% de probabilidad que Marco encuentre alguien que le diga que ha visto a su madre, lo que le emocionaría y rompería a correr –sin importar el clima, el cansancio ni el mono- 25 kilómetros adicionales a lo avanzado ese día.

## Sugerencia de presentación

```
DIARIO DEL VIAJE DE MARCO
=========================
DIA 1
¡Ha llovido muchísimo!
Avance 8.19 horas a 2.94 Km/h recorriendo 24.09 Km
A mamá le ha hecho un buen día
Mama pudo avanzar 7.22 horas a 8.02 Km/h recorriendo 58.01 Km
Al final del día 1 la distancia entre Marco y su Madre es de 383.92 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
DIA 2
Ha hecho un buen día
Avance 9.88 horas a 12.46 Km/h recorriendo 123.19 Km
A mamá le ha hecho un buen día
Mama pudo avanzar 8.66 horas a 8.46 Km/h recorriendo 73.39 Km
Al final del día 2 la distancia entre Marco y su Madre es de 334.12 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
DIA 3
Ha hecho un buen día
¡He perdido tiempo buscando a Amedio!
Avance 6.97 horas a 13.53 Km/h recorriendo 94.37 Km
A mamá le ha hecho un buen día
Mama pudo avanzar 6.04 horas a 8.34 Km/h recorriendo 50.43 Km
Al final del día 3 la distancia entre Marco y su Madre es de 290.18 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
DIA 4
Ha llovido un poco
Avance 8.92 horas a 11.07 Km/h recorriendo 98.81 Km
A mamá le ha llovido un poco
Mama pudo avanzar 6.34 horas a 5.85 Km/h recorriendo 37.14 Km
Al final del día 4 la distancia entre Marco y su Madre es de 228.50 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
DIA 5
Ha hecho un buen día
Avance 9.83 horas a 12.17 Km/h recorriendo 119.66 Km
A mamá le ha hecho un buen día
Mama pudo avanzar 7.14 horas a 6.08 Km/h recorriendo 43.46 Km
Al final del día 5 la distancia entre Marco y su Madre es de 152.30 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
DIA 6
Ha hecho un buen día
Avance 9.64 horas a 10.63 Km/h recorriendo 102.53 Km
A mamá le ha hecho un buen día
Mama pudo avanzar 7.06 horas a 6.31 Km/h recorriendo 44.66 Km
Al final del día 6 la distancia entre Marco y su Madre es de 94.43 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
DIA 7
Ha hecho un buen día
Avance 9.60 horas a 12.52 Km/h recorriendo 120.32 Km
A mamá le ha llovido un poco
Mama pudo avanzar 7.22 horas a 6.16 Km/h recorriendo 44.52 Km
Al final del día 7 la distancia entre Marco y su Madre es de 18.63 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
DIA 8
Ha hecho un buen día
Avance 8.98 horas a 14.53 Km/h recorriendo 130.57 Km
A mamá le ha hecho un buen día
Mama pudo avanzar 8.13 horas a 7.87 Km/h recorriendo 64.00 Km
A Marco le dicen que han visto a su mamá, y rompe a correr!!!
************************************************************
Al final del día 8 Marco encuentra a su madre!!!
************************************************************
```
