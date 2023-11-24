package data_struct.ch08_string_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-16
 */
public class Q1 {
  static int bfMatch(String txt, String pat) {
    int pt = 0; // txt cursor
    int pp = 0; // pat cursor
    int count = 0;
    boolean reStart = true;

    while (pt != txt.length() && pp != pat.length()) {
      if (reStart) {
        System.out.format("%-3d%s\n", ++count, txt);
        reStart = false;
      } else {
        System.out.format("   %s\n", txt);
      }
      for (int i = 0; i < pt + 3; ++i) System.out.print(" ");
      char mark;
      if (txt.charAt(pt) == pat.charAt(pp)) {
        mark = '+';
        pt++;
        pp++;
      } else {
        mark = '|';
        pt = pt - pp + 1;
        pp = 0;
        reStart = true;
      }
      System.out.println(mark);
      for (int i = 0; i < (count - 1) + 3; ++i) System.out.print(" ");
      System.out.println(pat);
    }
    if (pp == pat.length()) {
      return pt - pp;
    }
    return -1;
  }

  public static void main(String[] args) {
    String sample = "abadeabcdefg";
    String find = "abc";

    System.out.println("sample: " + sample);
    System.out.println("find: " + find);

    int idx = bfMatch(sample, find);
    if (idx == -1) {
      System.out.println("not found pattern");
    } else {
      int len = 0;
      for (int i = 0; i < idx; ++i) {
        len += sample.substring(i, i + 1).getBytes().length;
      }
      len += find.length();

      System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
      System.out.println("텍스트: " + find);
      System.out.printf(String.format("패턴 : %%%ds\n", len), find);
    }
  }
}
