# Decorator Pattern

This project is a Cafe Shop App using the Decorator Pattern.

## Benefits of [Decorator Pattern](https://refactoring.guru/design-patterns/decorator)

- Extends the features of a class.
- Promotes Open-Close Principle: Classes must be open for extensions but closed for modifications.
- Decorators offer flexible way of adding additional functionalities to a class at runtime.

## Project Overview

- Computes a price of a coffee that may have dynamic condiments and sizes.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/beverages/*.java src/models/condiments/*.java src/*.java
```

2. Run the main class

```
java src/CafeShopSimulator.java
```
