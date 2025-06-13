public class nQueenProblem {
    public static void printChessBoard(char board[][]){
        System.out.println("------------------------------------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void nQueens(char chessBoard[][], int row) {

    }

    public static void main(String args[]) {
        int n = 2;
        char chessBoard[][] = new char[n][n];

        // * initializing the chessBoard with empty mark(*)
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = '*';
            }
        }
        printChessBoard(chessBoard);

    }
}
