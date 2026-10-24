# TESDA Java NC III

This repository contains Java programming exercises and challenge programs completed during TESDA Java Programming NC III training. The projects are organized by chapter and follow standard Java package naming conventions.

## Project Structure

```text
Tesda-Java-NC3/
├── .gitignore
├── README.md
├── .vscode/
│   └── settings.json
└── src/
    ├── challenges/
    │   └── Challenge*.java
    └── chapterN/
        └── taskNN/
            └── *.java
```

The `chapterN/taskNN` pattern groups each numbered task within its chapter. Some tasks contain supporting classes alongside the main task class.

VS Code is configured to use `src/` as the source directory and `bin/` as the compiler output directory. The `.gitignore` excludes `bin/` and all `*.class` files, so generated build output is not tracked.

## Running Programs

The task and challenge programs can be run independently using their main classes.

### Using VS Code

Open a program's main class in VS Code and run it with the Run button above `main()`. Compiled files are generated under `bin/`.

### Using the Terminal

From the project root, compile and run a file like this:

```bash
javac -d bin src/chapter1/task01/Task1.java
java -cp bin chapter1.task01.Task1
```

Run a challenge program with:

```bash
javac -d bin src/challenges/Challenge1.java
java -cp bin challenges.Challenge1
```

Replace the file path and class name as needed.

## Requirements

- Java JDK 17 or newer
- VS Code (recommended)
- Java Extension Pack for VS Code (recommended)