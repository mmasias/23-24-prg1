# Literales de tipo String

<div align=center>

```
['"][^'"]*['"]
```

</div>

Donde:

- Las comillas simples o compuestas de apertura y cierre deben ser iguales y distintas de cualquier caracter interior.
- Dentro de estas comillas puede ir:
  - Cualquier caracter [ASCII](https://cs.stanford.edu/people/miles/iso8859.html) (espacio, letras, dígitos, símbolos de puntuación, …​)
  - excluyendo aquellos no imprimibles (salto de línea, …​) o con significado (comienzo de cadena, …​) que deben precederse del caracter escape: \n, \t, …​ \", \', \" y \\,
  - \uXXXX para [caracteres de UTF-16 de Unicode](https://asecuritysite.com/coding/asc2)
  - \xXX para [caracteres de ASCII / ISO 8859-1 (Latin-1)](https://cs.stanford.edu/people/miles/iso8859.html)
  - \u{XXXXXX} para [caracteres de UTF-32](https://docs.microsoft.com/es-es/dotnet/api/system.text.encoding.utf32?view=net-6.0)
  - en todos los casos anteriores, X será un valor hexadecimal: 0, …​, 9, A, …​, F

## Ejemplos

|||
|-|-|
"cadena de caracteres con comillas dobles"| cadena de caracteres con comillas dobles
"cadena de caracteres con comillas dobles 'con comillas simples' dentro"| cadena de caracteres con comillas dobles 'con comillas simples' dentro
"cadena de caracteres\ncon salto de línea y \ttabulador| cadena de caracteres<br>con salto de línea y&nbsp;&nbsp;&nbsp;&nbsp;tabulador
"Qué \"incomodo\" usar comillas con 'quit'!!!"|Qué "incomodo" usar comillas con 'quit'!!!
" "|  
"1"|1
"123"| 123
"TRUE."| TRUE.
"false"| false
"Lorem ipsum dolor sit amet, consectetur adipiscing elit.\nDonec rhoncus sollicitudin enim vitae tempor.\nNullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.\n..."|Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br>Donec rhoncus sollicitudin enim vitae tempor.<br>Nullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.<br>...
"Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"+<br>"Donec rhoncus sollicitudin enim vitae tempor.\n"+<br>"Nullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.\n"+<br>"..."|Lorem ipsum dolor sit amet, consectetur adipiscing elit.<br>Donec rhoncus sollicitudin enim vitae tempor.<br>Nullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.<br>...