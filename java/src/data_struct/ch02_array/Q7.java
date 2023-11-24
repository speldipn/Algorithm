package data_struct.ch02_array;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-12
 */


public class Q7 {

  static class ConvNum {
    public void convert(int n, int r, char[] a) {
      int idx = 0;
      char[] arr = new char[a.length];
      String values = "0123456789ABCDEF";

      if (r > 16) {
        System.out.println("기수를 확인해주세요");
        return;
      }

      int remain = 0;
      System.out.format("%2d|\t\t%d\n", r, n);
      while (true) {
        if (idx > 0) {
          if (n >= r) {
            System.out.format("%2d|\t\t%d --- %2d\n", r, n, remain);
          } else {
            System.out.format("   \t\t%d --- %2d\n", n, remain);
          }
        }
        remain = n % r;
        arr[idx++] = values.charAt(remain);
        n /= r;
        if (n == 0) {
          break;
        } else {
          System.out.println("  +-------");
        }
      }
      String str = "";
      for (int i = arr.length - 1; i >= 0; --i) {
        if (Character.isDigit(arr[i]) || Character.isAlphabetic(arr[i])) {
          str += arr[i];
        }
      }
      for (int i = 0; i < str.length(); ++i) {
        a[i] = str.charAt(i);
      }
      System.out.println();
      System.out.println(r + "진수로 변환된 값은" + str + "입니다");
    }
  }

  public static void main(String[] args) {
    ConvNum convNum = new ConvNum();
    char arr[] = new char[100];
    convNum.convert(10, 2, arr);
  }
}
