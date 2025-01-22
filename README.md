# Wordlee
Java Wordle Game Logic: A simple Java implementation of the core logic for a Wordle-like game. It includes methods to verify letter matches and exact matches between user inputs and the answer.

# Wordle Game Logic in Java

This project implements the core logic for a Wordle-like game in Java. The logic checks user inputs against the correct answer and determines if the input letters are correct and in the correct position.

## Features

- **Match Exact Letter:** Checks if a specific letter is correct and in the exact position.
- **Match Letter:** Checks if a specific letter exists in the answer but is not necessarily in the correct position.

## Code Overview

1. **wordSize:** Stores the length of the answer word.
2. **answer:** A list of characters representing the correct answer (e.g., "water").
3. **Methods:**
   - `matchExactLetter(int i)`: Returns `true` if the letter at position `i` matches the corresponding letter in the answer.
   - `matchLetter(int i)`: Returns `true` if the letter at position `i` exists anywhere in the answer.

## How It Works

1. The `wordle_logic` constructor initializes the correct answer (`answer`) and its length (`wordSize`).
2. Each letter input by the user is retrieved via `wordle.tf.get(i).getText()` and compared against the answer using the methods:
   - `matchExactLetter(int i)`
   - `matchLetter(int i)`

## Prerequisites

- Java Development Kit (JDK)
- Basic understanding of ArrayLists and Java programming.

## Usage

1. Integrate this logic with a frontend component (e.g., `wordle.tf`) for user input handling.
2. Use the `matchExactLetter` and `matchLetter` methods to validate user guesses.

## Example Answer

The answer word for the game in this example is **"water"**.

## Future Enhancements

- Add dynamic answer word generation.
- Create a graphical user interface (GUI) for a better user experience.
- Expand logic for color-coded feedback, similar to the original Wordle game.

---

**Note:** This code is intended as a basic starting point for building a Wordle-like game and does not include user interface components.
