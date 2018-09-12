package data_struct.ch07_set;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-11
 */
public class Q3 {
  public static void main(String[] args) {
    IntSet s = new IntSet(5);
    IntSet s1 = new IntSet(5);
    IntSet s2 = new IntSet(5);
    s.add(1); s.add(3);
    s1.add(1); s1.add(3); s1.add(5);
    s2.add(1); s2.add(3); s2.add(5);

    System.out.println("s=" + s);
    System.out.println("s1=" + s1);
    System.out.println("s2=" + s2);

    System.out.println("s는 s1의 " + ((s.isSubsetOf(s1) == true) ? "부분집합이다" : "부분집합이 아니다")); // 부분집합
    System.out.println("s1는 s2의 " + ((s1.isSubsetOf(s2) == true) ? "부분집합이다" : "부분집합이 아니다")); // 부분집합

    System.out.println("s는 s1의 " + ((s.isProperSubsetOf(s1) == true) ? "진부분집합이다" : "진부분집합이 아니다")); // 진부분집합
    System.out.println("s1는 s2의 " + ((s1.isProperSubsetOf(s2) == true) ? "진부분집합이다" : "진부분집합이 아니다")); // 진부분집합(x)

    IntSet s3 = new IntSet(5);
    s3.add(1);
    System.out.println("s3는 s1의 " + ((s3.isSubsetOf(s1) == true) ? "부분집합이다" : "부분집합이 아니다")); // 부분집합
    System.out.println("s3는 s1의 " + ((s3.isProperSubsetOf(s2) == true) ? "진부분집합이다" : "진부분집합이 아니다")); // 진부분집합
  }
}
