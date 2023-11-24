package data_struct.ch04_stack.queue;

import java.util.Queue;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-02
 */

/* Q5, Q6 */
public class RingBuffer<E> {
  private E que[];
  private int max;
  private int front;
  private int rear;
  private int num; // count of element

  public RingBuffer(int capacity) {
    que = (E[]) new Object[capacity];
    this.max = capacity;
    front = rear = num = 0;
  }

  public void enQueue(E data) {
    int next = (rear + 1) % max;
    if (num >= max) {
      throw new EmptyRingBufferException();
    } else if (next == front) {
      throw new OverflowRingBufferException();
    }
    que[rear] = data;
    rear = next;
    ++num;
  }

  public E deQueue() {
    int next = (front + 1) % max;
    if (num <= 0) {
      throw new EmptyRingBufferException();
    } else if (next == rear) {
      throw new OverflowRingBufferException();
    }
    E data = que[front];
    front = next;
    --num;
    return data;
  }

  public void dump() {
    System.out.println("[ Dump ] : " + num);
    for (int i = 0; i < num; ++i) {
      System.out.println("[" + ((front + i) % max) + "]: " + que[(front + i) % max]);
    }
    System.out.println();
  }

  public int search(Object target) {
    for(int i = 0; i < num; ++i) {
      int idx = (front + i) % max;
      if(que[idx].equals(target)) {
        return i + 1;
      }
    }
    return 0;
  }

  public static class OverflowRingBufferException extends RuntimeException {
    public OverflowRingBufferException() {
    }
  }

  public static class EmptyRingBufferException extends RuntimeException {
    public EmptyRingBufferException() {
    }
  }

  public static void main(String[] args) {
    RingBuffer rbuffer = new RingBuffer<String>(5);
    rbuffer.enQueue("Hello");
    rbuffer.enQueue("Joon");
    rbuffer.enQueue("Young");
    rbuffer.enQueue("Ja");
    rbuffer.dump();

    System.out.println("deQueue: " + rbuffer.deQueue());
    rbuffer.dump();

    rbuffer.enQueue("Ram");
    rbuffer.dump();

    System.out.println("deQueue: " + rbuffer.deQueue());
    rbuffer.dump();

    rbuffer.enQueue("Wow");
    rbuffer.dump();

    System.out.println("search[Ja]: " + rbuffer.search("Ja"));
    System.out.println("search[Wow]: " + rbuffer.search("Wow"));
    System.out.println("search[Ram]: " + rbuffer.search("Ram"));
    System.out.println("search[Young]: " + rbuffer.search("Young"));
    System.out.println("search[aa]: " + rbuffer.search("aa"));
  }
}
