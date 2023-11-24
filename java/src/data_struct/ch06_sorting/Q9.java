package data_struct.ch06_sorting;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-11
 */
public class Q9 {
  private static int changeCnt = 0;

  public static void shellSort(int a[], int n) {
    changeCnt = 0;

    for (int h = n / 2; h > 0; h /= 2) {
      for (int i = h; i < n; ++i) {
        int tmp = a[i];
        int j;
        for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
          a[j + h] = a[j];
          changeCnt += 1;
        }
        a[j + h] = tmp;
      }
    }
    System.out.println("shellSort 이동횟수: " + changeCnt);
  }

  public static void shellSortRev1(int a[], int n) {
    int h;
    changeCnt = 0;

    // h ..., 121, 40, 13, 4, 1
    for (h = 1; h < n / 9; h = h * 3 + 1)
      ;

    for (; h > 0; h /= 3) {
      for (int i = h; i < n; ++i) {
        int tmp = a[i];
        int j;
        for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
          a[j + h] = a[j];
          changeCnt += 1;
        }
        a[j + h] = tmp;
      }
    }

    System.out.println("shellSortRev1 이동횟수: " + changeCnt);
  }

  private static void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  public static void printArray(int a[], int n) {
    for (int i = 0; i < n; ++i) {
      System.out.print(a[i] + " ");
    }
  }

  public static void printArrayLn(int a[], int n) {
    for (int i = 0; i < n; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    final int max = 2000;
    int sample[] = new int[max];
    for (int i = max; i > 0; --i) {
      sample[max - i] = i;
    }
    int sample1[] = Arrays.copyOf(sample, sample.length);

    Q9 ob = new Q9();
//    ob.printArrayLn(sample, sample.length);
    ob.shellSort(sample, sample.length);
//    ob.printArrayLn(sample, sample.length);

    System.out.println();

//    ob.printArrayLn(sample1, sample1.length);
    // 2000개 이상일수록 아래 알고리즘 더 적은 비교연산을 수행함.
    ob.shellSortRev1(sample1, sample1.length);
//    ob.printArrayLn(sample1, sample1.length);
  }
}
