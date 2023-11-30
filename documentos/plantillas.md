# Plantillas

## Plantilla básica de una clase en Java

```java
class NombreDeClase {
    public static void main(String[] args) {

    }
} 
```

## Plantilla básica, incluyendo la clase Scanner

```java
import java.util.Scanner;

class NombreDeClase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    }
}
```
## Otras plantillas

En la forma de diversos [casos de uso](casosDeUso/README.md), para ser usados con criterio.

## Algunos métodos estáticos

### Limpiar pantalla

```java
    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
```

### Hacer una pausa

Introduce una pausa en el programa (para poder ver mejor la pantalla). La pausa se especifica en segundos

Por ejemplo, una pausa de 3 segundos sería: ```pause(3);```

```java
    static void pause(int segundos) {
        try {
            Thread.sleep(1000 * segundos);
        } catch (InterruptedException e) {
        }
    }
```