package com.example;

interface GameRules {
    boolean isWinningMove(Board board, Player player);
    boolean isDraw(Board board, int moves, int maxMoves);
    int getMaxMoves();
}