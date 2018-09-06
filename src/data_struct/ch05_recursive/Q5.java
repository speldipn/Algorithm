package data_struct.ch05_recursive;

import data_struct.ch04_stack.IntStack;

import java.sql.SQLOutput;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-04
 */
public class Q5 {
  static void recur3(int n) {
    if (n > 0) {
      recur3(n - 1);
      recur3(n - 2);
      System.out.print(n + " ");
    }
  }

  static void loop3(int x) {
    IntStack stack = new IntStack(x + 10);
    int n = x;
    while (true) {
      if (n > 0) {
        stack.push(n);
        n = n - 1;
        continue;
      }
      if (!stack.isEmpty()) {
        n = stack.pop();
        int d = n;
        int count = 0;
        while (d - 2 > 0) {
          stack.push(d - 2);
          d = d - 2;
          count = count + 1;
        }
        for(int i = 0; i < count; ++i) {
          System.out.print(stack.pop() + " ");
        }
        System.out.print(n + " ");
        n = n - 2;
        if (!stack.isEmpty()) {
          continue;
        }
      }
      break;
    }
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 10; ++i) {
      recur3(i);
      System.out.println();
      loop3(i);
      System.out.println();
    }
  }
}
