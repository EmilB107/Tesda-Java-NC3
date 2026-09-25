# TESDA Java NC III

A collection of Java programming exercises and activities completed during my TESDA Java Programming NC III training.

## Project Structure

```text
Tesda-Java-NC3/
├── .gitignore
├── README.md
├── .vscode/
│   ├── settings.json
│   └── launch.json
└── src/
    └── chapter1/
        ├── task01/
        │   └── Task1.java
        ├── task02/
        │   └── Task2.java
        └── ...
```

### Organization

* `.vscode/settings.json` — Configures the Java source and output directories for VS Code.
* `.vscode/launch.json` — Contains the VS Code Run/Debug configuration.
* `src/` — Contains the Java source code.
* `chapter1/`, `chapter2/`, etc. — Organize exercises by chapter.
* `task01/`, `task02/`, etc. — Organize individual exercises within each chapter.
* `Task1.java`, `Task2.java`, etc. — Java files containing the code for each exercise.

Task numbering is sequential across chapters, from **Task 1 through Task 15**.

Each exercise is an independent Java program and uses a package corresponding to its directory.

## Running the Exercises

Each exercise is an independent Java program with its own `main()` method.

### Using VS Code

The project is configured to use:

* `src/` as the Java source directory
* `bin/` as the compiled output directory

Open an exercise in VS Code and use the **Run** or **Debug** button above the `main()` method.

VS Code will compile the Java file automatically and place the generated `.class` files in `bin/`.

The `bin/` directory is generated locally and is excluded from Git.

### Using the Terminal

From the project root, compile and run an exercise with:

```bash
javac -d bin src/chapter1/task01/Task1.java
java -cp bin chapter1.task01.Task1
```

Replace the chapter, task, and class name as needed.

## Requirements

* Java 25 LTS
* VS Code (recommended)
* Extension Pack for Java (recommended when using VS Code)