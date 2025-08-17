package com.example;
// ABSTRACTION
// Abstract class representing a player in the game
// This class is extended by both human and AI players
// It defines the common properties and methods that all players will have

abstract class Player {
    protected char symbol;   // symbol used on board (X, O)
    protected String name;   // player's name

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // abstract method (different for human and AI)
    public abstract int[] makeMove(Board board);

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}