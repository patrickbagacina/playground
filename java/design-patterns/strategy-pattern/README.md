# Strategy Pattern

This project is a Duck Simulator using the Strategy Pattern.

## Benefits of [Strategy Pattern](https://refactoring.guru/design-patterns/strategy)

- Make objects interchangeable
- Enforce has-a relationship
- Favors composition than inheritance

## Project Definition

- Creates instance of Duck objects with quacking and flying behaviors.
- Each behavior of Duck objects can be dynamically set on the fly.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/behaviors/*.java src/models/types/*.java src/models/*.java src/*.java
```

2. Run the main class

```
java src/DuckSimulator.java
```
