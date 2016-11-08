public class ArrayUnsortedList<T> implements ListInterface<T> {
  protected final static int DEFCAP = 100;
  protected int origCap;
  protected T[] list;
  protected int numElements=0, currentPos, location;
  public ArrayUnsortedList(int origCap) {
    list = (T[]) new Object[origCap];
  }
  public ArrayUnsortedList() {
    this(DEFCAP);
    origCap = DEFCAP;
  }
  protected void enlarge() {
    T[] larger = (T[]) new Object[list.length*2];
    for (int i = 0; i < numElements; i++)
      larger[i] = list[i];
    list = larger;
  }
  protected int find (T target) {
    int location = 0;
    while (location < numElements) {
      if (list[location].equals(target))
        return location;
      else location++;
    }
    return -1;
  } 
  public void add (T e) {
    if (numElements == list.length) enlarge();
    list[numElements] = e;
    numElements++;
  }
  public boolean remove (T e) {
    int location = find(e);
    if (location != -1) {
      list[location] = list[numElements-1];
      list[numElements-1] = null;
      numElements--;
      return true;
    }
    return false;
  }
}
  
