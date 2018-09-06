package data_struct.ch05_recursive;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-06
 */
public class Q6 {
  static void move(int no, char from, char to, char by) {
    if (no > 1) {
      move(no - 1, from, by, to);
    }

    System.out.println("원반[" + no + "]을 " + from + "기둥에서 " + to + "기둥으로 옮김");

    if (no > 1) {
      move(no - 1, by, to, from);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("하노이의 탑");
    System.out.print("원판 개수: ");
    int no = scanner.nextInt();
    move(no, 'A', 'C', 'B');
  }
}
