package ex05;

import java.util.NoSuchElementException;

public class LinkedQueue<T> {

  private int count;
  private LinearNode<T> front, rear;
  
  public LinkedQueue() {
    front = rear = null;
    count = 0;
  }
  
  public boolean isEmpty() {
    System.out.println(count);

    return count == 0;
  }

  public int size() {
    return count;
  }

  public void enqueue(T element) {
    LinearNode<T> newNode = new LinearNode<T>(element);

    if (isEmpty()) {
      front = rear;
    } else {
      rear.setNext(newNode);
    }

      count++;
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException("Queue underflow");
    } else {
      T element = front.getElement();
      front = front.getNext();

      count--;
      return element;
    }
  }

  public void toString(T element) {
    LinearNode<T> p = front;

    while (p != null) {
      System.out.println(p.getElement());
      p = p.getNext();
    }
  }
}