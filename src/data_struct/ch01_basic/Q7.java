package data_struct.ch01_basic;

public class Q7 {
  public static void main(String[] args) {
    sum(7);
  }

  public static void sum(int n) {
    int result = 0;
    for (int i = 1; i <= n; ++i) {
      System.out.print(i);
      if(i < n) {
        System.out.print(" + ");
      }
      result+=i;
    }
    System.out.println(" = " + result);
  }
}
