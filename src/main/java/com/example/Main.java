package com.example;

import java.util.Scanner;

/*
    Encapsulation → Board has private grid, accessed via methods.

    Abstraction → Player is abstract with makeMove().

    Inheritance → HumanPlayer and AIPlayer extend Player.

    Polymorphism → Both override makeMove() differently.

    Overloading → Constructors in Board & Game, methods in Game.start().

    2 Players Only → Either Human vs Human or Human vs AI.
*/

// Main class to run the Tic Tac Toe game
// It initializes the game with two players, either human or AI.
// The game starts by prompting the players for their names and whether they want to play against an
// AI or another human player.
// This class is responsible for setting up the game environment and starting the game loop.
// It uses the Game class to manage the game flow and the Board class to represent the game state.
// The Main class is the entry point of the application, where the game is initialized and started.
// It handles user input for player names and whether to play against an AI or another human.
// It uses the Scanner class to read input from the console.
// The Main class is part of a simple Tic Tac Toe game implementation.
// It is designed to work with the Player, Board, and Game classes to create a complete
// game experience.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 2 human players
        System.out.print("Enter name for Player 1: ");
        Player p1 = new HumanPlayer(scanner.next(), 'X', scanner);

        System.out.print("Enter name for Player 2 (or type 'AI' for computer): ");
        String name2 = scanner.next();
        Player p2;
        if (name2.equalsIgnoreCase("AI")) {
            p2 = new AIPlayer("Computer", 'O');
        } else {
            p2 = new HumanPlayer(name2, 'O', scanner);
        }

        Game game = new Game(p1, p2);

        // Start game
        game.start();
    }
}