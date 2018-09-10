package data_struct.ch06_sorting;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-10
 */
public class Q6 {
  private static void selectionSort(int arr[], int n) {
    int min = 0;
    int org[] = new int[n];
    String markLine = null;
    for (int i = 0; i < n; ++i) {
      markLine = "[" + (i + 1) + "]\n";
      System.arraycopy(arr, 0, org, 0, n);
      min = i;
      for (int j = i + 1; j < n; ++j) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      int k;
      for (k = 0; k < i; ++k) {
        markLine += "  ";
      }
      markLine += "* ";
      for (; k < min - 1; ++k) {
        markLine += "  ";
      }
      if (k < n - 1) {
        markLine += "+ ";
      }
      System.out.println(markLine);
      showArray(org, org.length);
      swap(arr, min, i);
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  private static void showArray(int[] arr, int n) {
    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int sample[] = {6, 4, 8, 3, 1, 9, 7};
    Q6 ob = new Q6();

    System.out.println("~~~ first");
    ob.selectionSort(sample, sample.length);

    System.out.println("~~~ second");
    int sample1[] = {5, 1, 3, 2, 4};
    ob.selectionSort(sample1, sample1.length);
  }
}
