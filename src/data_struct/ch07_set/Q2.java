package data_struct.ch07_set;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-11
 */
public class Q2 {
  public static void main(String[] args) {
    IntSet s = new IntSet(5);
    s.add(1); s.add(2); s.add(3); s.add(4);
    System.out.println("s: " + s);

    IntSet s1 = new IntSet(5);
    s1.add(5); s1.add(6); s1.add(2); s1.add(1);
    System.out.println("s1: " + s1);

//    s.add(s1);
//    System.out.println("합집합: " + s);

//    s.retain(s1);
//    System.out.println("교집합: " + s);

//    s.remove(s1);
//    System.out.println("차집합: " + s);

  }
}
