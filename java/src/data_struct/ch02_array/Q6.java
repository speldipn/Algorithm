package data_struct.ch02_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-12
 */

public class Q6 {

  static class ConvNum {
    public void convert(int n, int r, char[] a) {
      int idx = 0;
      char[] arr = new char[a.length];
      String values = "0123456789ABCDEF";

      if (r > 16) {
        System.out.println("기수를 확인해주세요");
        return;
      }

      while (true) {
        arr[idx++] = values.charAt(n % r);
        n /= r;
        if (n == 0) {
          break;
        }
      }
      String str = "";
      for (int i = arr.length - 1; i >= 0; --i) {
        if (Character.isDigit(arr[i]) || Character.isAlphabetic(arr[i])) {
          str += arr[i];
        }
      }
      for(int i = 0; i < str.length(); ++i) {
        a[i] = str.charAt(i);
      }
    }
  }

  public static void main(String[] args) {
    ConvNum convNum = new ConvNum();
    char[] arr = new char[100];
    convNum.convert(500, 16, arr);
    System.out.println(arr);
  }
}
