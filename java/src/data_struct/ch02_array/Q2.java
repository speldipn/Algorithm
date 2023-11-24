package data_struct.ch02_array;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */

class Reverse {

  int arr[];

  public Reverse(int[] arr) {
    this.arr = arr;
  }

  public void doReverse() {
    int count = arr.length / 2;
    for (int i = 0; i < count; ++i) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }
}

public class Q2 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int[] arr1 = {5, 4, 3, 2, 1};
    int[] arr2 = {1, 2, 3, 4, 5, 6};

    System.out.println(Arrays.toString(arr));
    Reverse r1 = new Reverse(arr);
    r1.doReverse();
    System.out.println(Arrays.toString(arr) + "\n");

    System.out.println(Arrays.toString(arr1));
    Reverse r2 = new Reverse(arr1);
    r2.doReverse();
    System.out.println(Arrays.toString(arr1) + "\n");

    System.out.println(Arrays.toString(arr2));
    Reverse r3 = new Reverse(arr2);
    r3.doReverse();
    System.out.println(Arrays.toString(arr2));
  }
}
