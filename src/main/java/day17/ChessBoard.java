package day17;

public class ChessBoard {
    ChessPiece [][] figureArray;
    public ChessBoard(ChessPiece[][] figureArray){
        this.figureArray = figureArray;
    }
    public void print(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(figureArray[i][j]);
            }
            System.out.println();
        }
    }
}
