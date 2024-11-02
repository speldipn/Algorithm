package data_struct.ch08_string_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-16
 */
public class KMPmatch {
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
    
    // log
    for(int i = 1; i < skip.length; ++i)System.out.print(skip[i]);
    System.out.println();

    // search
    pt = pp = 0;
    while (pt != txt.length() && pp != pat.length()) {
      if (txt.charAt(pt) == pat.charAt(pp)) {
        pt++;
        pp++;
      } else if (pp == 0) {
        pt++;
      } else {
        pp = skip[pp];
      }
    }

    if (pp == pat.length()) {
      return pt - pp;
    }
    return -1; // search failure
  }

  public static void main(String[] args) {
    String sample = "abcabcabcd";
    String find = "abcabcd";

    System.out.println("text=" + sample + "\npattern=" + find);
    System.out.println(kmpMatch(sample, find));
  }
}
