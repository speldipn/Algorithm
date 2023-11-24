package data_struct.ch02_array;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-12
 */
public class PrimeNumber {
  public static void main(String[] args) {
    PrimeNumber1 primeNumber1 = new PrimeNumber1();
    primeNumber1.prime();
  }

  static class PrimeNumber1 {
    public static void prime() {
      int counter = 0;
      int i, n;

      for(n = 2; n <= 1000; ++n) {
        for(i = 2; i < n; ++i) {
          ++counter;
          if(n % i == 0) {
            break;
          }
        }
        if(i == n) {
          System.out.println(n);
        }
      }

      System.out.println("총 연산횟수: " + counter);
    }
  }
}
