package data_struct.ch11_hash;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-20
 */
public class ChainHashTester {
  static Scanner stdIn = new Scanner(System.in);

  static class Data {
    static final int NO = 1;
    static final int NAME = 2;

    private Integer no;
    private String name;

    Integer keyCode() {
      return no;
    }

    public String toString() {
      return name;
    }

    void scanData(String guide, int sw) {
      System.out.println(guide + "할 데이터를 입력하세요");

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
    ADD("추가"),
    REMOVE("삭제"),
    SEARCH("검색"),
    DUMP("표시"),
    TERMINATE("종료");

    private final String message;

    static Menu menuAt(int idx) {
      for (Menu m : Menu.values()) {
        if (m.ordinal() == idx) {
          return m;
        }
      }
      return null;
    }

    Menu(String message) {
      this.message = message;
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

    return Menu.menuAt(key);
  }

  public static void main(String[] args) {
    Menu menu;
    Data data;
    Data temp = new Data();

    ChainHash<Integer, Data> hash = new ChainHash<>(13);

    do {
      switch (menu = selectMenu()) {
        case ADD:
          data = new Data();
          data.scanData("추가", Data.NO | Data.NAME);
          int k = hash.add(data.keyCode(), data);
          switch (k) {
            case 1:
              System.out.println("그 키값은 이미 등록되어 있습니다.");
              break;
            case 2:
              System.out.println("해시 테이블이 가득 찼습니다.");
              break;
          }
          break;

        case REMOVE:
          temp.scanData("삭제", Data.NO);
          hash.remove(temp.keyCode());
          break;

        case SEARCH:
          temp.scanData("검색", Data.NO);
          Data d = hash.search(temp.keyCode());
          if(d == null) {
            System.out.println("검색결과가 없습니다");
          } else {
            System.out.println("검색 결과: " + d);
          }
          break;

        case DUMP:
          hash.dump();
          break;
      }
    } while (menu != Menu.TERMINATE);
  }
}
