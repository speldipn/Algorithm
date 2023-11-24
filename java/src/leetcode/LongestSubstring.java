package leetcode;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-03
 */
public class LongestSubstring {
  /*
   * TODO :  20180607 failed to resolve problem
   */
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring("bbbbb"));
    System.out.println(lengthOfLongestSubstring("pwwkew"));
  }

  public static int lengthOfLongestSubstring(String s) {
    System.out.println("String : " + s);

    int maxLen = 0;

    if (s.length() == 0) {
      return 0;
    }

    for (int i = 0; i < s.length(); ++i) {
      for(int j = i; j < s.length(); ++j) {
        String temp = s.substring(i, j);
        int overlapCount = 0;
        for(int k = 0; k < 2; ++k) {
          if(s.substring(j+1).indexOf(temp)!= (-1)) {
            ++overlapCount;
          }
        }
        if(overlapCount == 0) {
          if(temp.length() > maxLen) {
            maxLen = temp.length();
          }
        }
      }
    }
    return maxLen;
  }
}