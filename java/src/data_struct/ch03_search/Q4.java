package data_struct.ch03_search;

import java.sql.SQLOutput;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-29
 */
public class Q4 {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 5, 6, 8, 9};
    solve(arr, 3);
    System.out.println("\n");
    solve(arr, 9);
    System.out.println("\n");
    solve(arr, 6);
  }

  private static void solve(int arr[], int key) {
    int start = 0;
    int end = arr.length - 1;
    String line = "   | ";
    for (int i = 0; i < arr.length; ++i) {
      line += String.format("%2d ", i);
    }
    System.out.println(line);
    for (int i = 0; i < line.length(); ++i) {
      if (i == 3) {
        System.out.print("+");
      } else {
        System.out.print("-");
      }
    }
    System.out.println();
    while (start <= end) {
      int mid = (start + end) / 2;
      printArrow(start, end);
      printNumber(arr, start, end);
      if(arr[mid] == key) {
        break;
      } else {
        if(arr[mid] < key) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
  }

  private static void printArrow(int start, int end) {
    int mid = (start + end) / 2;
    System.out.print("   |");
    for(int i = 0; i <= end; ++i) {
      if(i == mid) {
        System.out.print("  +");
      } else if(i == start) {
        System.out.print("  <");
      } else if(i == end) {
        System.out.print("  >");
      } else {
        System.out.print("   ");
      }
    }
    System.out.println();
  }

  private static void printNumber(int[] arr, int start, int end) {
    int mid = (start + end) / 2;
    String line = String.format(" %2d|", mid);
    for(int i = 0; i < arr.length; ++i) {
      line += String.format(" %2d", arr[i]);
    }
    System.out.println(line);
  }
}
