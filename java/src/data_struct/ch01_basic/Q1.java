package data_struct.ch01_basic;

public class Q1 {
  public static void main(String[] args) {
    System.out.println(max4(1, 2, 3, 4));
    System.out.println(max4(5, 2, 3, 4));
    System.out.println(max4(1, 3, 3, 2));
  }

  public static int max4(int a, int b, int c, int d) {
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    if (d > max) max = d;
    return max;
  }
}
