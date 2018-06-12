package data_struct.ch02_array;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */
public class Q4 {
  public static void main(String[] args) {
    int[] a = new int[5];
    int[] b = {1, 2, 3, 4, 5};

    System.out.println("b: " + Arrays.toString(b));
    copy(a, b);
    System.out.println("a: " + Arrays.toString(a));
  }

  static boolean copy(int[] a, int[] b) {
    if(a.length != b.length) {
      System.out.println("데이터 사이즈를 확인해주세요.");
      return false;
    }
    for(int i = 0; i < b.length; ++i) {
      a[i] = b[i];
    }
    return true;
  }
}
