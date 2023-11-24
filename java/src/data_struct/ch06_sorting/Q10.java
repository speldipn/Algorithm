package data_struct.ch06_sorting;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-13
 */
public class Q10 {
  static void quickSort(int a[], int n) {
    __quickSort(a, 0, n - 1);
  }

  static void __quickSort(int a[], int left, int right) {
    int l = left;
    int r = right;
    int p = a[(l + r) / 2];
    int len = r + 1;
    while (l <= r) {
      while (a[l] < p) l++;
      while (a[r] > p) r--;
      if (l <= r) {
        swap(a, l++, r--);
      }
    }
    if (left < r) __quickSort(a, left, r);
    if (l < right) __quickSort(a, l, right);
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
    ob.showArrayLn(sample, sample.length);
  }
}
