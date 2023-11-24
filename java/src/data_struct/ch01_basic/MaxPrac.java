package data_struct.ch01_basic;

public class MaxPrac {
  public static void main(String[] args) {
    System.out.println(max(3, 2, 1, 5));
    System.out.println(max(3, 5, 2, 1));
    System.out.println(max(3, 2, 5, 1));
    System.out.println(max(5, 2, 3, 1));
    System.out.println(max(3, 2, 1));
    System.out.println(max(1, 3, 2));
    System.out.println(max(1, 2, 3));
    System.out.println(min(3, 2, 1));
    System.out.println(min(3, 2, 2));
    System.out.println(min(3, 2, 2));
  }

  public static int max(int... arr) {
    int length = arr.length;
    if (length == 0) return (-1);
    for (int i = 0; i < length; ++i) System.out.print(arr[i] + " ");
    System.out.println();
    int max = arr[0];
    for (int i = 1; i < length; ++i) {
      if (arr[i] > max) max = arr[i];
    }
    return max;
  }

  public static int min(int... arr) {
    int length = arr.length;
    if (length == 0) return (-1);
    for (int i = 0; i < length; ++i) System.out.print(arr[i] + " ");
    System.out.println();
    int min = arr[0];
    for (int i = 1; i < length; ++i) {
      if (arr[i] < min) min = arr[i];
    }
    return min;
  }
}
