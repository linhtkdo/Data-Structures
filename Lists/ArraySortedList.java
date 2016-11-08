public class ArraySortedList<T> extends ArrayUnsortedList<T> implements ListInterface<T> {
  public void add (T e) {
    T listElement;
    int loc = 0;
    if (numElements == list.length) enlarge();
    while (loc < numElements) {
      listElement = list[loc];
      if (((Comparable<T>) listElement).compareTo(e) < 0)
        loc++;
      else break;
    }
    for (int index == numElements; index > loc; index--)
      list[index] = list[index-1];
    list[loc] = e;
    numElements++;
  }
}
