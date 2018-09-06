package data_struct.ch05_recursive;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-04
 */
public class Q1 {
  private static int factorial(int n) {
    int result = 1;
    while(n > 0) {
      result *= n--;
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println("F(5): " + factorial(5));
    System.out.println("F(4): " + factorial(4));
    System.out.println("F(3): " + factorial(3));
  }
}
