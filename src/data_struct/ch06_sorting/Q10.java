package data_struct.ch06_sorting;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-13
 */
public class Q10 {
  static void quickSort(int a[], int n) {
    __quickSort(a, 0, n - 1);
  }

  static void __quickSort(int a[], int l, int r) {
    int left = l;
    int right = r;
    int p = (l + r) / 2;
    int len = r + 1;

    System.out.println("p=" + p);
    while (l <= r) {
      showArray(a, len);
      System.out.println("l=" + l + " r=" + r);
      while (a[l] < p) l++;
      while (a[r] > p) r--;
      if (l <= r) {
        swap(a, l++, r--);
      }
    }
    showArray(a, a.length);
    System.out.println("l=" + l + " r=" + r);
    if (left > 0 && left < l) __quickSort(a, left, l - 1);
//    if (r < right) __quickSort(a, r + 1, right);
  }

  static void swap(int[] a, int l, int r) {
    int t = a[l];
    a[l] = a[r];
    a[r] = t;
  }

  static void showArray(int a[], int n) {
    for (int i = 0; i < n; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.print(" / ");
  }

  static void showArrayLn(int a[], int n) {
    for (int i = 0; i < n; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int sample[] = {6, 4, 8, 3, 1, 9, 7};
    Q10 ob = new Q10();
    ob.showArrayLn(sample, sample.length);
    ob.quickSort(sample, sample.length);
    System.out.println("오름차순으로 정렬했습니다");
    ob.showArrayLn(sample, sample.length);
  }
}
