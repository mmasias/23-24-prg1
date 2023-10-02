# Carpeta de entregas

- Nada fuera de esta carpeta
- Las subcarpetas deben seguir el estándar *apellidoNombre*
- Las entregas, a la rama del reto adecuado.

## Acerca de la entrega de los retos

La entrega correcta de los retos es parte de la evaluación de los mismos.

- Crear un fork del repositorio de la asignatura en su cuenta personal. 
- Dentro de su fork, crear su carpeta personal dentro de la carpeta de entrega.
- Para cada reto:
  - Crear la carpeta del reto
  - Trabajar el reto.
  - Una vez concluido, enviar un pull request (PR) al repositorio de la asignatura, asegurándose de hacerlo a la rama del reto correspondiente.

---

```mermaid
    gitGraph
    commit id: "Contenido 1"
    commit id: "Contenido 2"
    commit id: "Contenido 3"
    commit id: "Contenido 4"
    commit id: "Contenido 5"
    branch Reto-001
    branch FORK_ALUMNO
    commit id: "Contenido 5@RepoAlumno"
    commit id: "AvanceAlumno"
    checkout main
    commit id: "Contenido 8"
    commit id: "Contenido 9"
    commit id: "Contenido 10"
    commit
    branch Reto-002
    checkout FORK_ALUMNO
    commit id: "AvanceAlumno+"
    commit id: "AvanceAlumno++"
    checkout Reto-001
    merge FORK_ALUMNO type:HIGHLIGHT tag:"Entrega Reto-001"
    checkout FORK_ALUMNO
    commit id: "AvanceAlumno+++"
    commit id: "AvanceAlumno++++"
    checkout Reto-002
    merge FORK_ALUMNO type:HIGHLIGHT tag:"Entrega Reto-002"
    checkout main
    commit id: "Contenido 11"
    commit id: "Contenido 12"
```

---

**Muy importante**: antes de enviar el Pull Request, hay que asegurarse de sincronizar los contenidos de su fork de modo que contengan la versión más actual de repositorio de la asignatura además del reto trabajado.