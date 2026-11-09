# ProyectoFinalBiblio

Library management system built in Java (Swing + NetBeans) as the final
project for Fundamentos de Programación.

## What it does

- Catalog of bibliographic material (books and other media)
- Register new material
- Search the catalog
- Lend material and register returns
- Custom validation with its own exceptions (`DatosInvalidosException`,
  `MaterialNoEncontradoException`)

## Stack

- Java + Swing (NetBeans project)
- No external dependencies

## How to run it

1. Open the `ProyectoFinalBiblio` folder in NetBeans (or any IDE that
   reads `nbproject/`).
2. Build and run the project. The main window (`FrmVentana`) is the
   entry point.

## Project structure

- `src/Biblioteca.java` — core logic
- `src/Libro.java`, `src/MaterialBibliografico.java` — domain model
- `src/FrmAgregarMaterial.java`, `src/FrmBuscarMaterial.java`,
  `src/FrmPrestarMaterial.java`, `src/FrmDevolverMaterial.java` — UI forms
