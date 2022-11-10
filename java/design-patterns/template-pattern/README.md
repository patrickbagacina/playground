# Template Method Pattern

This project is a Coffee Barista Simulator using the Template Method Pattern.

## Benefits of [Template Method Pattern](https://refactoring.guru/design-patterns/template-method)

- Defines a method containing steps of algorithm deferring some steps to its subclasses.
- Subclasses of can manipulate the behavior or implementation of certain steps but cannot change the structure of the algorithm.
- It can add a hook() method as an optional method that can be implemented by subclasses to change behavior in the algorithm.

## Project Overview

- Create Coffee and Tea instances using template method to prepare each objects.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/*.java src/*.java
```

2. Run the main class

```
java src/CoffeeBaristaSimulator.java
```
