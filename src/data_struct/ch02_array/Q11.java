package data_struct.ch02_array;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-08-02
 */
public class Q11 {
  static class YMD {
    static int[][] mdays = {
      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
    };
    static int[] yearDays = {365, 366};

    int year;
    int month;
    int day;

    public YMD() {}
    public YMD(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
    }

    static int isLeapYear(int year) {
      return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
    }

    public int dateToDays() {
      int days = 0;
      for (int i = 0; i < (this.month - 1); ++i) {
        days += mdays[isLeapYear(this.year)][i];
      }
      if (days > 0) {
        days += this.day;
      }
      return days;
    }

    public int getDaysOfYear(int year) {
      return yearDays[isLeapYear(year)];
    }

    public YMD after(int n) {
      YMD ymd = new YMD(this.year, this.month, this.day);
      n += dateToDays(); //기준일이 오늘이되므로
      while (n > (getDaysOfYear(ymd.year) - 1)) {
        ymd.year += 1;
        n -= getDaysOfYear(ymd.year);
      }
      ymd.setDaysToDate(n);
      return ymd;
    }

    public YMD before(int n) {
      YMD ymd = new YMD(this.year, this.month, this.day);
      int d = dateToDays() - n;
      if(d < 0) {
        d = Math.abs(d);
        while(d > getDaysOfYear(--ymd.year)) {
          d -= getDaysOfYear(ymd.year);
        }
        d = getDaysOfYear(ymd.year) - d;
      }
      ymd.setDaysToDate(d);
      return ymd;
    }

    public void showDate() {
      System.out.println(this.year + "년 " + this.month + "월 " + this.day + "일");
    }

    public void setDaysToDate(int days) {
      int month = 0;
      int d;
      while (true) {
        d = mdays[isLeapYear(this.year)][month++];
        if ((days - d) > 0) {
          days -= d;
        } else {
          break;
        }
      }
      this.month = month;
      this.day = days;
    }
  } // end of inner class

  public static void main(String[] args) {
    YMD ymd = new YMD(2018, 8, 2);
    ymd.showDate();
    YMD be = ymd.before(7);
    be.showDate();
    YMD af = be.after(100);
    af.showDate();
  }
}
