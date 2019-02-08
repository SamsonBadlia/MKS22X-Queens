public class Driver{

  public static void main(String[] args) {

    QueenBoard b = new QueenBoard(4);
    System.out.println("Should print a 4 by 4 board:");
    System.out.println(b);
    System.out.println("Adding a queen test at 0,1");
    System.out.println(b.addQueen(0,1));
    System.out.println("Printing board with threats and ints");
    System.out.println(b.debug());
    System.out.println("Removing a queen at 0,1");
    System.out.println(b.removeQueen(0,1));
    System.out.println("Printing board with threats and ints");
    System.out.println(b.debug());

  }

}
