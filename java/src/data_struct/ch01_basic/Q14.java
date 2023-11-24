package data_struct.ch01_basic;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class Q14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("단 수: ");
    int length = scanner.nextInt();
    drawRect(length);
  }

  public static void drawRect(int size) {
    for(int i = 0; i < size; ++i) {
      for(int j = 0; j < size; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
