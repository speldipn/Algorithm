package data_struct.ch03_search;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-03
 */
public class Q1 {
  static class SeqSearchSen {
    int seqSearchSen(int[] a, int n, int key) {
      int i = 0;

      a[n] = key; // continel method

      for(;a[i] != key;) {
        ++i;
      }
      return i == n ? -1 : i;
    }
  }

  public static void main(String[] args) {
    int[] arr = {30, 20, 50, 60, 10, 40, 0};
    SeqSearchSen obj = new SeqSearchSen();
    int key = 40;
    int result;
    if((result = obj.seqSearchSen(arr, arr.length-1, key)) == (-1)) {
      System.out.println("찾지 못했습니다.");
    } else {
      System.out.println("찾았습니다 : [" + result + "] : " + key);
    }
  }
}
