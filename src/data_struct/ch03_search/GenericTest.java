package data_struct.ch03_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-01
 */
public class GenericTest {
  static class GenericSimple<T> {
    T x;
    public GenericSimple(T x) {
      this.x = x;
    }

    public T getData() {
      return x;
    }
  }
  public static void main(String[] args) {
    GenericSimple<String> str = new GenericSimple<String>("String");
    GenericSimple<Integer> Int = new GenericSimple<>(31);

    System.out.println(str.getData());
    System.out.println(Int.getData());
  }
}
