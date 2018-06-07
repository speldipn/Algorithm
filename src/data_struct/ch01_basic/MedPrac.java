package data_struct.ch01_basic;

import java.util.Arrays;

public class MedPrac {
  public static void main(String[] args) {
    System.out.println("중앙값: " + med(new int[] {10, 3, 5}));
    System.out.println("중앙값: " + med(new int[] {1, 3, 2}));
    System.out.println("중앙값: " + med(new int[] {2, 3, 2}));
    System.out.println("중앙값: " + med(new int[] {10, 3, 7, 5}));
    System.out.println("중앙값: " + med(new int[] {10, 3, 7, 3}));
    System.out.println("중앙값: " + med(new int[] {10, 3, 7, 3, 7}));
  }

  public static int med(int... arr) {
    for(int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    int[] temp = Arrays.copyOf(arr, arr.length);
    Arrays.sort(temp);
    int med = temp[temp.length >> 1];
    return med;
  }
}
