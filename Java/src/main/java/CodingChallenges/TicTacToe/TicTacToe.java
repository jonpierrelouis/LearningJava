package CodingChallenges.TicTacToe;

public class TicTacToe {

    /**
     * Using a square 3x3 board, tell if either X or O has won the game of tic tac toe.
     * The board may be of any size, but it is square.
     * You may assume that the board is completely full.
     * @param board a 2d array of chars representing a tic-tac-toe square of any size.
     * @return X if X has won, O (letter) if O has won, and T if there is a tie.
     */
    public char validateWin(char[][] board) {

        /*
        [0][0] [0][1] [0][2]
        [1][0] [1][1] [1][2]
        [2][0] [2][1] [2][2]
         */

        //test all possible win conditions
        char[] verticalLeft = {board[0][0], board[1][0], board[2][0]};
        char[] verticalMiddle =  {board[0][1], board[1][1], board[2][1]};
        char[] verticalRight = {board[0][2], board[1][2], board[2][2]};
        char[] horizontalTop = {board[0][0], board[0][1], board[0][2]};
        char[] horizontalMiddle = {board[1][0], board[1][1], board[1][2]};
        char[] horizontalBottom = {board[2][0], board[2][1], board[2][2]};
        char[] diagonalUp = {board[2][0], board[1][1], board[0][2]};
        char[] diagonalDown = {board[0][0], board[1][1], board[2][2]};

        char[][] winConditions = {verticalLeft, verticalMiddle, verticalRight, horizontalTop,
                horizontalMiddle, horizontalBottom, diagonalUp, diagonalDown};

        //find winner
        for(int i = 0; i < 8; i++){
            if(winConditions[i][0] == winConditions[i][1] && winConditions[i][0] == winConditions[i][2]){
                return winConditions[i][0];
            }
        }

        return 'T';
    }
}
