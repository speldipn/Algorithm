package data_struct.ch06_sorting;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-08
 */
public class Q3 {
  static void bubbleSort(int arr[]) {
    int changeCnt = 0;
    int compareCnt = 0;
    int i, j;
    boolean changed[] = new boolean[arr.length];
    int org[] = new int[arr.length];
    for (i = 0; i < arr.length; ++i) {
      System.out.println("패스 " + (i + 1));
      int exchg = 0;
      for (j = 1; j < arr.length - i; ++j) {
        System.arraycopy(arr, 0, org, 0, arr.length);
        Arrays.fill(changed, false);
        compareCnt = compareCnt + 1;
        if (arr[j - 1] > arr[j]) {
          exchg  = exchg + 1;
          changed[j] = true;
          swap(arr, j - 1, j);
          changeCnt = changeCnt + 1;
        }
        showChanged(arr, org, changed, j);
      }
      show(arr);
      if(exchg == 0) {
        break;
      }
    }
    System.out.println("비교횟수: " + compareCnt);
    System.out.println("교환횟수: " + changeCnt);
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
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

  private static void show(int arr[]) {
    System.out.print("  ");
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + "   ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int sample[] = {1, 3, 6, 4, 7, 8, 9};
    show(sample);
    bubbleSort(sample);
    show(sample);
  }
}
