# Examen automático personalizado

Desarrolle el código necesario para implementar un sistema personalizado de evaluación
automática de tablas de multiplicar, de acuerdo a los siguientes requisitos:

Al iniciar el programa se le muestra al usuario un menú con tres opciones:

1. Configuración
2. Ejecución del Test
3. Salir del sistema.

Al elegir la opción 1, el usuario configurador debe elegir un primer factor entre el 2 y el 10,
para realizar la evaluación.

A continuación, debe elegir un nivel de dificultad: fácil, normal y avanzado.

- El nivel de dificultad fácil hace que el segundo factor vaya entre 1 y 6.
- El nivel de dificultad normal hace que el segundo factor vaya entre 1 y 10.
- El nivel de dificultad avanzado hace que el segundo factor vaya entre 4 y 10.

Al elegir la opción 2, y siempre y cuando se haya realizado la configuración en el punto 1, el test debe realizar 5 preguntas aleatorias de multiplicación, mostrando ambos factores y preguntando al usuario la respuesta a la pregunta.

Por cada pregunta acertada, el programa debe sumar 2 puntos. Por cada respuesta errónea, restar medio punto.

Al final de las cinco preguntas de debe mostrar la puntuación del usuario, indicando si está aprobado o no. Se considera aprobado cuando el puntaje es mayor que 5.

Luego de esto, el programa muestra nuevamente el menú principal.

## RETO 2

Extienda el programa anterior para que además de multiplicación el usuario al configurar pueda elegir entre evaluar las operaciones de suma o multiplicación

## RETO 3

Extienda el programa anterior para que el exista una opción extra de dificultad en la que las operaciones consultadas (suma o multiplicación) sean aleatorias.
