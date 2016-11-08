public interface ListInterface<T> extends Iterable<T> {
  void add(T e);
  int size();
  boolean contains(T e);
  boolean remove(T e);
  T get(T e);
  String toString();
}
