package data_struct.ch04_stack.queue;

import javax.management.relation.RoleUnresolved;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-02
 */
public class IntQueue {
  private int max;
  private int front;
  private int rear;
  private int num;
  private int que[];

  public class EmptyIntQueueException extends RuntimeException {
    public EmptyIntQueueException() {}
  }

  public class OverflowIntQueueException extends RuntimeException {
    public OverflowIntQueueException() {}
  }

  public IntQueue(int capacity) {
    num = front = rear = 0;
    max = capacity;
    try {
      que = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }
}
