public class MarkMain {
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

    solve5(3);
    System.out.println();

    solve6(4);
    System.out.println();

    solve7(3);
    System.out.println();

    solve8(3);
    System.out.println();

    solve9(4);
    System.out.println();

    solve10(5);

  }


  public static void solve(int count) {
    for (int i = 0; i < (count + 1); ++i) {
      for (int j = 0; j < i; ++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

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

  private static void solve2(int line) {
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

  private static void solve3(int line) {
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

  private static void solve4(int line) {
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

  private static void solve5(int count) {
    int line = count * 2 - 1;

    int start = count / 2;
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


  private static void solve6(int count) {
    int line = count * 2 - 1;

    int start = count / 2;
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

  private static void solve7(int count) {
    int line = count * 2 - 1;

    int start = count / 2;
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

  private static void solve8(int count) {
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

  private static void solve9(int count) {
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

  private static void solve10(int count) {
    int line = count;

    for (int i = 0; i < line; ++i) {
      for (int j = 0; j < line - i; j++) {
      }
    }
  }
}

