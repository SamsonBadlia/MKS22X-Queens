public class QueenBoard{

  private int[][] board;

  public QueenBoard(int size){
    board = new int[size][size];
  }

  private boolean addQueen(int r, int c){
    //check if spot is a threat or queen already there
    if (board[r][c] != 0 ) return false;
    //adds a threat "1" to the rest of the row and column
    //can do one for loop because rows and columns are both equal
    for (int i = 0; i < board.length; i++ ){
      board[r][i] = board[r][i] + 1;
      board[i][c] = board[i][c] + 1;
      if (r - i < board.length && c - i < board.length) board[r - i][c - i] = board[r - i][c - i] + 1;
      if (r + i < board.length && c + i < board.length) board[r + i][c + i] = board[r + i][c + i] + 1;
      if (r - i < board.length && c + i < board.length) board[r - i][c + i] = board[r - i][c + i] + 1;
      if (r + i < board.length && c - i < board.length) board[r + i][c - i] = board[r + i][c - i] + 1;
    }
    board[r][c] = -1;
    return true;
  }

  private boolean removeQueen(int r, int c){
    if (board[r][c] != 0 ) return false;
    for (int i = 0; i < board.length; i++ ){
      board[r][i] = board[r][i] - 1;
      board[i][c] = board[i][c] - 1;
      if (r - i < board.length && c - i < board.length) board[r - i][c - i] = board[r - i][c - i] - 1;
      if (r + i < board.length && c + i < board.length) board[r + i][c + i] = board[r + i][c + i] - 1;
      if (r - i < board.length && c + i < board.length) board[r - i][c + i] = board[r - i][c + i] - 1;
      if (r + i < board.length && c - i < board.length) board[r + i][c - i] = board[r + i][c - i] - 1;
    }
    board[r][c] = 0;
    return true;
  }

}
