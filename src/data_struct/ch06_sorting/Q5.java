package data_struct.ch06_sorting;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-08
 */
public class Q5 {
  private static void bubbleSort(int a[], int n) {
    //TODO(18.09.08): 홀수번은 작은값을 가장 앞으로 짝수는 큰값을 가장 뒤로로 옮기는 알고리즘 작성.(Bidirectional Bubble Sort)
    int k = 0;
    while (k < n - 1) {
      int last = n - 1;
      for (int j = n - 1; j > k; --j) {
        if (a[j - 1] > a[j]) {
          swap(a, j - 1, j);
          last = j;
        }
      }
      k = last;
    }
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  private static void showArray(int a[]) {
    for (int i = 0; i < a.length; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int sample[] = {9, 1, 3, 4, 6, 7, 8};
    showArray(sample);
    bubbleSort(sample, sample.length);
    showArray(sample);
  }
}
