package com.example;

// Class representing the game logic for Tic Tac Toe
// It manages the game flow, including player turns, checking for wins or draws.
class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private GameRules rules;

    public Game(Player p1, Player p2, GameRules rules) {
        this.board = new Board();
        this.player1 = p1;
        this.player2 = p2;
        this.rules = rules;
    }

    public void start() {
        int moves = 0;
        Player current = player1;

        while (true) {
            board.printBoard();
            current.makeMove(board);
            moves++;

            if (rules.isWinningMove(board, current)) {
                board.printBoard();
                System.out.println(current.getName() + " wins!");
                break;
            } else if (rules.isDraw(board, moves, rules.getMaxMoves())) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            current = (current == player1) ? player2 : player1;
        }
    }
}
