

### Condición simple

Evaluar una condición y ejecuta el bloque de código solo si esa condición es verdadera.

![](/imagenes/modelosUML/alternativas001.svg)

```java
if (condicion) 
    // Código o bloque de código que se ejecuta si la condición es verdadera
```

### Condición con alternativa

Evalua una condición y ofrece un segundo bloque de código como alternativo, si la condición resulta ser falsa.

![](/imagenes/modelosUML/alternativas002.svg)

```java
if (condicion) 
    // Código o bloque de código que se ejecuta si la condición es verdadera
else 
    // Código o bloque de código que se ejecuta si la condición es falsa
```

### Condiciones anidadas

Evalua múltiples condiciones en cadena y decide qué bloque de código ejecutar basado en la primera condición verdadera. Adicionalmente, se puede proponer un bloque de código a ejecutarse si ninguna condición resulta ser verdadera.

![](/imagenes/modelosUML/alternativas003.svg)

```java
if (condicion1) 
    // Código o bloque de código para condicion1
else if (condicion2) 
    // Código o bloque de código para condicion2
else 
    // Código o bloque de código si ninguna de las condiciones anteriores es verdadera
```
