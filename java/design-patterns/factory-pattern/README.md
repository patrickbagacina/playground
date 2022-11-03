# Decorator Pattern

This project is a Pizza Store App using the Factory Pattern.

## Benefits of [Factory Pattern](https://refactoring.guru/design-patterns/abstract-factory)

- Encapsulates all codes for creating object instances to promote loosely coupled designs.
- Factory Method - relies on abstraction to create objects by overriding a factory method of a superclass.
- Abstract Factory - relies on composition and factory object to create a family of products.

## Project Overview

- Creates pizza object from different store types with their proper toppings and ingredients.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/**/*.java src/*.java
```

2. Run the main class

```
java src/PizzaStoreSimulator.java
```
