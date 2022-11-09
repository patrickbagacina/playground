# Adapter and Facade Pattern

This project is a Home Theater App using the Facade Pattern and a recreated version of Duck Simulator using Adapter Pattern.

## Benefits of [Adapter Pattern](https://refactoring.guru/design-patterns/adapter)

- Coverts the interface of a class into another interface that the client requires.
- Resolves compatibility issues between classes.

## Benefits of [Facade Pattern](https://refactoring.guru/design-patterns/facade)

- Provide a unified inteface to a set of interafaces in a subsystem.
- Simplifies the usage of multiple objects or classes in a single interface.

## Project Overview

- Home Theater App: Opens all appliances needed on a theater at once.
- Duck Simulator App: Creates instance of Ducks with flying and quacking abilities. Creates chicken as duck instance using Adapter.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/theater/*.java src/models/ducks/*.java src/*.java
```

2. Run the main class

```
java src/AdapterFacadeSimulator.java
```
