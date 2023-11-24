package data_struct.ch07_set;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-11
 */
public class IntSet {
  private int max;
  private int num;
  private int[] set;

  public IntSet(int capacity) {
    try {
      set = new int[capacity];
      num = 0;
      max = capacity;
    } catch (OutOfMemoryError e) {
      max = 0;
      throw new SetOutOfMemory();
    }
  }

  public int capacity() {
    return max;
  }

  public int size() {
    return num;
  }

  public int indexOf(int n) {
    for (int i = 0; i < num; ++i) {
      if (set[i] == n) {
        return i;
      }
    }
    return (-1);
  }

  public boolean contains(int n) {
    return (indexOf(n) >= 0) ? true : false;
  }

  public boolean add(int n) {
    if (num >= max) {
      System.out.println("배열이 가득찼습니다.");
      return false;
    }
    if (contains(n)) {
      return false;
    }
    set[num++] = n;
    return true;
  }

  public boolean del(int n) {
    int idx;
    if (num == 0 || (idx = indexOf(n)) == -1) {
      System.out.println("제거할 대상이 없습니다");
      return false;
    }
    set[idx] = set[--num];
    return true;
  }

  public void show() {
    for (int i = 0; i < num; ++i) {
      System.out.println(set[i] + " ");
    }
    System.out.println();
  }

  class SetOutOfMemory extends RuntimeException {
    public SetOutOfMemory() {
    }
  }

  public void copyTo(IntSet s) {
    int n = (s.max < num) ? s.max : num;
    for (int i = 0; i < n; ++i) {
      s.set[i] = set[i];
    }
    s.num = n;
  }

  public void copyFrom(IntSet s) {
    int n = max < s.num ? max : s.num;
    for (int i = 0; i < n; ++i) {
      set[i] = s.set[i];
    }
    num = n;
  }

  public boolean equalTo(IntSet s) {
    if (num != s.num) {
      return false;
    }

    for (int i = 0; i < num; ++i) {
      int j = 0;
      for (; j < s.num; ++j) {
        if (set[i] == s.set[j]) {
          break;
        }
      }
      if (j == s.num) { // no match
        return false;
      }
    }
    return true;
  }

  public void unionOf(IntSet s1, IntSet s2) {
    copyFrom(s1);
    for (int n = 0; n < s2.num; ++n) {
      add(s2.set[n]);
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("{ ");
    for (int i = 0; i < num; ++i) {
      sb.append(set[i] + " ");
    }
    sb.append("}");
    return sb.toString();
  }

  public boolean isEmpty() {
    return (num == 0) ? true : false;
  }

  public boolean isFull() {
    return (num >= max) ? true : false;
  }

  public void clear() {
    num = 0;
  }

  /* --- */

  public boolean add(IntSet s) {
    int n = max - num;
    if (n < 0) {
      return false;
    }
    int cnt = 0;
    for (int i = 0; i < s.num; ++i) {
      if (add(s.set[i])) {
        ++cnt;
      }
      if (cnt >= n) {
        break;
      }
    }
    return true;
  }

  public boolean retain(IntSet s) { // 교집합
    boolean isChanged = false;
    boolean x[] = new boolean[num];
    for (int i = 0; i < num; ++i) {
      if (s.indexOf(set[i]) == (-1)) {
        x[i] = true;
      }
    }
    for (int i = 0; i < x.length; ++i) {
      if (x[i]) {
        del(set[i]);
        isChanged = true;
      }
    }
    return isChanged;
  }

  public boolean remove(IntSet s) { // 차집합
    boolean isChanged = false;
    boolean x[] = new boolean[num];
    for (int i = 0; i < num; ++i) {
      if (s.indexOf(set[i]) != (-1)) {
        x[i] = true;
      }
    }
    for (int i = 0; i < x.length; ++i) {
      if (x[i]) {
        del(set[i]);
        isChanged = true;
      }
    }
    return isChanged;
  }

  public boolean isSubsetOf(IntSet s) { // 부분집합
    IntSet tmp = new IntSet(s.max);
    tmp.copyFrom(s);
    tmp.remove(s);
    return (tmp.num == 0) ? true : false;
  }

  public boolean isProperSubsetOf(IntSet s) { // 진부분집합
    IntSet tmp = new IntSet(s.max);
    tmp.copyFrom(s);
    for(int i = 0; i < num; ++i) {
      tmp.del(s.set[i]);
    }
    return (tmp.num != 0) ? true : false;
  }

  public void intersectionOf(IntSet s1, IntSet s2) { // 교집합
    IntSet s = new IntSet(s1.max);
    s.copyFrom(s1);
    s1.retain(s2);
    add(s1);
  }

  public void differenceOf(IntSet s1, IntSet s2) { // 차집합
    IntSet s = new IntSet(s1.max);
    s.copyFrom(s1);
    s1.remove(s2);
    add(s1);
  }

  public static void main(String[] args) {
    IntSet s = new IntSet(5);
    s.add(5);
    s.add(1);
    s.add(2);
    s.add(4);
    s.add(3);
    System.out.println(s.toString());
    IntSet s1 = new IntSet(5);
    IntSet s2 = new IntSet(5);
    s1.add(50);
    s1.add(40);
    s1.add(10);
    s1.add(20);
    s1.add(30);
    System.out.println(s1.toString());
    s2.add(55);
    s2.add(45);
    s2.add(15);
    s2.add(25);
    s2.add(35);
    System.out.println(s2.toString());
    IntSet s3 = new IntSet(10);
    s3.unionOf(s1, s2);
    System.out.println(s3);
  }
}
