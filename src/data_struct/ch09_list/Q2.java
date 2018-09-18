package data_struct.ch09_list;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-17
 */
public class Q2 {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(50);
    list.addLast(30);
    list.addLast(10);
    list.dump();

    System.out.println();
    System.out.println(list.retrieve(-1));
    System.out.println(list.retrieve(0));
    System.out.println(list.retrieve(1));
    System.out.println(list.retrieve(2));
    System.out.println(list.retrieve(3));
  }
}
