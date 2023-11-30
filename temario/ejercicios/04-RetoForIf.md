# retoForIf

El retoForIf consiste en **obtener cada uno de los 21 patrones** de imágenes planteados en 
[esta hoja de cálculo](https://docs.google.com/spreadsheets/d/1r7Sn8z3HDpUO8PPNc_eL3pTRCEHZ1gl8ybdL6D6aSLw/edit?usp=sharing), utilizando dos bucles for anidados y un conjunto de condiciones que relacionen lógicamente las variables que controlan estos bucles.

|Planteado|Solución
|-|-
|![reto forIf](/imagenes/retoForIfHojaDeCalculo.png)|![reto forIf](/imagenes/retoForIf.png)

# Plantilla

Debajo se alcanza la plantilla que se ha de utilizar para desarrollar el reto. Lo que hay que editar para conseguir los patrones solicitados es el código que se encuentra entre los comentarios.

```java
class RetoForIf {
    public static void main(String[] args) {

        int dimension = 21;

        for (int j = 1; j <= dimension; j = j + 1) {
            for (int i = 1; i <= dimension; i = i + 1) {

                if (
                // El código desde aqui
                    i==2 && j==2
                // El código hasta aquí
                ) {
                    System.out.print("(*)");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}
```
