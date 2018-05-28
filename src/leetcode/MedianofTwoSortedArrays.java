package leetcode;

import java.util.*;

public class MedianofTwoSortedArrays {

  public static void main(String[] args) {
    System.out.println(solve(new int[] {1, 3}, new int[] {2})); // 2
    System.out.println(solve(new int[] {1, 2}, new int[] {3, 4})); // 2.5
  }

  public static double solve(int[] nums1, int[] nums2) {
    double result = 0;

    printArray(nums1);
    printArray(nums2);

    List<Integer> list = new ArrayList<>();
    for(int idx = 0; idx < nums1.length; ++idx) {
      list.add(nums1[idx]);
    }

    for(int idx = 0; idx < nums2.length; ++idx) {
      list.add(nums2[idx]);
    }
    Collections.sort(list, new Ascending());

    if(list.size() % 2 == 0) {
      int idx = list.size() >> 1;
      result = list.get(idx) + list.get(idx - 1);
      result /= 2;
    } else {
      result = list.get(list.size() >> 1);
    }

    return result;
  }

  public static void printArray(int[] arr) {
    System.out.print("[");
    for(int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i]);
      if(i < arr.length-1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  static class Ascending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      return o1.compareTo(o2);
    }
  }
}