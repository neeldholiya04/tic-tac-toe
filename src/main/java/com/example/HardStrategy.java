package com.example;

class HardStrategy implements AIMoveStrategy {
    @Override
    public int[] computeMove(Board board, char symbol) {
        // TODO
        return new MediumStrategy().computeMove(board, symbol);
    }
}
