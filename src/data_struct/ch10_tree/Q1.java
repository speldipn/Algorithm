package data_struct.ch10_tree;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-19
 */
public class Q1 {
  public static void main(String[] args) {
    BinTree<Integer, String> bt = new BinTree<>();
    bt.add(1, "A");
    bt.add(5, "E");
    bt.add(3, "C");
    bt.add(2, "B");
    bt.add(4, "D");

    bt.print();

    System.out.println("Reverse");
    bt.printReverse();
  }
}
