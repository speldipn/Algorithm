package data_struct.ch07_set;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-11
 */
public class ToStringTester {
  static class A {

  }

  static class B {
    int x;

    public B(int x) {
      this.x = x;
    }

    @Override
    public String toString() { return "B[" + x + "]"; }
  }

  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();
    B b1 = new B(20);
    B b2 = new B(55);

    System.out.println("a1=" + a1.toString());
    System.out.println("a2=" + a2);
    System.out.println("b1=" + b1.toString());
    System.out.println("b2=" + b2);
  }
}
