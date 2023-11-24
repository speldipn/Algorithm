package data_struct.ch06_sorting;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-09-10
 */
public class Q8 {
  private void insertSort(int[] a, int n) {
    for (int i = 1; i < n; ++i) {
      int tmp = a[i];
      int j;
      int k = binSearch(a, 0, i, tmp);
      for (j = i; j > k; --j) {
        if (a[j - 1] > tmp) {
          a[j] = a[j - 1];
        } else {
          break;
        }
      }
      a[j] = tmp;
    }
  }

  private void showArray(int[] a, int n) {
    for (int i = 0; i < n; ++i) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }


  private static int binSearch(int arr[], int s, int e, int key) {
    int start = s;
    int end = e;
    int mid = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (arr[mid] == key) {
        end = mid - 1;
      } else {
        if (arr[mid] < key) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return mid;
  }

  public static void main(String[] args) {
    int sample[] = {6, 4, 8, 3, 1, 9, 7};
    Q8 ob = new Q8();
    ob.showArray(sample, sample.length);
    ob.insertSort(sample, sample.length);
    ob.showArray(sample, sample.length);
  }
}
