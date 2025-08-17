package com.example;

// Class representing the game logic for Tic Tac Toe
// It manages the game flow, including player turns, checking for wins or draws.
class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Player p1, Player p2) {
        this.board = new Board();
        this.player1 = p1;
        this.player2 = p2;
    }

    // method overloading
    public void start() {
        start(Integer.MAX_VALUE);
    }

    public void start(int maxMoves) {
        int moves = 0;
        Player current = player1;

        while (true) {
            board.printBoard();
            current.makeMove(board);
            moves++;

            // Check win
            if (board.checkWin(current.getSymbol())) {
                board.printBoard();
                System.out.println(current.getName() + " wins!");
                break;
            }
            // Check draw
            else if (board.isFull() || moves >= maxMoves) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // Switch turn
            current = (current == player1) ? player2 : player1;
        }
    }
}
