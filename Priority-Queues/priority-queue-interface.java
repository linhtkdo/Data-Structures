public interface PriorityQueueInterface<T extends Comparable<T>> {
  boolean isEmpty();
  boolean isFull();
  T peek();
  
  void enqueue(T element);
  // Throws PriorityQueueOverflowException if full;
  // otherwise, adds element to this priority queue.
  
  T dequeue();
  // Throws PriorityQueueUnderflowException if empty;
  // otherwise, removes element with highest priority
  // and returns it.
}
