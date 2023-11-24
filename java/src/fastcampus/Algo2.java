package fastcampus;

public class Algo2 {

  public static void main(String[] args) {
    // sum
    printSum(100);
    printSum1(2100000000L);
    printSum1(100);
    printSum2(1L, 2100000000L);
    printSum2(1L, 100L);
    System.out.println();

    // get count of numbers that include number
    solve1(100, 8);
    System.out.println();

    // anagram problem
    solve2("dirty room", "dormitory");
    System.out.println();
    solve2("listen", "slient");
    System.out.println();
    solve2("hello", "hellw");
    System.out.println();
    solve2("joon", "oon");
  }

  public static void printSum(long max) {
    long sum = 0;
    for (int i = 1; i <= max; ++i) {
      sum += i;
    }
    System.out.println(sum);
  }

  public static void printSum1(long max) {
    long result = ((1 + max) * max) / 2;
    System.out.println(result);
  }

  public static void printSum2(long min, long max) {
    long count = (max-min)+1;
    long result = ((min + max) * count) / 2;
    System.out.println(result);
  }

  public static void solve1(long max, int x) {
    int count = 0;
    for(int i = 1; i <= max; ++i) {
      String s = String.valueOf(i);
      if(s.indexOf(String.valueOf(x)) != (-1)) {
        System.out.println(s);
        String temp = s;
        for(int j = 0; j < temp.length(); ++j) {
          if(Integer.parseInt(temp.charAt(j)+"") == x) {
            ++count;
          }
        }
      }
    }
    System.out.println("result: " + max + " ==> " + count);
  }

  public static void solve2(String a, String b) {
    int result = 0;
    int result1 = 0;
    long start = System.currentTimeMillis();
    String src = a.trim();
    String target = b.trim();
    for(int i = 0; i < src.length(); ++i) {
      if(src.charAt(i) == ' ') {
        src = src.substring(0, i) + src.substring(i+1, src.length());
      }
    }
    for(int i = 0; i < target.length(); ++i) {
      if(target.charAt(i) == ' ') {
        target = target.substring(0, i) + target.substring(i+1, target.length());
      }
    }
    if(src.length() != target.length()) {
      System.out.println("아나그램이 아닙니다.");
      return;
    } else {
      for(int i = 0; i < src.length(); ++i) {
        char ch = src.charAt(i);
        int removeIdx = target.indexOf(ch);
        if(removeIdx != (-1)) {
          target = target.substring(0, removeIdx) + target.substring(removeIdx+1, target.length());
        }
      }
    }
    if(target.length() <= 0) {
      System.out.println("아나그램");
    } else {
      System.out.println("아나그램이 아닙니다.");
    }
    long end = System.currentTimeMillis();
    System.out.println("Elapes: " + (end-start) + "[ms]");
  }
}
