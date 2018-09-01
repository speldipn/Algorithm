package data_struct.ch04_stack;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-01
 */

/* Q1 answer */
public class IntStack {
  private int max;
  private int ptr;
  private int[] stk;

  // 실행 시 예외 : 스택이 비어 있음
  public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() {
    }
  }

  // 실행 시 예외 : 스택이 가득 참
  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() {
    }
  }

  public IntStack(int capacity) {
    ptr = 0;
    max = capacity;
    try {
      stk = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

  public int push(int x) throws OverflowIntStackException {
    if (ptr >= max) {
      throw new OverflowIntStackException();
    }
    return stk[ptr++] = x;
  }

  public int pop() throws EmptyIntStackException {
    if (ptr <= 0) {
      throw new EmptyIntStackException();
    }
    return stk[--ptr];
  }

  public int peek() throws EmptyIntStackException {
    if (ptr <= 0) {
      throw new EmptyIntStackException();
    }
    return stk[ptr - 1];
  }

  public void dump() throws EmptyIntStackException {
    if (ptr <= 0) {
      throw new EmptyIntStackException();
    }
    for (int i = ptr - 1; i >= 0; --i) {
      System.out.println("[" + i + "]: " + stk[i]);
    }
    System.out.println();
  }

  public int indexOf(int x) {
    for (int i = 0; i < ptr; ++i) {
      if (stk[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public void clear() {
    ptr = 0;
  }

  public int capacity() {
    return max;
  }

  public int size() {
    return ptr;
  }

  public boolean isEmpty() {
    return ptr <= 0;
  }

  public boolean isFull() {
    return ptr >= max;
  }

  static class StackManager {
    public static final int EXIT = 1;
    public static final int RUN = 2;

    static String menu[] = {"Push", "Pop", "Peek", "Dump",
      "Clear", "Capacity", "Size", "IsEmpty", "IsFull", "Exit"};

    IntStack stack;
    Scanner scanner;

    public StackManager(int n) {
      stack = new IntStack(n);
      scanner = new Scanner(System.in);
    }

    public void showMenu() {

      for (int i = 0; i < menu.length; ++i) {
        System.out.print("(" + i + "): " + menu[i] + " ");
      }
      System.out.println();
    }

    public int command(String cmd) {
      switch (cmd) {
        case "Push":
          System.out.print("data : ");
          stack.push(scanner.nextInt());
          break;
        case "Pop":
          System.out.println(cmd + ": " + stack.pop());
          break;
        case "Peek":
          System.out.println(cmd + ": " + stack.peek());
          break;
        case "Dump":
          stack.dump();
          break;
        case "Clear":
          stack.clear();
          break;
        case "Capacity":
          System.out.println(cmd + ": " + stack.capacity());
          break;
        case "Size":
          System.out.println(cmd + ": " + stack.size());
          break;
        case "IsEmpty":
          System.out.println(cmd + ": " + stack.isEmpty());
          break;
        case "IsFull":
          System.out.println(cmd + ": " + stack.isFull());
          break;
        case "Exit":
          System.out.println(cmd);
          return EXIT;
      }
      return RUN;
    }

  }

  public static void main(String[] args) {
    StackManager manager = new StackManager(50);
    Scanner scanner = new Scanner(System.in);
    int status = StackManager.RUN;
    while (status == StackManager.RUN) {
      manager.showMenu();
      System.out.print("input: ");
      int select = scanner.nextInt();
      status = manager.command(StackManager.menu[select]);
    }
  }
}
