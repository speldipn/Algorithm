package data_struct.ch02_array;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class Q3 {
  public static void main(String[] args) {
    System.out.println("result: " + sumOf(new int[] {1, 2, 3, 4, 5}));
    System.out.println("result: " + sumOf(new int[] {3, 2, 4, 4, 5}));
    System.out.println("result: " + sumOf(new int[] {2, 2, 2, 4, 5}));

  }

  private static int sumOf(int[] a) {
    System.out.println(Arrays.toString(a));
    int sum = 0;
    for(int i = 0; i < a.length; ++i) {
      sum += a[i];
    }
    return sum;
  }
}
