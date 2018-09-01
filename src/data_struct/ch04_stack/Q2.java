package data_struct.ch04_stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-01
 */
public class Q2 {
  static class GStack<E> {
    private int max;
    private int ptr;
    private E[] stk;

    public GStack(int max) {
      this.stk = (E[]) new Object[max];
      this.max = max;
      ptr = 0;
    }

    public void push(E e) {
      if (ptr >= max) {
        throw new overFlowException();
      }
      stk[ptr++] = e;
    }

    public E pop() {
      if (ptr <= 0) {
        throw new emtpyStackException();
      }
      return stk[--ptr];
    }

    public E peek() {
      if (ptr <= 0) {
        throw new emtpyStackException();
      }
      return stk[ptr - 1];
    }

    public void dump() {
      for (int i = ptr - 1; i >= 0; --i) {
        System.out.println("[" + i + "]: " + stk[i]);
      }
      System.out.println();
    }

    public static class overFlowException extends RuntimeException {
      public overFlowException() {
      }
    }

    public static class emtpyStackException extends RuntimeException {
      public emtpyStackException() {
      }

    }
  }

  public static void main(String[] args) {
    GStack stack = new GStack<String>(3);
    stack.push("Hello");
    stack.push("Joong young Oh");
    stack.push("Ja ram Oh");
    stack.dump();

    System.out.println("peek: " + stack.peek());
    stack.dump();

//    System.out.println("pop: " + stack.pop());
//    stack.dump();

    stack.push("OverFlow");
  }
}
