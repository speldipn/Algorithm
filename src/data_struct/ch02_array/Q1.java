package data_struct.ch02_array;

import java.util.Random;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-11
 */

class MaxOfArrayRand {
  static int maxOf(int[] a) {
    int max = 0;
    for (int i = 0; i < a.length; ++i) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    return max;
  }
}

public class Q1 {
  public static void main(String[] args) {
    int maxHeight = 0;
    Random random = new Random();

    final int peopleCnt = random.nextInt(10) + 2; // 2 ~ 11
    int[] peopleHeightArray = new int[peopleCnt];
    for (int i = 0; i < peopleCnt; ++i) {
      peopleHeightArray[i] = random.nextInt(90) + 100; // 100 ~ 189
      System.out.println((i+1) + "번째 사람의 키는 " + peopleHeightArray[i]);
    }
    for(int i = 0; i < peopleCnt; ++i) {
      if(peopleHeightArray[i] > maxHeight) {
        maxHeight = peopleHeightArray[i];
      }
    }
    System.out.println("가장 키가 큰 사람의 키는: " + maxHeight);
  }
}
