package data_struct.ch03_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-31
 */
public class Q7 {
  static class PhyscData {
    private String name;
    private int    height;
    private double vision;

    public PhyscData(String name, int height, double vision) {
      this.name = name;
      this.height = height;
      this.vision = vision;
    }

    @Override
    public String toString() {
      return "PhyscData{" +
        "name='" + name + '\'' +
        ", height=" + height +
        ", vision=" + vision +
        '}';
    }

    public static final Comparator<PhyscData> LOW_ORDER =
      new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<PhyscData> {
      @Override
      public int compare(PhyscData o1, PhyscData o2) {
        if(o1.vision < o2.vision) return 1;
        else if(o1.vision > o2.vision) return -1;
        else return 0;
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PhyscData[] x = {
      new PhyscData("이수민", 172, 2.0),
      new PhyscData("김한결", 171, 1.5),
      new PhyscData("이호연", 174, 1.2),
      new PhyscData("오준영", 182, 1.0),
      new PhyscData("전서현", 173, 0.7)
    };
    System.out.print("시력이 몇인 사람을 찾고 있나요? : ");
    double vision = scanner.nextDouble();
    int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.LOW_ORDER);
    if(idx < 0) {
      System.out.println("요소가 없습니다.");
    } else {
      System.out.println("x[" + idx + "]에 있습니다.");
      System.out.println("찾은 데이터: " + x[idx]);
    }
  }
}
