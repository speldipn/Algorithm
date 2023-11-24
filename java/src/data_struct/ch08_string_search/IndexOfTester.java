package data_struct.ch08_string_search;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-16
 */
public class IndexOfTester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("text: ");
    String s1 = scanner.next();

    System.out.print("pattern: ");
    String s2 = scanner.next();

    int idx1 = s1.indexOf(s2);
    int idx2 = s1.lastIndexOf(s2);

    System.out.println("idx1=" + idx1 + " idx2=" + idx2);

    if (idx1 == -1) {
      System.out.println("not found pattern.");
    } else {
      int len1 = 0;
      for (int i =0; i < idx1; ++i) {
        len1 += s1.substring(i, i + 1).getBytes().length;
      }
      len1 += s2.length();

      int len2 = 0;
      for (int i = 0; i < idx2; ++i) {
        len2 += s1.substring(i, i + 1).getBytes().length;
      }
      len2 += s2.length();

      System.out.println("text: " + s1);
      System.out.printf(String.format("pattern: %%%ds\n", len1), s2);
      System.out.println("text: " + s1);
      System.out.printf(String.format("Pattern: %%%ds\n", len2), s2);

    }
  }
}
