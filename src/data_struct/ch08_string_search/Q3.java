package data_struct.ch08_string_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-17
 */
public class Q3 {
  static int kmpMatch(String txt, String pat) {
    int pt = 1; // text
    int pp = 0; // pattern
    int skip[] = new int[pat.length() + 1];

    // create table
    skip[pt] = 0;
    while (pt != pat.length()) {
      if (pat.charAt(pt) == pat.charAt(pp)) {
        skip[++pt] = ++pp;
      } else if (pp == 0) {
        skip[++pt] = pp;
      } else {
        pp = skip[pp];
      }
    }
    System.out.println("created table");
    for (int i = 1; i < skip.length; ++i) {
      System.out.println("Pi[" + i + "]: " + skip[i]);
    }

    int count = 0;
    boolean reStart = true;
    int skipSize = 0;
    // search
    pt = pp = 0;
    while (pt != txt.length() && pp != pat.length()) {
      if (reStart) {
        System.out.format("%-3d%s\n", ++count, txt);
        reStart = false;
      } else {
        System.out.format("   %s\n", txt);
      }
      for (int i = 0; i < pt + 3; ++i) System.out.print(" ");
      char mark;
      boolean bSkip = false;

      if (txt.charAt(pt) == pat.charAt(pp)) {
        mark = '+';
        pt++;
        pp++;
      } else if (pp == 0) {
        mark = '|';
        pt++;
        reStart = true;
      } else {
        mark = '|';
        pp = skip[pp];
        reStart = true;
        bSkip = true;
      }
      System.out.println(mark);
      int len = (count - 1) + 3 + skipSize;
      if (bSkip) {
        skipSize += pp - 1;
        bSkip = false;
      }
      for (int i = 0; i < len; ++i) System.out.print(" ");
      System.out.println(pat);
    }

    if (pp == pat.length()) {
      return pt - pp;
    }
    return -1; // search failure
  }

  public static void main(String[] args) {
    String sample = "abcabcabcabcd";
    String find = "abcabcd";

    System.out.println("text=" + sample + "\npattern=" + find);
    System.out.println("\n\nresult: " + (kmpMatch(sample, find) + 1) + "번째부터 일치합니다");
  }
}
