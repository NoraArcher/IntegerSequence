import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {

  int currentIndex;
  int []data;

  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq) {
    otherseq.reset();
    data = new int[otherseq.length()];
    while (otherseq.hasNext()) {
      data[i] = otherseq.next();
    }
    currentIndex = 0;
    otherseq.reset();
  }

  public boolean hasNext() {
    return (currentIndex < data.length);
  }//does the sequence have more elements?

  public int next() throws NoSuchElementException {
    if ( hasNext() ) {
      int temp = currentIndex;  currentIndex++;
      return data[temp];
    } else {
      throw new NoSuchElementException();
    }
  }       //return the current value in the sequence and advances to the next element.

  public int length() {
    return data.length;
  }     //returns the total length of the sequence

  public void reset() {
    currentIndex = 0;
  }     //start over from the start of the sequence



}
