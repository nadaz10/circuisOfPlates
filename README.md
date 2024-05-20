# circuisOfPlates


## Overview

Circuit of Plates is an engaging puzzle game implemented in Java using Object-Oriented Programming (OOP) principles. The game features multiple difficulty levels, employing design patterns such as Singleton for managing game states. Players connect plates in a circuit to complete levels of varying complexity.

## Features

- **Single-player Mode**: Play through various levels with increasing difficulty.
- **OOP Design**: Clean and modular code structure utilizing OOP principles.
- **Difficulty Levels**:
  - **Easy**: Simple circuits with fewer plates.
  - **Medium**: Moderately complex circuits.
  - **Hard**: Intricate circuits requiring advanced strategies.
- **GUI Interface**: Interactive and user-friendly game interface using JavaFX.
- **Undo Move**: Ability to undo the last move.

## Installation

To set up the Circuit of Plates game on your local machine, follow these steps:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/circuit-of-plates.git
    ```

2. **Navigate to the project directory**:
    ```bash
    cd circuit-of-plates
    ```

3. **Set up the project environment**:
    - Ensure you have Java Development Kit (JDK) installed (Java 8 or higher).
    - Ensure you have a build tool like Apache Maven or Gradle installed.

4. **Build and run the application**:
    - Using Maven:
        ```bash
        mvn clean install
        mvn exec:java -Dexec.mainClass="com.example.circuitofplates.CircuitOfPlatesGame"
        ```
    - Using Gradle:
        ```bash
        gradle build
        gradle run
        ```

## Usage

### GUI Interface

- **Main Menu**: Select the difficulty level and start a new game.
- **Game Board**: Click on plates to connect them and form a circuit.
- **Undo Button**: Undo the last move.
- **Restart Button**: Restart the game.

### Difficulty Levels

- **Easy**: Simple circuits with fewer plates, suitable for beginners.
- **Medium**: Moderately complex circuits, offering a moderate challenge.
- **Hard**: Intricate and challenging circuits, requiring strategic thinking.

## Code Structure

- **src/main/java**: Contains the Java source code.
  - **com.example.circuitofplates**: Main package containing core functionality.
    - **CircuitOfPlatesGame.java**: Main class to run the application.
    - **GameBoard.java**: Manages the game board state.
    - **Plate.java**: Represents a plate in the game.
    - **SingletonGameState.java**: Implements the Singleton pattern for game state management.
    - **Move.java**: Represents a move in the game.
- **src/main/resources**: Contains resources such as FXML files for the GUI.
  - **main.fxml**: Layout for the main game window.
  - **menu.fxml**: Layout for the main menu window.
  - **styles.css**: CSS styles for the game.



