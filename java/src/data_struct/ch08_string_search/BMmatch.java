package data_struct.ch08_string_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-17
 */
public class BMmatch {
  static int bmMatch(String txt, String pat) {
    int pt; // txt 커서
    int pp; // pat 커서
    int txtLen = txt.length();
    int patLen = pat.length();
    int[] skip = new int[Character.MAX_VALUE + 1]; // 건너띄기 표

    // 건너띄기 표 만들기
    for (pt = 0; pt <= Character.MAX_VALUE; ++pt) {
      skip[pt] = patLen;
    }
    for (pt = 0; pt < patLen - 1; ++pt) {
      skip[pat.charAt(pt)] = patLen - pt - 1; // pt == patLen - 1
    }

    // 검색
    while (pt < txtLen) {
      pp = patLen - 1;  // pat의 끝 문자에 주목

      while (txt.charAt(pt) == pat.charAt(pp)) {
        if (pp == 0) {
          return pt; // 검색 성공
        }
        --pp;
        --pt;
      }
      pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
    }
    return -1; // 검색 실패
  }

  public static void main(String[] args) {
    String sample = "abcabcabcabcd";
    String find = "abcabcd";

    System.out.println("text=" + sample + "\npattern=" + find);
    System.out.println("\n\nresult: " + (bmMatch(sample, find) + 1) + "번째부터 일치합니다");
  }
}
