# Command Pattern

This project is a Home Automation App using the Command Pattern.

## Benefits of [Command Pattern](https://refactoring.guru/design-patterns/command)

- Encapsulates a request or a functionality as an object.
- The command object contains all information about the request to let the receiver know what actions should be done.

## Project Overview

- Creates a remote controller to turn on and off the home appliances.

## Pre-requisites

- Install [JDK](https://www.oracle.com/java/technologies/downloads/#jdk19-windows)

## Running the Application

1. Compile classes

```
javac -Xlint:all src/models/appliances/*.java src/models/commands/*.java src/models/*.java src/*.java
```

2. Run the main class

```
java src/HomeAutomationSimulator.java
```
