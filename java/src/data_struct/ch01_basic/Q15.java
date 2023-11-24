package data_struct.ch01_basic;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class Q15 {
  public static void main(String[] args) {
    int size = 5;

    triangleLU(size);
    System.out.println();

    triangleLB(size);
    System.out.println();

    triangleRU(size);
    System.out.println();

    triangleRB(size);
  }

  public static void triangleLU(int n) {
    for(int i = n; i > 0; --i) {
      for(int j = 0; j < i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void triangleLB(int n) {
    for(int i = 1; i <= n; ++i) {
      for(int j = 0; j < i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void triangleRU(int n) {
    for(int i = n; i > 0; --i) {
      for(int k = i; k < n; k++) {
        System.out.print(" ");
      }
      for(int j = 0; j < i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void triangleRB(int n) {
    for(int i = 1; i <= n; ++i) {
      for(int k = i; k < n; k++) {
        System.out.print(" ");
      }
      for(int j = 0; j < i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
