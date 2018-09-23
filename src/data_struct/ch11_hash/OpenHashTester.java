package data_struct.ch11_hash;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-23
 */
public class OpenHashTester {
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
    ADD("추가"),
    REMOVE("삭제"),
    SEARCH("검색"),
    DUMP("출력"),
    TERMINATE("종료");

    private final String message;

    static Menu menuAt(int idx) {
      Menu p = null;
      for (Menu m : Menu.values()) {
        if (m.ordinal() == idx) {
          p = m;
        }
      }
      return p;
    }

    Menu(String msg) {
      message = msg;
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

    OpenHash<Integer, Data> hash = new OpenHash<Integer, Data>(13);
    do {
      switch (menu = selectMenu()) {
        case ADD:
          data = new Data();
          data.scanData("추가", Data.NAME | Data.NO);
          int k = hash.add(data.keyCode(), data);
          switch (k) {
            case 1:
              System.out.println("그 키 값은 이미 등록되어 있습니다");
              break;
            case 2:
              System.out.println("해시 테이블이 가득 찼습니다");
              break;
          }
          break;

        case REMOVE:
          temp.scanData("삭제", Data.NO);
          hash.remove(temp.keyCode());
          break;

        case SEARCH:
          temp.scanData("검색", Data.NO);
          Data t = hash.search(temp.keyCode());
          if (t != null) {
            System.out.println("그 키를 갖는 데이터는 " + t + " 입니다");
          } else {
            System.out.println("그 데이터는 없습니다");
          }
          break;

        case DUMP:
          hash.dump();
          break;
      }
    } while (menu != Menu.TERMINATE);
  }
}
