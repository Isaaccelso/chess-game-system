package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Rook extends ChessPiece {
    @Override
    public String toString() {
        return "R";
    }

    public Rook(Board board, Color color) {
        super(board, color);
    }
}