package data_struct.ch01_basic;

public class Q5 {
  public static void main(String[] args) {
    System.out.println(med3(1, 3, 2));
    System.out.println(med3(1, -1, 2));
    System.out.println(med3(1, 5, 2));
    System.out.println(med3(1, 1, 2));
  }

  public static int med3(int a, int b, int c) {
    // 앞에 조건을 충족하더라도 ||(OR)을 사용하기 때문에 뒤에꺼지 검사를 하게된다.
    // 즉, 불필요한 비교연산이 추가로 일어난다.
    if((b >= a) && (c <= a) || (b <= a && c >= a)) {
      return a;
    } else if((a > b && c < b) || (a < b && c > b)) {
      return b;
    }
    return c;
  }
}
