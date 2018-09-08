package data_struct.ch06_sorting;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-08
 */
public class Q4 {
  private static void bubbleSort(int a[], int n) {
    int k = 0;
    int no = 0;
    int org[] = new int[a.length];
    boolean changed[] = new boolean[a.length];
    while (k < n - 1) {
      System.out.println("패스 " + ++no);
      Arrays.fill(changed, false);
      System.arraycopy(a, 0, org, 0, a.length);
      int last = n - 1;
      for (int j = n - 1; j > k; --j) {
        if (a[j - 1] > a[j]) {
          swap(a, j - 1, j);
          last = j;
          showChanged(a, org, changed, j);
        }
      }
      show(a);
      k = last;
    }
  }

  private static void showChanged(int[] arr, int org[], boolean[] changed, int pos) {
    for (int z = 0; z < arr.length; ++z) {
      if (z == pos) {
        if (changed[z]) {
          System.out.print("+ ");
        } else {
          System.out.print("- ");
        }
      } else {
        System.out.print("  ");
      }
      System.out.print(org[z] + " ");
    }
    System.out.println();
  }


  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  private static void show(int arr[]) {
    System.out.print("  ");
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + "   ");
    }
    System.out.println();
  }


  public static void main(String[] args) {
    int sample[] = {1, 3, 9, 4, 7, 8, 6};
    bubbleSort(sample, sample.length);
  }
}
