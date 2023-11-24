package data_struct.ch01_basic;

public class Q3 {
  public static void main(String[] args) {
    System.out.println(min4(4, 1, 2, 3));
    System.out.println(min4(3, 1, 0, 3));
    System.out.println(min4(4, 0, 0, 3));
  }

  public static int min4(int a, int b, int c, int d) {
    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;
    if (d < min) min = d;
    return min;
  }
}
