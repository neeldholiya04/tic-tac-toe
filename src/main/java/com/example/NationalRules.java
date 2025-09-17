package com.example;

class NationalRules implements GameRules {
    @Override
    public boolean isWinningMove(Board board, Player player) {
        return board.checkWin(player.getSymbol());
    }

    @Override
    public boolean isDraw(Board board, int moves, int maxMoves) {
        return board.isFull() || moves >= maxMoves;
    }

    @Override
    public int getMaxMoves() {
        return 9;
    }
}