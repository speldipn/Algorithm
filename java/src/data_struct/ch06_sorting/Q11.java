package data_struct.ch06_sorting;

import data_struct.ch04_stack.IntStack;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-16
 */
public class Q11 {
  static void quickSort(int a[], int left, int right) {
    /* TODO : push, pop, 분할 과정을 출력 */
    IntStack lstack = new IntStack(right - left + 1);
    IntStack rstack = new IntStack(right - left + 1);

    lstack.push(left);
    rstack.push(right);

    while (lstack.isEmpty() != true) {
      int pl = left = lstack.pop();
      int pr = right = rstack.pop();
      int x = a[(left + right) / 2];
      do {
        while (a[pl] < x) pl++;
        while (a[pr] > x) pr--;
        if (pl <= pr) {
          swap(a, pl++, pr--);
        }
      } while (pl <= pr);

      if (left < pr) {
        lstack.push(left);
        rstack.push(pr);
      }
      if (pl < right) {
        lstack.push(pl);
        rstack.push(right);
      }
    }
  }

  private static void swap(int[] a, int i, int i1) {
    int t = a[i];
    a[i] = a[i1];
    a[i1] = t;
  }

  public static void main(String[] args) {
    int sample[] = {6, 4, 8, 3, 1, 9, 7};
    Q11 ob = new Q11();
    ob.showArrayLn(sample, sample.length);
    ob.quickSort(sample, sample.length);
    ob.showArrayLn(sample, sample.length);
  }

  private void quickSort(int[] sample, int length) {
    quickSort(sample, 0, length - 1);
  }

  private void showArray(int[] a, int length) {
    for(int i = 0; i < length; ++i) {
      System.out.print(a[i] + " ");
    }
  }

  private void showArrayLn(int[] a, int length) {
    for(int i = 0; i < length; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}

