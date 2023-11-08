# Métodos estáticos

## ¿Por qué?

En los primeros pasos de la programación, es fundamental comprender cómo realizar tareas comunes y repetitivas de manera eficiente. Los métodos estáticos en Java surgen como una solución para evitar repetir código y organizarlo de manera lógica, incluso antes de adentrarse en la programación orientada a objetos.

## ¿Qué?

Un método estático es una función que puede ser llamada sin la necesidad de crear una instancia de una clase. En Java, estas funciones se definen dentro de clases, pero su uso está permitido sin necesidad de utilizar objetos, lo cual es particularmente útil en el paradigma de programación estructurada.

## ¿Para qué?

Los métodos estáticos se utilizan para:

- Realizar operaciones generales que no dependen del estado de un objeto.
- Agrupar funciones lógicas que están relacionadas entre sí (por ejemplo, operaciones matemáticas).
- Proporcionar una manera de organizar el código que sea fácil de entender y de reutilizar en diferentes partes del programa.

## ¿Cómo?

### Declaración

```java
class UnaClase {

    // CÓDIGO de la clase UnaClase

    public static void unMetodo() {
        // CODIGO DEL MÉTODO unMetodo()
    }

    // MÁS CÓDIGO de la clase UnaClase

}
```

### Uso

```java
class UnaClase {

    public static void main(String[] args){

        // CÓDIGO DEL MÉTODO main

        unMetodo();

        // MAS CÓDIGO DEL MÉTODO main

    }

    public static void unMetodo() {
        // CÓDIGO DEL MÉTODO unMetodo()
    }

    // MÁS CÓDIGO de la clase UnaClase

}
```

### "Conversación"

||||
|-|-|-|
![](/imagenes/modelosUML/metodosEstaticos000.svg)|![](/imagenes/modelosUML/metodosEstaticos001.svg)|![](/imagenes/modelosUML/metodosEstaticos002.svg)|