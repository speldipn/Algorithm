package leetcode;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-30
 */
public class TwoSum {
  public static void main(String[] args) {
    int[] arr = new int[]{2, 7, 11, 15};

    int[] resultArr = twoSum(arr, 9);
    for (int v : resultArr) {
      System.out.print(v + " ");
    }
    System.out.println();
  }

  public static int[] twoSum(int[] nums, int target) {
    int result[] = new int[2];
    int start, end;

    exit: for (start = 0; start < nums.length; ++start) {
      for (end = start + 1; end < nums.length; ++end) {
        if((nums[start] + nums[end]) == target) {
          result[0] = start;
          result[1] = end;
          break exit;
        }
      }
    }

    return result;
  }
}
