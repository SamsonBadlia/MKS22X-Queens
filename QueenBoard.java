public class QueenBoard{

  private int[][] board;

  public QueenBoard(int size){
    board = new int[size][size];
  }

  private boolean addQueen(int r, int c){
    for (int i = 0; i < board.length; i++){
      if (board[r][i] == -1) return false;
    }
    for (int j = 0; j < board.length; j++){
      if (board[i][c] == -1) return false;
    }
    board[r][c] = -1;
    for (int j = 0; j < board.length; j++){

    }
    return true;
  }

  private boolean removeQueen(int r, int c){
    board[r][c] =
  }

}

_ _ _ _
_ _ q _ (1,2)
_ _ _ _
_ _ _ _

1,0
1,1
1,2
1,3

0,1
1,1
2,1
3,1
