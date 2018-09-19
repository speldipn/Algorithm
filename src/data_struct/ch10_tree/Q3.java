package data_struct.ch10_tree;

import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-20
 */
public class Q3 {
  static Scanner stdIn = new Scanner(System.in);

  static class Data {
    public static final int NO = 1;
    public static final int NAME = 2;

    private Integer no;
    private String name;

    Integer keyCode() {
      return no;
    }

    public String toString() {
      return name;
    }

    void scanData(String guide, int sw) {
      System.out.println(guide + "할 데이터를 입력하세요.");

      if ((sw & NO) == NO) {
        System.out.print("번호: ");
        no = stdIn.nextInt();
      }
      if ((sw & NAME) == NAME) {
        System.out.print("이름: ");
        name = stdIn.next();
      }
    }
  }

  enum Menu {
    ADD("삽입"),
    REMOVE("삭제"),
    SEARCH("검색"),
    PRINT("표시"),
    TERMINATE("종료");

    private final String message;

    static Menu MenuAt(int idx) {
      for (Menu m : Menu.values()) {
        if (m.ordinal() == idx) {
          return m;
        }
      }
      return null;
    }

    Menu(String string) {
      message = string;
    }

    String getMessage() {
      return message;
    }
  }

  static Menu selectMenu() {
    int key;
    do {
      for (Menu m : Menu.values()) {
        System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
      }
      System.out.print(":");
      key = stdIn.nextInt();
    } while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

    return Menu.MenuAt(key);
  }

  public static void main(String[] args) {
    Menu menu;
    Data data;
    Data ptr;
    Data temp = new Data();
    Comparator<Integer> c = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return (o1 < o2 ? -1 : (o1 == o2) ? 0 : 1);
      }
    };
    BinTree<Integer, Data> tree = new BinTree<>(c);

    do {
      switch ( menu = selectMenu()) {
        case ADD:
          data = new Data();
          data.scanData("삽입", Data.NO | Data.NAME);
          tree.add(data.keyCode(), data);
          break;
        case REMOVE:
          data = new Data();
          data.scanData("삭제", Data.NO);
          tree.remove(data.keyCode());
          break;
        case PRINT:
          tree.print();
          break;
        case SEARCH:
          data = new Data();
          data.scanData("검색", Data.NO);
          System.out.println("검색 결과: " + tree.search(data.keyCode()));
          break;
      }
    } while (menu != Menu.TERMINATE);
  }
}
