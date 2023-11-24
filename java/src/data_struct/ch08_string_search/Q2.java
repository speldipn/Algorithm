package data_struct.ch08_string_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-16
 */
public class Q2 {
  static int bfLastMatch(String txt, String pat) {
    int pt = 0; // txt cursor
    int pp = 0; // pat cursor
    while (pt != txt.length() && pp != pat.length()) {
      if (txt.charAt(pt) == pat.charAt(pp)) {
        pt++;
        pp++;
      } else {
        pt = pt - pp + 1;
        pp = 0;
      }
    }
    if (pp == pat.length()) {
      return pt - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    String sample = "abadeabcdefg";
    String find = "dea";

    System.out.println("sample: " + sample);
    System.out.println("find: " + find);

    int idx = bfLastMatch(sample, find);
    if (idx == -1) {
      System.out.println("not found pattern");
    } else {
      int len = 0;
      for (int i = 0; i < idx; ++i) {
        len += sample.substring(i, i + 1).getBytes().length;
      }
      len += find.length();

      System.out.println((idx + 1) + "번째가 마지막으로 일치합니다.");
      System.out.println("텍스트: " + find);
      System.out.printf(String.format("패턴 : %%%ds\n", len), find);
    }
  }
}
