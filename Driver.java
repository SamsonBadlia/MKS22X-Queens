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
    System.out.println("Adding a queen test at 0,1");
    System.out.println(b.addQueen(0,1));
    System.out.println("Printing board with threats and ints");
    System.out.println(b.debug());
    System.out.println("Adding another queen test at 0,1 Should fail");
    System.out.println(b.addQueen(0,1));
    System.out.println("Printing board with threats and ints");
    System.out.println(b.debug());
    System.out.println("Adding a queen test at 0,2");
    System.out.println(b.addQueen(0,2));
    System.out.println("Printing board with threats and ints");
    System.out.println(b.debug());
    System.out.println("Adding a queen test at 1,1");
    System.out.println(b.addQueen(1,1));
    System.out.println("Printing board with threats and ints");
    System.out.println(b.debug());
    System.out.println("Adding a queen test at 2,0");
    System.out.println(b.addQueen(2,0));
    System.out.println("Printing board with threats and ints");
    System.out.println(b.debug());

    QueenBoard c = new QueenBoard(8);
    System.out.println(c.solve());
    System.out.println("Should print true");
    System.out.println(c.countSolutions());
    System.out.println("Should be 92");
  }

}
