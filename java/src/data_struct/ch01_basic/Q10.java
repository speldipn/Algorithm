package data_struct.ch01_basic;

import java.util.Scanner;

public class Q10 {
  public static void main(String[] args) {
    solve();
  }

  public static void solve() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("a값 입력: ");
    int a = scanner.nextInt();
    System.out.print("b값 입력: ");
    int b = scanner.nextInt();
    while(a >= b) {
      System.out.println("a보다 큰값을 입력하세요");
      System.out.print("b값 입력: ");
      b = scanner.nextInt();
    }
    System.out.println("b - a는 " + (b - a) + "입니다.");
  }
}
