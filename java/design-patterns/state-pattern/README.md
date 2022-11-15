# State Pattern

This project is a Gumball Machine Simulator using the State Pattern.

## Benefits of [State Pattern](https://refactoring.guru/design-patterns/state)

- Allows an object change their behaviors when its internal state changes.
- Allows an object to have many behaviors that are based on its internal state.
- Somewhat similar to Strategy Pattern.

## Project Overview

- A simulator of a Gumball machine that dispenses a gumball when a penny is inserted.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/states/*.java src/models/*.java src/*.java
```

2. Run the main class

```
java src/GumballMachineSimulator.java
```
