import java.util.NoSuchElementException;
public class Range implements IntegerSequence {

  private int start,end,current;

  public Range(int a, int b) {
    start = a;
    end = b;
    current = a;
  }

  public void reset() {
    current = start;
  }

  public int length() {
    return (end - start + 1);
  }

  public boolean hasNext() {
    if (current < end) return true;
    return false;
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
