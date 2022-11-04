# Decorator Pattern

This project is a Chocolate Factory App using the Singleton Pattern.

## Benefits of [Singleton Pattern](https://refactoring.guru/design-patterns/singleton)

- Ensures that only one instance of an object is created on the whole application.
- Provides global access point for the instance of the class.
- One known disadvantage of this pattern is the multithreading. The app might have different state of the object instance.
- There ways to address this issue: use aggressive instantation or use synchronization techniques in Java (using syncronized or Synchronize(Java.class)).

## Project Overview

- Prepares a chocolate using a single chocolate boiler.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/*.java
```

2. Run the main class

```
java src/ChocolateFactorySimulator.java
```
