package data_struct.ch07_set;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-12
 */
public class Q5 {
  public static void main(String[] args) {
    IntSortedSet s = new IntSortedSet(5);
    s.add(3); s.add(1);
    System.out.println("s=" + s);

    IntSortedSet s1 = new IntSortedSet(5);
    s1.add(5); s1.add(1); s1.add(3);
    System.out.println("s1=" + s1);

    IntSortedSet s2 = new IntSortedSet(5);
    s2.intersectionOf(s, s1);
    System.out.println("s와 s1의 교집합을 복사: " + s2);

    IntSortedSet s3 = new IntSortedSet(5);
    s3.differenceOf(s1, s);
    System.out.println("s1과 s의 차집합을 복사: " + s3);
  }
}
