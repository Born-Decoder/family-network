# Family Network Management System

## Overview

This project implements a basic family network management system using Java. It includes functionalities to manage and visualize a network of individuals with their relationships such as parents, children, and spouses. 

The system consists of three primary classes:

- `Node`: Represents an individual in the network.
- `Network`: Manages a collection of `Node` instances and handles relationships between them.
- `Driver`: Demonstrates how to use the `Network` class to create and manipulate nodes and relationships.

## File Structure

The source files are organized as follows:

- `src/Node.java` - Defines the `Node` class.
- `src/Network.java` - Defines the `Network` class.
- `src/Driver.java` - Contains the `main` method for running the application.

## Class Descriptions

### `Node`

The `Node` class encapsulates an individual with the following attributes:

- `id`: Unique identifier for the node.
- `name`: Name of the individual.
- `location`: Location of the individual.
- `dob`: Date of birth.
- `gender`: Gender.
- `profession`: Profession.
- `parents`: List of parent IDs.
- `children`: List of child IDs.
- `spouses`: List of spouse IDs.

#### Methods

- **Getters and Setters**: Methods to access and modify the attributes.
- **Add/Remove Parents, Children, Spouses**: Methods to manage relationships.
- **Constructor**: Initializes a new `Node` with the given details.

### `Network`

The `Network` class manages a collection of `Node` instances and provides methods to:

- **addNode()**: Adds a new node to the network.
- **getNodeById()**: Retrieves a node by its ID.
- **modifyNode()**: Updates attributes of a node.
- **addChild()**: Adds a child to two parent nodes and updates the child's parent list.
- **removeChild()**: Removes a child from two parent nodes and updates the child's parent list.
- **addSpouse()**: Adds a spouse relationship between two nodes.
- **removeSpouse()**: Removes a spouse relationship between two nodes.
- **printGraph()**: Prints details of all nodes in the network.

### `Driver`

The `Driver` class contains the `main` method, which demonstrates:

- Creating a network instance.
- Adding nodes (individuals) to the network.
- Adding and removing relationships (spouses and children).
- Modifying node attributes.
- Printing the network's state at various stages.

## How to Run

1. **Compile the Java files**:

    ```sh
    javac src/Node.java src/Network.java src/Driver.java
    ```

2. **Run the `Driver` class**:

    ```sh
    java -cp src Driver
    ```

## Example Usage

The `Driver` class showcases the following operations:

- Creating individuals (`Alice`, `Bob`, `Charlie`, `Diana`).
- Establishing relationships (spouse and parent-child).
- Removing and modifying relationships.
- Displaying the network's state before and after modifications.

## Notes

- Each `Node` is uniquely identified by a randomly generated UUID.
- The `Network` class uses a `HashMap` to manage nodes, providing efficient access by node ID.

## Future Improvements

- Implement persistent storage for the network data.
- Add error handling and validation for operations.
- Create a user interface for easier interaction.

