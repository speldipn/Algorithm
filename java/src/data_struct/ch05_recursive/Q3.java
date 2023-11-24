package data_struct.ch05_recursive;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-04
 */
public class Q3 {
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

  public static int gcdArray(int[] x) {
    int gvalue = 0;
    for(int i = 1; i < x.length; ++i) {
      if(gcd(x[i-1], x[i]) > gvalue) {
        gvalue = gcd(x[i-1], x[i]);
      }
    }
    return gvalue;
  }

  public static void showArray(int[] x) {
    for(int i = 0; i < x.length; ++i) {
      System.out.print(x[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int x[] = {24, 40, 48};
    int x1[] = {24, 36, 60};
    int x2[] = {80, 60, 100};

    showArray(x);
    System.out.println(gcdArray(x));

    showArray(x1);
    System.out.println(gcdArray(x1));

    showArray(x2);
    System.out.println(gcdArray(x2));
  }
}
