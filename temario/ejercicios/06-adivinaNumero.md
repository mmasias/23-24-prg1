# Adivina el número

## Reto base

Implementar el juego de *adivina el número que estoy pensando* sujeto a las siguientes reglas:

- El número debe estar entre 1 y 100.
- El usuario tiene cinco oportunidades para adivinar el número.
- El ordenador va dando pistas al usuario en caso de no adivinar el número.
  - La pista puede ser "es mayor" o "es menor"
- Si el usuario adivina, el ordenador nos dice en qué intento se ha adivinado.

## Retos extendidos

### Pistas avanzadas

Una pista avanzada puede ser: 

- Caliente, cuando la diferencia entre el número pensado y propuesto es menor o igual a 5
- Tibio, cuando la diferencia entre números es menor o igual a 10.
- Frio, si la diferencia es mayor de 10.

### Trampas

Agregue al algoritmo la posibilidad de *"hacer trampa"* si el usuario se acerca mucho al resultado (por ejemplo, si hace caliente dos veces seguidas). Haga que modifique el número pensado un valor aleatorio entre 1 y 5, sin exceder los límites de 1 y 100. 

> NOTA: El ordenador estornuda cuando hace trampa. ;)
