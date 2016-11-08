public class LinkedUnbndQueue<T> implements UQI<T> {
  protected LLNode<T> front;
  protected LLNode<T> rear;

  public void enqueue(T e) {
    LLNode<T> nn = new LLNode<T>(e);
    if (rear == null) 
      front = nn;
    else 
      rear.setLink(nn);
    rear = nn;
  }
  
  public T dequeue() {
    if (isEmpty()) 
      throw new QueueUnderflowException("empty queue");
    else {
      T e = front.getInfo();
      front = front.getLink();
      if (front == null) rear = null;
      return e;
    }
  }
}
