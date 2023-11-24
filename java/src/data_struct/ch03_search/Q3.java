package data_struct.ch03_search;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-29
 */
public class Q3 {
  public static void main(String[] args) {
    int arr[] = {1, 9, 2, 9, 4, 6, 9};
    int idx[] = new int[100];
    int count = searchIdx(arr, arr.length, 9, idx);
    System.out.println(count);
    for (int i = 0; i < count; ++i) {
      System.out.print(idx[i] + " ");
    }
    System.out.println();
  }

  static int searchIdx(int[] a, int n, int key, int[] idx) {
    int j = 0;
    for (int i = 0; i < n; ++i) {
      if (a[i] == key) {
        idx[j++] = i;
      }
    }
    return j;
  }

}
