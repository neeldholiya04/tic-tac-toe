package com.example;

class EasyStrategy implements AIMoveStrategy {
    @Override
    public int[] computeMove(Board board, char symbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.placeMove(i, j, symbol)) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
