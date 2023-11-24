package fastcampus;

public class Algo1 {
  public static void main(String[] args) {
    solve(5);
    System.out.println();

    solve1(5);
    System.out.println();

    solve2(5);
    System.out.println();

    solve3(5);
    System.out.println();

    solve4(5);
    System.out.println();

    solve5(5);
    System.out.println();

    solve6(5);
    System.out.println();

    solve7(5);
    System.out.println();

    solve8(5);
    System.out.println();

    solve9(5);
    System.out.println();

    solve10(7);
    System.out.println();

    sovle11(7);
  }

  //  *
  //  **
  //  ***
  //  ****
  //  *****
  public static void solve(int count) {
    for (int i = 0; i < (count + 1); ++i) {
      for (int j = 0; j < i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //      *
  //     **
  //    ***
  //   ****
  //  *****
  public static void solve1(int count) {
    int i;
    int j;

    for (i = count; i > 0; --i) {
      for (j = 0; j < i - 1; ++j) {
        System.out.print(" ");
      }
      for (int k = 0; k <= count - j - 1; ++k) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //      *
  //     ***
  //    *****
  //   *******
  //  *********
  public static void solve2(int line) {
    for (int i = 0; i < line; ++i) {
      for (int j = 0; j < line - (i + 1); ++j) {
        System.out.print(" ");
      }
      for (int j = 0; j < ((i + 1) * 2 - 1); ++j) {
        System.out.print("*");
      }
      for (int j = 0; j < line - (i + 1); ++j) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  //     *
  //    * *
  //   *   *
  //  *     *
  // *       *
  public static void solve3(int line) {
    for (int i = 0; i < line; ++i) {
      for (int j = 0; j < line - (i + 1); ++j) {
        System.out.print(" ");
      }
      int limit = (i + 1) * 2 - 1;
      for (int j = 0; j < limit - 1; ++j) {
        if (j == 0) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("*");
      for (int j = 0; j < line - (i + 1); ++j) {
        System.out.print(" ");
      }

      System.out.println();
    }
  }

  //      *
  //     * *
  //    *   *
  //   *     *
  //  *********
  public static void solve4(int line) {
    for (int i = 0; i < line; ++i) {
      for (int j = 0; j < line - (i + 1); ++j) {
        System.out.print(" ");
      }
      int limit = (i + 1) * 2 - 1;
      for (int j = 0; j < limit - 1; ++j) {
        if (i != line - 1) {
          if (j == 0) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        } else {
          System.out.print("*");
        }
      }
      System.out.print("*");

      for (int j = 0; j < line - (i + 1); ++j) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  //     *
  //    ***
  //   *****
  //  *******
  // *********
  //  *******
  //   *****
  //    ***
  //     *
  public static void solve5(int count) {
    int line = count * 2 - 1;

    int start = line / 2 - 1;
    int end = start;
    int mid = line / 2;

    for (int i = 0; i < line; ++i) {
      for (int x = 0; x <= start; ++x) {
        System.out.print(" ");
      }

      int k = start;
      while (k <= end) {
        System.out.print("*");
        k++;
      }

      for (int y = end; y <= count; ++y) {
        System.out.print(" ");
      }
      System.out.println();

      if (i >= mid) {
        start++;
        end--;
      } else {
        start--;
        end++;
      }
    }
  }

  //     *
  //    * *
  //   * * *
  //  * * * *
  // * * * * *
  //  * * * *
  //   * * *
  //    * *
  //     *
  public static void solve6(int count) {
    int line = count * 2 - 1;

    int start = line / 2 - 1;
    int end = start;
    int mid = line / 2;

    boolean valid = true;

    for (int i = 0; i < line; ++i) {
      for (int x = 0; x <= start; ++x) {
        System.out.print(" ");
      }

      int k = start;
      valid = true;
      for (k = start; k <= end; k++) {
        if (valid) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        valid = !valid;
      }

      for (int y = end; y <= count; ++y) {
        System.out.print(" ");
      }
      System.out.println();

      if (i >= mid) {
        start++;
        end--;
      } else {
        start--;
        end++;
      }
    }
  }

  //      *
  //     * *
  //    *   *
  //   *     *
  //  *       *
  //   *     *
  //    *   *
  //     * *
  //      *
  public static void solve7(int count) {
    int line = count * 2 - 1;

    int start = line / 2 - 1;
    int end = start;
    int mid = line / 2;


    for (int i = 0; i < line; ++i) {
      for (int x = 0; x <= start; ++x) {
        System.out.print(" ");
      }

      int k = start;
      for (k = start; k <= end; k++) {
        if (k == start || k == end) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      for (int y = end; y <= count; ++y) {
        System.out.print(" ");
      }
      System.out.println();

      if (i >= mid) {
        start++;
        end--;
      } else {
        start--;
        end++;
      }
    }
  }

  //  *       *
  //   *     *
  //    *   *
  //     * *
  //      *
  //     * *
  //    *   *
  //   *     *
  //  *       *
  public static void solve8(int count) {
    int start = 0;
    int end = count;

    int line = count * 2 - 1;
    int mid = line / 2;

    count = count * 2 - 1;
    start = 0;
    end = count - 1;

    for (int i = 0; i < line; ++i) {
      for (int j = 0; j < count; ++j) {
        if (j == start || j == end) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();

      if (i < mid) {
        start++;
        end--;
      } else {
        start--;
        end++;
      }
    }
  }

  //  *********
  //  *       *
  //  *       *
  //  *       *
  //  *       *
  //  *       *
  //  *       *
  //  *       *
  //  *********
  public static void solve9(int count) {
    int start = 0;
    int end = count;

    int line = count * 2 - 1;
    int mid = line / 2;

    count = count * 2 - 1;
    start = 0;
    end = count - 1;

    for (int i = 0; i < line; ++i) {
      for (int j = 0; j < count; ++j) {
        if (i == 0 || i == line - 1) {
          System.out.print("*");
        } else {
          if (j == 0 || j == end) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

  // *      *      *      *      *      *      *
  //       *     *     *     *     *     *
  //          *    *    *    *    *
  //              *   *   *   *
  //                  *  *  *
  //                    * *
  //                     *
  public static void solve10(int count) {
    int line = count;

    int startSpace = 0;
    for (int i = 0; i < line; ++i) {
      if (i > 0) {
        startSpace += (count - i);
      }
      for (int j = 0; j < startSpace; ++j) {
        System.out.print(" ");
      }
      int space = (count - i - 1);
      for (int j = 0; j < count - i; ++j) {
        System.out.print("*");
        for (int k = 0; k < space; ++k) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  //                      *       *
  //                *                   *
  //           *                             *
  //       *                                     *
  //    *                                           *
  //  *                                               *
  // *                                                 *
  public static void sovle11(int count) {
    int line = count;

    int startSpace = 0;
    for(int i = 0; i < count; ++i) {
      startSpace += count-i;
    }

    int space = 0;
    for (int i = 0; i < line; ++i) {
      startSpace -= count - i;
      for(int j = 0; j < startSpace; ++j) {
        System.out.print(" ");
      }
      if(i == 0) {
        space += count - i;
      } else {
        space += (count - i) * 2;
      }
      System.out.print("*");
      for(int j = 0; j < space; ++j) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
  }
}