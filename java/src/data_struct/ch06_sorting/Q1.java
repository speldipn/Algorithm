package data_struct.ch06_sorting;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-08
 */
public class Q1 {
  static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length; ++i) {
      for (int j = 1; j < arr.length - i; ++j) {
        if (arr[j - 1] > arr[j]) {
          swap(arr, j-1, j);
        }
      }
    }
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }


  static void show(int arr[]) {
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int sample[] = {50, 20, 10, 30, 40};
    show(sample);
    bubbleSort(sample);
    show(sample);
  }
}
