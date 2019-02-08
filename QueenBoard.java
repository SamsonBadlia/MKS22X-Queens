public class QueenBoard{

  private int[][] board;

  public QueenBoard(int size){
    board = new int[size][size];
  }

  public boolean addQueen(int r, int c){
    //check if spot is a threat or queen already there
    if (board[r][c] != 0 ) return false;
    //loops through board and adds a threat "1" to the rest of the row and column and to the diagonals
    for (int i = 0; i < board.length; i++ ){
      board[r][i] = board[r][i] + 1;
      board[i][c] = board[i][c] + 1;
      // bottom left diagonal
      if (r - i < board.length && r - i > 0 && c - i < board.length && c - i > 0) board[r - i][c - i] = board[r - i][c - i] + 1;
      // upper right diagonal
      if (r + i < board.length && c + i < board.length ) board[r + i][c + i] = board[r + i][c + i] + 1;
      // upper left diagonal
      if (r - i < board.length && r - i > 0 && c + i < board.length) board[r - i][c + i] = board[r - i][c + i] + 1;
      // bottom right diagonal
      if (r + i < board.length && c - i < board.length && c - i > 0) board[r + i][c - i] = board[r + i][c - i] + 1;
    }
    board[r][c] = -1;
    return true;
  }

  public boolean removeQueen(int r, int c){
    // checks if queen is in that section
    if (board[r][c] != -1 ) return false;
      //loops through board and removes a threat "-1" to the columns and rows and diagonals
      for (int i = 0; i < board.length; i++ ){
        board[r][i] = board[r][i] - 1;
        board[i][c] = board[i][c] - 1;
        // bottom left diagonal
        if (r - i < board.length && r - i > 0 && c - i < board.length && c - i > 0) board[r - i][c - i] = board[r - i][c - i] - 1;
        // upper right diagonal
        if (r + i < board.length && c + i < board.length ) board[r + i][c + i] = board[r + i][c + i] - 1;
        // upper left diagonal
        if (r - i < board.length && r - i > 0 && c + i < board.length) board[r - i][c + i] = board[r - i][c + i] - 1;
        // bottom right diagonal
        if (r + i < board.length && c - i < board.length && c - i > 0) board[r + i][c - i] = board[r + i][c - i] - 1;
      }
      board[r][c] = 0;
      return true;
  }

  public String toString(){
    String s = "";
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board[0].length; j++){
        //if queen present replaces with q
        if (board[i][j] == -1) s+= " Q ";
        else{
          s += " _ ";
        }
        if (j == board.length - 1) s+= "\n";
      }
    }
    return s;
  }

  public String debug(){
    String s = "";
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board[0].length; j++){
        s += board[i][j] + " ";
        if (j == board.length - 1) s+= "\n";
      }
    }
    return s;
  }

}
