package data_struct.ch02_array;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-07-24
 */
public class Q8 {
  static int[][] mdays = {
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
  };

  static int isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
  }

  static int dayOfYear(int y, int m, int d) {
    while(--m > 0) {
      d += mdays[isLeapYear(y)][m - 1];
    }
    return d;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int retry;

    System.out.println("그 해 경과 일수를 구합니다.");
    do {
      System.out.print("년: "); int year = stdIn.nextInt();
      System.out.print("월: "); int month = stdIn.nextInt();
      System.out.print("일: "); int day = stdIn.nextInt();
      System.out.println("그 해 " + dayOfYear(year, month, day) + "일째 되는 날입니다.");
      System.out.print("한 번 더 할까요? (1: 예, 0: 아니오)? "); retry = stdIn.nextInt();
    } while(retry == 1);
  }
}
