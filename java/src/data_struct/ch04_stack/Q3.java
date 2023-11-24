package data_struct.ch04_stack;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-02
 */
public class Q3 {
  public static class IntStack {
    private int max;
    private int start;
    private int end;
    private int stk[];

    public IntStack(int max) {
      this.stk = new int[max];
      this.max = max;
      start = 0;
      end = max - 1;
    }

    public void frontPush(int data) {
      if (start >= end) {
        throw new OverflowStackException();
      }
      stk[start++] = data;
    }

    public void rearPush(int data) {
      if (end <= start) {
        throw new OverflowStackException();
      }
      stk[end--] = data;
    }

    public int frontPop() {
      if (start <= 0) {
        throw new EmtpyStackException();
      }
      return stk[--start];
    }

    public int rearPop() {
      if (end >= (max - 1)) {
        throw new EmtpyStackException();
      }
      return stk[++end];
    }

    public int frontPeek() {
      if (start <= 0) {
        throw new EmtpyStackException();
      }
      return stk[start - 1];
    }

    public int rearPeek() {
      if (end >= (max - 1)) {
        throw new EmtpyStackException();
      }
      return stk[end + 1];
    }

    public void dump() {
      for (int i = start - 1; i >= 0; --i) {
        System.out.println("[" + i + "]: " + stk[i]);
      }
      System.out.println();
      for (int i = end + 1; i < max; ++i) {
        System.out.println("[" + i + "]: " + stk[i]);
      }
      System.out.println();
    }

    public class EmtpyStackException extends RuntimeException {
      public EmtpyStackException() {
      }
    }

    public class OverflowStackException extends RuntimeException {
      public OverflowStackException() {
      }
    }
  }

  public static void main(String[] args) {
    IntStack stack = new IntStack(10);
    stack.frontPush(10);
    stack.rearPush(100);
    stack.frontPush(20);
    stack.rearPush(120);
    stack.dump();

    System.out.println("fonrt pop: " + stack.frontPop());
    stack.dump();

    System.out.println("rear pop: " + stack.rearPop());
    stack.dump();

    System.out.println("fonrt pop: " + stack.frontPop());
    stack.dump();

    System.out.println("rear pop: " + stack.rearPop());
    stack.dump();

//    Emtpry Exception !
//    System.out.println("fonrt peek: " + stack.frontPeek());
//    stack.dump();
//    System.out.println("rear peek: " + stack.rearPeek());
//    stack.dump();

  }
}
