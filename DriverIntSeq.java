public class DriverIntSeq {

  public static void main(String[] args) {

    IntegerSequence r = new Range(10,15);

    System.out.println("length is "+r.length()); //output 6

    while( r.hasNext() ){
      System.out.print( r.next() );
      if( r.hasNext() ){
        System.out.print( ", " );
      }
    }
    System.out.println(); //output: 10, 11, 12, 13, 14, 15
    r.reset();
    while( r.hasNext() ){
      System.out.print( r.next() );
      if( r.hasNext() ){
        System.out.print( ", " );
      }
    }
    System.out.println(); //output: 10, 11, 12, 13, 14, 15

  }//end of main


}// end of program
