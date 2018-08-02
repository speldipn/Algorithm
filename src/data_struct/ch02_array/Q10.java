package data_struct.ch02_array;

import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-07-30
 */
public class Q10 {
  private static final int VMAX = 21;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    physcData[] x = {
      new physcData("kim", 162, 0.3),
      new physcData("park", 173, 0.7),
      new physcData("baek", 175, 2.0),
      new physcData("oh", 171, 1.3),
      new physcData("ko", 168, 0.7),
      new physcData("choi", 174, 1.2),
      new physcData("lee", 169, 0.7)
    };
    int[] vdist = new int[VMAX];

    getVision(x, vdist);
    for(int i = 0; i < vdist.length; ++i) {
      System.out.print(i / 10.0 + ": ");
      for(int j = 0; j < vdist[i]; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void getVision(physcData[] x, int[] vdist) {
    for(int i = 0; i < x.length; ++i) {
      int idx = (int)(x[i].vision * 10.0);
      vdist[idx]++;
    }
  }

  private static class physcData {
    String name;
    int tall;
    double vision;

    public physcData(String name, int tall, double vision) {
      this.name = name;
      this.tall = tall;
      this.vision = vision;
    }
  }
}
