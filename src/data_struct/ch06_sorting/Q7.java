package data_struct.ch06_sorting;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-10
 */
public class Q7 {
  private void insertSort(int[] a, int n) {
    for (int i = 1; i < n; ++i) {
      int tmp = a[i];
      int j;
      for (j = i; j > 0; --j) {
        if (a[j - 1] > tmp) {
          a[j] = a[j - 1];
        } else {
          break;
        }
      }
      a[j] = tmp;
    }
  }

  private void insertSortSentinel(int a[], int n) {
    // 보초법을 사용하게 되면 j > 0 과 같은 조건문이 제거되어 성능 향상을 기대할 수 있지만
    // [0] 값에 최솟값이 들어가야 하기때문에 완벽한 알고리즘이라고 말하기 어렵다.
    int arr[] = new int[n + 1];
    System.arraycopy(a, 0, arr, 1, a.length);
    arr[0] = (-1);
    int len = arr.length;
    for (int i = 2; i < len; ++i) {
      int tmp = arr[i];
      int j = i;
      while (arr[j - 1] > tmp) {
        arr[j] = arr[j - 1];
        --j;
      }
      arr[j] = tmp;
    }
    System.arraycopy(arr, 1, a, 0, a.length);
  }

  private void showArray(int[] a, int n) {
    for (int i = 0; i < n; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int sample[] = {6, 4, 8, 3, 1, 9, 7};
    Q7 ob = new Q7();
    ob.showArray(sample, sample.length);
    ob.insertSortSentinel(sample, sample.length);
    ob.showArray(sample, sample.length);

    int sample1[] = {50, 40, 10, 20, 30, 70};
    ob.showArray(sample1, sample1.length);
    ob.insertSortSentinel(sample1, sample1.length);
    ob.showArray(sample1, sample1.length);
  }
}
