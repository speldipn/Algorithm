package data_struct.ch09_list;

import java.util.Comparator;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-17
 */
public class Q1 {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(10);
    list.addLast(40);
    list.addLast(50);
    list.addLast(10);
    list.dump();

    list.purge(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 == o2 ? 1 : 0;
      }
    });
  }
}
