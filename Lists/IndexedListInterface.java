public interface IndexedListInterface<T> extends ListInterface<T> {
  void add (int index, T e); // higher e's move up
  T set (int index, T e); // returns former value
  T get (int index); // exception for bad index
  int indexOf (T e); // -1 if none
  T remove (int index); // higher e's move down
}
  
