package data_struct.ch05_recursive;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-04
 */
public class Q4 {
  public static void recur(int n) {
    if(n > 0) {
      recur(n-2);
      System.out.println(n);
      recur(n-1);
    }
  }
  public static void main(String[] args) {
    recur(4);
//    Top Down Analysis
//    1 : (n-2)1(n-1) -> 1
//    2 : (n-2)2(n-1) -> 2 1
//    3 : (n-2)3(n-1) -> 1 3 2 1
//    4 : (n-2)4(n-1) -> 2 1 4 1 3 2 1
  }
}
