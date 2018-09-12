package data_struct.ch07_set;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-11
 */
public class Q1 {
  public static void main(String[] args) {
    IntSet s = new IntSet(5);
    System.out.println(s);
    System.out.println("isEmpty: " + s.isEmpty());
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(40);
    System.out.println(s);
    System.out.println("isEmpty: " + s.isEmpty());
    System.out.println(s);
    System.out.println("isFull: " + s.isFull());
    s.add(50);
    System.out.println(s);
    System.out.println("isFull: " + s.isFull());
    System.out.println("Clear() 호출됨");
    s.clear();
    System.out.println(s);
  }
}
