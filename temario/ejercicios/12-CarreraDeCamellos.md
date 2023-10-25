# Carrera de camellos

En las ferias se desarrollan, entre otros divertimentos, juegos de carrera de camellos que básicamente consisten en camellos "controlados" por los jugadores, los cuales van avanzando según se acierte a embocar una pelota en un agujero.

<div align=center>

|Carrera
|-
|![](/imagenes/ShimmeringTinyArrowana-size_restricted.gif)

</div>

## Reto base

Desarrolle un programa que simule esta carrera, atendiendo las siguientes reglas:

1. En cada turno, el jugador elige un agujero al cual lanzar la pelota.
1. En función a tabla indicaba debajo, se calcula la probabilidad de acierto. Si el jugador acierta, avanza el número de casillas indicado.
1. El jugador inicia en la casilla 0
1. El juego termina cuando el jugador llega a la casilla 60
1. El juego lleva un conteo del número de turnos empleado

<div align=center>

|Agujero|Probabilidad de acierto|Avance del camello
|:-:|:-:|:-:
|1|60 %|1
|2|40 %|2
|3|30 %|4
|4|10 %|6

</div>

### Jugador al inicio

```
---+-----------+---------+---------+---------+---------+-----------+
---| 0.........1.........2.........3.........4.........5.........6 |
---| 0123456789012345678901234567890123456789012345678901234567890 |
---+-----------+---------+---------+---------+---------+-----------+
[J]| ;--;'
---+-----------+---------+---------+---------+---------+-----------+
Turno 0
Elija un agujero: 
```

### Jugador en la posición 27

```
---+-----------+---------+---------+---------+---------+-----------+
---| 0.........1.........2.........3.........4.........5.........6 |
---| 0123456789012345678901234567890123456789012345678901234567890 |
---+-----------+---------+---------+---------+---------+-----------+
[J]|                            ;--;'
---+-----------+---------+---------+---------+---------+-----------+
Turno 12 - Avanza 3 casillas - Esta en la casilla 27
Elija un agujero: 
```

### Jugador en la posición 27 y sin acertar

```
---+-----------+---------+---------+---------+---------+-----------+
---| 0.........1.........2.........3.........4.........5.........6 |
---| 0123456789012345678901234567890123456789012345678901234567890 |
---+-----------+---------+---------+---------+---------+-----------+
[J]|                            ;--;'
---+-----------+---------+---------+---------+---------+-----------+
Turno 13 - No avanza ninguna casilla - Esta en la casilla 27
Elija un agujero: 
```

### Jugador al final

```
---+-----------+---------+---------+---------+---------+-----------+
---| 0.........1.........2.........3.........4.........5.........6 |
---| 0123456789012345678901234567890123456789012345678901234567890 |
---+-----------+---------+---------+---------+---------+-----------+
[J]|                                                             ;--;'
---+-----------+---------+---------+---------+---------+-----------+
Turno 12 - Avanza 2 casillas - Esta en la casilla 60
El juego ha terminado
```

## Retos extendidos

- Extienda el juego para que controle los fallos del jugador: si el jugador no acierta a embocar la pelota tres veces seguidas, vuelve a la posición cero.
- Extienda el juego para que exista la probabilidad que el camello tropiece (10%): si ocurre esto, el jugador no avanza en ese turno y además pierde 2 turnos. (No hace falta graficar el escenario durante los dos turnos que pierde el jugador).
- Extienda el juego para que el juego tenga un máximo de 50 turnos.

## Reto ampliado

Amplíe el juego para que intervenga otro caballo gobernado por el ordenador. El caballo del ordenador puede moverse aleatoriamente 1, 2 o 3 casillas por turno y, como es el ordenador, no falla en embocar la pelota, ni se cae. Y en caso haya resuelto el reto extendido de los turnos, se le pueden agotar los turnos al igual que el jugador.

### Jugador en la posición 27, ordenador en la posición 25

```
---+-----------+---------+---------+---------+---------+-----------+
---| 0.........1.........2.........3.........4.........5.........6 |
---| 0123456789012345678901234567890123456789012345678901234567890 |
---+-----------+---------+---------+---------+---------+-----------+
[J]|                            ;--;'
---+-----------+---------+---------+---------+---------+-----------+
[O]|                          ;--;'
---+-----------+---------+---------+---------+---------+-----------+
Turno 12 - Avanza 2 casillas - Esta en la casilla 27
El ordenador avanza 3 casillas - Esta en la casilla 25
Elija un agujero:
```