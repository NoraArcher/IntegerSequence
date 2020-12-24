import java.util.NoSuchElementException;
public class Range implements IntegerSequence {

  private int start,end,current;

  public Range(int a, int b) {
    if (a > b) {
      throw new IndexOutOfBoundsException();
    } else {
      start = a;
      end = b;
      current = a;
    }
  }

  public void reset() {
    current = start;
  }

  public int length() {
    return (end - start + 1);
  }

  public boolean hasNext() {
    return (current <= end);
  }

  public int next() throws NoSuchElementException {
    if ( hasNext() ) {
      int temp = current;
      current++;
      return temp;
    } else {
      throw new NoSuchElementException();
    }
  }



}
