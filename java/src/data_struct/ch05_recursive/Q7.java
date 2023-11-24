package data_struct.ch05_recursive;

import data_struct.ch04_stack.IntStack;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-07
 */
public class Q7 {
  static void moveRecur(int no, int x, int y) {
    if (no > 1) {
      moveRecur(no - 1, x, 6 - x - y);
    }

    System.out.println("원반[" + no + "]원반을 " + x + "기둥에서 " + y + "기둥으로 옮김");

    if (no > 1) {
      moveRecur(no - 1, 6 - x - y, y);
    }
  }

  static void move(int n, int x, int y) {
    IntStack stack = new IntStack(100);
    int no = n + 1;
    int _x = x;
    int _y = 6 - y - _x;
    boolean flag = true;
    while (true) {
      if (no > 1) {
        stack.push(no - 1);
        _y = 6 - _x - _y;
        stack.push(_y);
        stack.push(_x);
        no = no - 1;
        continue;
      }
      if (!stack.isEmpty()) _x = stack.pop();
      if (!stack.isEmpty()) _y = stack.pop();
      if (!stack.isEmpty()) no = stack.pop();
      System.out.println("원반[" + no + "]원반을 " + _x + "기둥에서 " + _y + "기둥으로 옮김");
      if (no > 1) {
        stack.push(no - 1);
        stack.push(_y);
        _x = 6 - _x - _y;
        stack.push(_x);
        no = no - 1;
      }
      if (stack.isEmpty()) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    for(int i = 3; i <= 10; ++i) {
//      move(i, 1, 3);
      moveRecur(i, 1, 3);
      System.out.println("\n");
    }
  }
}
