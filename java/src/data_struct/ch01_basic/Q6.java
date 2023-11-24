package data_struct.ch01_basic;

public class Q6 {
  public static void main(String[] args) {
    whileSum(5);
    whileSum(10);
  }

  public static void whileSum(int n) {
    int sum = 0;
    int i = 0;
    while (i <= n) {
      sum += i;
      i += 1;
      if (i <= n) System.out.print(i);
      if (i < n) System.out.print(" + ");
    }
    System.out.println(" = " + sum);
  }
}
