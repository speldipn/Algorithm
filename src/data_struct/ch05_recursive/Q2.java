package data_struct.ch05_recursive;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-04
 */
public class Q2 {
  public static int gcd(int x, int y) {
    int max = x < y ? x : y;
    int result = 1;
    for (int i = 1; i <= max; ++i) {
      if ((x % i == 0) && (y % i == 0)) {
        if(i > result) {
          result = i;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("gcd(2,3): " + gcd(2, 3));
    System.out.println("gcd(4,6): " + gcd(4, 6));
    System.out.println("gcd(12,30): " + gcd(12, 30));
    System.out.println("gcd(60,80): " + gcd(60, 80));
    System.out.println("gcd(320,400): " + gcd(320, 400));
    System.out.println("gcd(18073,75764): " + gcd(18073, 75764));
  }
}
