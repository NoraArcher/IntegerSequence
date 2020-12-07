public class DriverIntSeq {

  public static void main(String[] args) {

    IntegerSequence a = new Range(10,15);
    IntegerSequence b = new Range(1,1);
    IntegerSequence c = new Range(0,3);
    IntegerSequence d = new Range(-8, -2);
    int[] nums = {1, 3, 5, 0, -1, 3, 9};
    IntegerSequence e = new ArraySequence(nums);
    //IntegerSequence e = new Range(45, 20);

    System.out.println("\nDecember 3rd Tests");
    if (true) {
      if (a.length() == 6) {
        System.out.println("length test: SUCCESS");
      } else {
        System.out.println("length test: FAIL");
      }
      if (b.length() == 1) {
        System.out.println("length test: SUCCESS");
      } else {
        System.out.println("length test: FAIL");
      }
      d.next();   d.next();   d.next();
      if (d.next() == -5) {
        System.out.println("next test: SUCCESS");
      } else {
        System.out.println("next test: FAIL, next was "+(d.next() - 1));
      }
      d.reset();
      if (d.next() == -8) {
        System.out.println("reset test: SUCCESS");
      } else {
        System.out.println("reset test: FAIL");
      }
      a.reset();
      System.out.println("hasNext test should print out:\n10, 11, 12, 13, 14, 15\nIt prints:");
      while ( a.hasNext() ) {
        System.out.print( a.next() );
        if( a.hasNext() ) {
          System.out.print( ", " );
        }
      }
      System.out.println();
    }

    System.out.println("\nDecember 7th Tests");
    if (true) {
      System.out.println("ArraySequence(array):");
      while(e.hasNext()) {
        System.out.print(e.next()+", ");
      }
    }

  }//end of main


}// end of program
