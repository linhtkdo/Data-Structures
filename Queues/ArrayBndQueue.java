public class ArrayBndQueue<T> implements BQI<T> {
  protected final int DEFCAP = 100;
  protected T[] queue;
  protected int numElements = 0;
  protected int front = 0, rear;
  public ArrayBndQueue(int maxSize) {
    queue = (T[]) new Object[maxSize];
    rear = maxSize - 1;
  }
  public ArrayBndQueue() {
    this (DEFCAP);
  }
  public boolean isEmpty() {
    return (numElements == 0);
  }
  public boolean isFull() {
    return (numElements == queue.length);
  }
  public void enqueue(T e) {
    if (isFull())
      throw new QOE("add to full queue");
    else {
      rear = (rear + 1) % queue.length;
      queue[rear] = e;
      numElements++;
    }
  }
  public T dequeue() {
    is (isEmpty())
      throw new QUE("dequeue from empty");
    else {
      T e = queue[front];
      queue[front] = null;
      front = (front + 1) % queue.length;
      numElements--;
      return e;
    }
  }
}
  

  
