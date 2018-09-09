package data_struct.ch06_sorting;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-08
 */
public class Q5 {
  private static int compareCnt = 0;
  private static int changeCnt = 0;

  public static void cocktailSort(int[] a, int n) {
    int start = 1;
    int end = n;
    boolean bReverse = false;
    changeCnt = 0;
    compareCnt = 0;
    while (start < end) {
      if (!bReverse) {
        for (int j = start; j < end; ++j) {
          ++compareCnt;
          if (a[j - 1] > a[j]) { /* left to right */
            showArray(a);
            System.out.println("forward: " + a[j - 1] + " > " + a[j]);
            swap(a, j - 1, j);
            ++changeCnt;
          }
        }
        --end;
      } else {
        for (int j = end; j >= start; --j) {
          ++compareCnt;
          if (a[j - 1] > a[j]) { /* right to left */
            swap(a, j, j - 1);
            showArray(a);
            System.out.println("backward: " + a[j] + " > " + a[j - 1]);
            ++changeCnt;
          }
        }
        ++start;
      }
      bReverse = !bReverse;
    }
    System.out.println("비교횟수: " + compareCnt);
    System.out.println("교환횟수: " + changeCnt);
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void showArray(int a[]) {
    for (int i = 0; i < a.length; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.print("  ");
  }

  public static void showArrayLF(int a[]) {
    for (int i = 0; i < a.length; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int sample[] = {5, 1, 4, 2, 8, 0, 2};
    Q5 ob = new Q5();
    ob.showArrayLF(sample);
    ob.cocktailSort(sample, sample.length);
    ob.showArrayLF(sample);
  }
}
