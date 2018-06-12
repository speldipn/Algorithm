package data_struct.ch01_basic;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class Q17 {
  public static void main(String[] args) {
    spira(10);
  }

  private static void spira(int n) {
    int num = 1;
    for (int i = 1; i <= n; ++i) {
      for (int k = n - i; k > 0; --k) {
        System.out.print(" ");
      }
      for (int j = 0; j < (i * 2) - 1; ++j) {
        System.out.print(num % 10);
      }
      System.out.println();
      num += 1;
    }
  }
}
