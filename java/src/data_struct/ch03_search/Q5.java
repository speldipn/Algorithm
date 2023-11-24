package data_struct.ch03_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-30
 */
public class Q5 {
  public static void main(String[] args) {
    solve(new int[]{1, 5, 5, 7, 7, 7, 7, 8, 8, 9, 9}, 9);
    solve(new int[]{10, 20, 30, 40, 50, 50, 50}, 50);
  }

  private static void solve(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;
    printArray(arr);
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
    System.out.println("find key=" + key + " index=" + mid);
  }

  private static void printArray(int arr[]) {
    System.out.println("count: " + arr.length);
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
} // end of class
