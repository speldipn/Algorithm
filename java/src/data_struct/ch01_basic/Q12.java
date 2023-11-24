package data_struct.ch01_basic;

public class Q12 {
  public static void main(String[] args) {
    solve(9);
  }

  public static void solve(int n) {
    int nums[][] = new int[n + 1][n + 1];
    for (int i = 0; i < nums.length; ++i) {
      if (i == 1) drawHorizontalLine(n);
      for (int j = 0; j < nums[0].length; ++j) {
        if (i == 0) {
          nums[i][j] = j;
        } else {
          if (j == 0) {
            nums[i][j] = i;
          } else {
            nums[i][j] = nums[0][j] * nums[i][0];
          }
        }
        String valueStr = String.valueOf(nums[i][j]);
        if(valueStr.equals("0"))valueStr = " ";
        if (valueStr.length() < 2) valueStr = " " + valueStr;
        if (j == 1) System.out.print("|");
        System.out.print(valueStr + " ");
      }
      System.out.println();
    }
  }

  public static void drawHorizontalLine(int n) {
    for (int i = 0; i < n + 1; ++i) {
      if (i == 1) {
        System.out.print("+--");
      } else {
        System.out.print("---");
      }
    }
    System.out.println();
  }
}
