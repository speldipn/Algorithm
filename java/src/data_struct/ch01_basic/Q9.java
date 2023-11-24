package data_struct.ch01_basic;

public class Q9 {
  public static void main(String[] args) {
    System.out.println(sum(3, 7));
    // 3 + 4 + 5 + 6 + 7 = 25
  }

  public static int sum(int start, int end) {
    return (start + end) * (end - start + 1) / 2;
  }

}
