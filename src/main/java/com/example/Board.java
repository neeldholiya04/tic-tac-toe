package com.example;
// ENCAPSULATION

// Class representing the game board for Tic Tac Toe
// It contains methods to initialize the board, place moves, check for wins, and print the board.
// The board is represented as a 2D character array, where each cell can be ' ' ' (empty), 'X', or 'O'.
// The board size is fixed at 3x3 for a standard Tic Tac Toe game.
// This class is used by both human and AI players to interact with the game state.
// It provides methods to check if a player has won, if the board is full, and to print the current state of the board.

class Board {
    private char[][] grid;   // board grid
    private int size;        // board dimension (NxN)


    public Board() {
        this.size = 3;
        grid = new char[size][size];
        initializeBoard();
    }

    // initialize board with blanks
    private void initializeBoard() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                grid[i][j] = ' ';
    }

    // Try placing a symbol at a given position
    public boolean placeMove(int row, int col, char symbol) {
        if (row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == ' ') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    // Check if given symbol has won
    public boolean checkWin(char symbol) {
        for (int i = 0; i < size; i++) {
            if (checkRow(i, symbol) || checkCol(i, symbol)) return true;
        }
        return checkDiagonal(symbol) || checkAntiDiagonal(symbol);
    }

    private boolean checkRow(int row, char symbol) {
        for (int j = 0; j < size; j++)
            if (grid[row][j] != symbol) return false;
        return true;
    }

    private boolean checkCol(int col, char symbol) {
        for (int i = 0; i < size; i++)
            if (grid[i][col] != symbol) return false;
        return true;
    }

    private boolean checkDiagonal(char symbol) {
        for (int i = 0; i < size; i++)
            if (grid[i][i] != symbol) return false;
        return true;
    }

    private boolean checkAntiDiagonal(char symbol) {
        for (int i = 0; i < size; i++)
            if (grid[i][size - i - 1] != symbol) return false;
        return true;
    }

    // Check if board is full
    public boolean isFull() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (grid[i][j] == ' ') return false;
        return true;
    }

    // Print board in formatted way
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j]);
                if (j < size - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < size - 1) {
                for (int k = 0; k < size; k++) {
                    System.out.print("---");
                    if (k < size - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
    }
}