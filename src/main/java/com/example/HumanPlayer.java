package com.example;

import java.util.Scanner;
// ===== Inheritance & Polymorphism =====

// HumanPlayer class extends Player and implements the makeMove method for human input
// It prompts the user for input and validates the move on the board
// If the move is invalid, it keeps asking until a valid move is made
// This class is used to create a human player who can interactively play the game
// It uses a Scanner to read input from the console
// This class is part of a simple Tic Tac Toe game implementation
// It is designed to work with a Board class that manages the game state
// and a Player class that defines the common properties and methods for players
// The HumanPlayer class is used in conjunction with the Game class to manage the game flow
class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String name, char symbol, Scanner scanner) {
        super(name, symbol);
        this.scanner = scanner;
    }

    @Override
    public int[] makeMove(Board board) {
        int row, col;
        while (true) {
            System.out.print(name + " (" + symbol + ") enter row and column (0-based): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (board.placeMove(row, col, symbol)) {
                return new int[]{row, col};
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }
}
