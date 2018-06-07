package data_struct.ch01_basic;

import java.util.Scanner;

public class Max {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("숫자 입력> "); int num1 = scanner.nextInt();
    System.out.print("숫자 입력> "); int num2 = scanner.nextInt();
    System.out.print("숫자 입력> "); int num3 = scanner.nextInt();
    int max = num1;
    if(num2 > max)max = num2;
    if(num3 > max)max = num3;
    System.out.println("최대값은: " + max);
  }
}
