package data_struct.ch04_stack.queue;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-02
 */
/* TODO: 2018. 09.04 : 문제대로 구현은 하여 동작확인은 되었지만, 제대로된 사양서를 기반으로 재구현해야될 필요 있음.
 */
public class IntDeque {
  private int max;
  private int front;
  private int rear;
  private int back_front;
  private int back_rear;
  private int count;
  int deque[];

  public IntDeque(int capacity) {
    deque = new int[capacity];
    max = capacity;
    front = 0;
    rear = front;
    back_front = max - 1;
    back_rear = back_front;
    count = 0;
  }

  public void enqueueFront(int data) {
    if (count >= max) {
      throw new OverFlowDeckException();
    }
    deque[rear++] = data;
    count += 1;
  }

  public int dequeueFront() {
    if (count <= 0) {
      throw new EmptyDeckException();
    }
    int data = deque[front];
    for (int i = 1; i < rear; ++i) {
      deque[i - 1] = deque[i];
    }
    rear -= 1;
    count -= 1;
    return data;
  }

  public void enqueueBack(int data) {
    if (count >= max) {
      throw new OverFlowDeckException();
    }
    deque[back_front] = data;
    back_front -= 1;
    count += 1;
  }

  public int dequeueBack() {
    if (count <= 0) {
      throw new EmptyDeckException();
    }
    int data = deque[back_rear];
    for (int i = back_front + 1; i < back_rear; ++i) {
      deque[i + 1] = deque[i];
    }
    if(back_front < back_rear) {
      back_front += 1;
      count -= 1;
    }
    return data;
  }

  public void dump() {
    System.out.println("[ Dump ]");
    for (int i = front; i < rear; ++i) {
      System.out.println("[" + i + "]: " + deque[i]);
    }
    for (int i = back_front + 1; i <= back_rear; ++i) {
      System.out.println("[" + i + "]: " + deque[i]);
    }
    System.out.println();
  }

  public class EmptyDeckException extends RuntimeException {
    public EmptyDeckException() {
    }
  }

  public class OverFlowDeckException extends RuntimeException {
    public OverFlowDeckException() {
    }
  }

  public static void main(String[] args) {
    IntDeque deque = new IntDeque(10);
    deque.enqueueFront(10);
    deque.enqueueFront(20);
    deque.enqueueFront(30);
    deque.dump();

    System.out.println("front deq: " + deque.dequeueFront());
    deque.dump();

    System.out.println("front deq: " + deque.dequeueFront());
    deque.dump();

    deque.enqueueBack(99);
    deque.dump();

    deque.enqueueBack(88);
    deque.dump();

    System.out.println("back deq: " + deque.dequeueBack());
    deque.dump();

    System.out.println("back deq: " + deque.dequeueBack());
    deque.dump();

    System.out.println("back deq: " + deque.dequeueBack());
    deque.dump();
  }
}
