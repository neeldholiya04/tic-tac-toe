package com.example;

// ===== Inheritance & Polymorphism =====
class AIPlayer extends Player {
    public AIPlayer(String name, char symbol) {
        super(name, symbol);
    }

    // Abstract method implementation for AI player
    @Override
    public int[] makeMove(Board board) {
        // simple AI → picks the first empty cell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.placeMove(i, j, symbol)) {
                    System.out.println(name + " placed at (" + i + "," + j + ")");
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}