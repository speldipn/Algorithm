package data_struct.ch03_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-30
 */
public class Q6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("요솟수: ");
    int num = scanner.nextInt();
    int[] x = new int[num];
    System.out.println("오름차순으로 입력하세요.");
    System.out.print("x[0]: ");
    x[0] = scanner.nextInt();
    for (int i = 1; i < num; ++i) {
      do {
        System.out.print("x[" + i + "]: ");
        x[i] = scanner.nextInt();
      } while (x[i] < x[i - 1]);
    }
    System.out.print("검색할 값: ");
    int ky = scanner.nextInt();
    int idx = Arrays.binarySearch(x, ky);
    if (idx < 0) {
      System.out.println("값을 찾지 못하였습니다 " + ky + " idx=" + idx);
      System.out.println("삽입하기에 적당한 Idx: " + findInsertIdx(x, ky));
    } else {
      System.out.println("값을 찾았습니다. idx=" + idx + " value=" + x[idx]);
    }
  }

  private static int findInsertIdx(int x[], int key) {
    int idx = 0;
    int arr[] = new int[x.length + 1];
    System.arraycopy(x, 0, arr, 0, x.length);
    arr[x.length] = x[x.length - 1];
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] < key) {
        idx = i;
        break;
      }
    }
    return idx;
  }
}
