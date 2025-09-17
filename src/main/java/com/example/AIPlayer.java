package com.example;

// ===== Inheritance & Polymorphism =====
class AIPlayer extends Player {
    private AIMoveStrategy strategy;

    public AIPlayer(String name, char symbol, AIMoveStrategy strategy) {
        super(name, symbol);
        this.strategy = strategy;
    }

    @Override
    public int[] makeMove(Board board) {
        int[] move = strategy.computeMove(board, symbol);
        System.out.println(name + " placed at (" + move[0] + "," + move[1] + ")");
        return move;
    }
}