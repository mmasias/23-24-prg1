# Retos

Los retos se irán proponiendo, habitualmente luego de una disertación teórica. Cada uno tendrá sus reglas de resolución y serán de entrega individual, aunque se puede (y se anima) a trabajarlos en grupo.

|Reto|Salida por Consola|Variables|Entrada por Consola|Condicionales|Bucles|Tablas
|-|:-:|:-:|:-:|:-:|:-:|:-:|
[001 - Devolver cambio](001-DevolverCambio/README.md)|✅|✅|⬜|⬜|⬜|⬜
[002 - Devolver cambio extendido](002-DevolverCambio/README.md)|✅|✅|⬜|⬜|⬜|⬜

## Cómo entregar los retos

La entrega correcta de los retos es parte de la evaluación de los mismos.

1. Crear un fork del repositorio de la asignatura en su cuenta personal. 
1. Dentro de su fork crear su carpeta personal dentro de la carpeta de entrega.
1. Trabajar el reto.
1. Una vez concluido el reto, enviar un pull request (PR) al repositorio de la asignatura, asegurándose de hacerlo a la rama correspondiente.

**Muy importante**: antes de enviar el Pull Request, hay que asegurarse de sincronizar los contenidos de su fork de modo que contengan la versión más actual de repositorio de la asignatura además del reto trabajado
.

```mermaid
gitGraph
       commit id: "Contenido 1"
       commit id: "Contenido 2"
       commit id: "Contenido 3"
       commit id: "Contenido 4"
       commit id: "Contenido 5"
       branch Reto-001
       commit id: "Contenido 5@Reto001" type:HIGHLIGHT
       checkout main
       commit id: "Contenido 6"
       commit id: "Contenido 7"
       checkout Reto-001
       branch FORK_ALUMNO
       commit id: "Contenido 5@RepoAlumno"
       commit id: "AvanceAlumno"
       checkout main
       commit id: "Contenido 8"
       commit id: "Contenido 9"
       commit id: "Contenido 10"
       commit
       commit
       checkout Reto-001
       merge FORK_ALUMNO type:HIGHLIGHT tag:"Entrega"
       checkout main
       commit id: "Contenido 11"
       commit id: "Contenido 12"
```