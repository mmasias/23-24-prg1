# Expresiones regulares

## ¿Por qué?

En programación y el procesamiento de textos es inevitable encontrarse con la necesidad de buscar, coincidir o extraer información específica de cadenas de texto. Los datos, ya sea que provengan de entradas del usuario, archivos, o la web, a menudo vienen en formatos inconsistentes o con información no deseada. También, en numerosas ocasiones, es necesario validar la estructura de las datos, como verificar si una cadena de texto se adhiere a un formato específico (por ejemplo, una dirección de correo electrónico).

Todas estas tareas se vuelven manejables y eficientes con el uso de Expresiones Regulares (*RegEx*).

## ¿Qué?

Las Expresiones Regulares son una potente herramienta para el manejo y procesamiento de textos. 

Son secuencias de caracteres que forman un patrón de búsqueda, que se pueden usar para la coincidencia de patrones, búsqueda, sustitución y edición de texto. Este patrón puede incluir caracteres ordinarios para coincidencias exactas o metacaracteres para coincidencias flexibles y complejas. A través de los patrones definidos en una expresión regular, se le está diciendo al programa cómo debe identificar las subcadenas de interés dentro de una cadena de texto más grande.

## ¿Para qué?

|||
|-|-|
|Búsqueda y coincidencia|Identificar si una cadena de texto contiene un patrón específico, lo que es útil para la validación de entradas y búsqueda de información.
|Extracción de información|Extraer subcadenas específicas de una cadena de texto más grande, lo que es crucial para el análisis y procesamiento de datos.
|Sustitución de texto|Reemplazar subcadenas dentro de una cadena de texto, facilitando la corrección y modificación de datos.
|División de texto|Separar una cadena de texto en partes basadas en un patrón, ayudando en el análisis y organización de datos.
|Validación de formato|Asegurar que una cadena de texto se adhiere a un formato específico, lo que es esencial para mantener la integridad y la calidad de los datos.

## ¿Cómo?

Las Expresiones Regulares se implementan mediante una sintaxis especial que permite definir patrones de coincidencia. A continuación, se presentan ejemplos genéricos de cómo se podrían utilizar las expresiones regulares para resolver ciertas tareas, junto con ejemplos de patrones y las cadenas de texto que coinciden con esos patrones.

- Definición del Patrón:
  - Se define un patrón utilizando una combinación de caracteres ordinarios y metacaracteres. Por ejemplo, el patrón ```abc``` coincidirá con cualquier cadena de texto que contenga la subcadena "abc".
- Búsqueda y Coincidencia:
  - Patrón: ```\d{3}```
  - Coincidencia: Cualquier cadena de texto que contenga una secuencia de tres dígitos como "123", "456", etc.
- Extracción de Información:
  - Patrón: ```(\d{3})-(\d{2})-(\d{4})```
  - Extracción: En una cadena de texto como "123-45-6789", se extraerían tres grupos: "123", "45", y "6789".
- Sustitución de Texto:
  - Patrón: ```\s+```
  - Sustitución: En una cadena de texto como "Hola Mundo", reemplazar todas las ocurrencias de uno o más espacios con un solo espacio.
- División de Texto:
  - Patrón: ```;```
  - División: En una cadena de texto como "manzana;banana;cereza", dividir la cadena en "manzana", "banana", y "cereza".
- Validación de Formato:
  - Patrón: ```^\w+@\w+\.\w+$```
  - Validación: Verificar si una cadena de texto sigue el formato de una dirección de correo electrónico básica como "nombre@dominio.com".

Las tareas mencionadas se realizan utilizando funciones o métodos proporcionados por la biblioteca o el lenguaje de programación en cuestión, que interpreta los patrones de expresiones regulares y aplica las operaciones deseadas sobre las cadenas de texto basándose en esos patrones.
