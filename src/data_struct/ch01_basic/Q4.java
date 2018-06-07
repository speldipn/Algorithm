package data_struct.ch01_basic;

public class Q4 {
  public static void main(String[] args) {
    System.out.println(med3(1, 3, 2));
    System.out.println(med3(1, -1, 2));
    System.out.println(med3(1, 5, 2));
    System.out.println(med3(1, 1, 2));
  }

  public static int med3(int a, int b, int c) {
    if(a >= b) {
      if(b >= c) {
        return b;
      } else if(a <= c) {
        return a;
      } else {
        return c;
      }
    } else if(a > c) {
      // b > a
      return a;
    } else if(b > c) {
      // b > a
      return c;
    } else {
      return b;
    }
  }
}
