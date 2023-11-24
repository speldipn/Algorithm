package data_struct.ch04_stack;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-02
 */
public class IntAryQueue {
  private int max;
  private int num;
  private int[] que;

  public IntAryQueue(int max) {
    this.que = new int[max];
    this.max = max;
    num = 0;
  }

  public void enqueue(int data) {
    if (num >= max) {
      throw new OverflowException();
    }
    que[num++] = data;
  }

  public int dequeue() {
    int data = que[0];
    if (num <= 0) {
      throw new EmptyException();
    }
    for (int i = 1; i < num; ++i) {
      que[i - 1] = que[i];
    }
    num = num - 1;
    return data;
  }

  public void dump() {
    System.out.println("[ Dump ]");
    for (int i = 0; i < num; ++i) {
      System.out.println("[" + i + "]: " + que[i]);
    }
    System.out.println();
  }

  public class OverflowException extends RuntimeException {
    public OverflowException() {
    }
  }

  public class EmptyException extends RuntimeException {
    public EmptyException() {
    }
  }

  public static void main(String[] args) {
    IntAryQueue queue = new IntAryQueue(10);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.dump();
    System.out.println("dequeue: " + queue.dequeue());
    queue.dump();
    System.out.println("dequeue: " + queue.dequeue());
    System.out.println("dequeue: " + queue.dequeue());
    queue.dump();
  }
}
