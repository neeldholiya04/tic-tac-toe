package com.example;

class MediumStrategy implements AIMoveStrategy {
    @Override
    public int[] computeMove(Board board, char symbol) {
        int[][] corners = {{0,0},{0,2},{2,0},{2,2}};
        for (int[] c : corners) {
            if (board.placeMove(c[0], c[1], symbol)) {
                return c;
            }
        }
        // fallback to easy
        return new EasyStrategy().computeMove(board, symbol);
    }
}
