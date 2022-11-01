# Observer Pattern

This project is a Weather Monitoring App using the Observer Pattern.

## Benefits of [Observer Pattern](https://refactoring.guru/design-patterns/observer)

- Promotes usage of one-to-many relationship
- Updates all observers when state changed in a subject
- Uses observer and observables

## Project Overview

- Updates Weather data of a subject then broadcasts changes to all observers to update the displayed data.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/subjects/*.java src/models/observers/*.java src/*.java
```

2. Run the main class

```
java src/WeatherSimulator.java
```
