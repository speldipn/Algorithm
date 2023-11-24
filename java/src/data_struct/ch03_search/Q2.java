package data_struct.ch03_search;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-03
 */
public class Q2 {
  static class SeqSearchSen {
    int seqSearchSen(int[] a, int n, int key) {
      int i = (-1);

      a[n] = key; // continel method

      stampStart(n);
      do {
        ++i;
        stampStar(a, a[i]);
        stampNumber(a, i);
      } while(a[i] != key);

      return i == n ? -1 : i;
    }

    void stampNumber(int[] arr, int idx) {
      for (int i = 0; i < arr.length-1; ++i) {
        if (i == 0) {
          System.out.format("%-2d|", idx);
        }
        System.out.format(" %2d", arr[i]);
      }
      System.out.println();
    }

    void stampStar(int[] arr, int key) {
      for (int i = 0; i < arr.length-1; ++i) {
        if (i == 0) {
          System.out.print("  |");
        }
        if (arr[i] == key) {
          System.out.print("  *");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }

    void stampStart(int n) {
      for(int k = 0; k <= n; ++k) {
        if(k == 0) {
          System.out.print("  |");
        } else {
          System.out.format(" %2d", k-1);
        }
      }
      System.out.println();
      System.out.println("--+-----------------------------");

    }
  }

  public static void main(String[] args) {
    // need +1 length, because of continel method
    int[] arr = {30, 20, 50, 60, 10, 40, 8, 12, 0};

    SeqSearchSen obj = new SeqSearchSen();
    int key = 12;
    int result;
    if ((result = obj.seqSearchSen(arr, arr.length - 1, key)) == (-1)) {
      System.out.println("\n찾지 못했습니다.");
    } else {
      System.out.println("\n찾았습니다 [" + result + "] : " + key);
    }
  }
}
