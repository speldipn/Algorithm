package data_struct.ch10_tree;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-20
 */
public class Q2 {
  public static void main(String[] args) {
    BinTree<Integer, String> bt = new BinTree<>();
    bt.add(3, "C");
    bt.add(2, "B");
    bt.add(5, "E");
    bt.add(1, "A");
    bt.add(4, "D");
    bt.print();

    System.out.println("Min: " + bt.getDataWithMinKey());
    System.out.println("Max: " + bt.getDataWithMaxKey());

    BinTree<Integer, String> bt1= new BinTree<>();
    bt1.add(3, "C");
    bt1.add(6, "F");
    bt1.add(1, "A");
    bt1.print();

    System.out.println("Min: " + bt1.getDataWithMinKey());
    System.out.println("Max: " + bt1.getDataWithMaxKey());
  }
}
