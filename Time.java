public class Time {
  int hours, minutes, seconds;

  public Time() {
    this.hours = 0;
    this.minutes = 0;
    this.seconds = 0;
  }

  public Time(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public int getHours() {
    return hours;
  }

  public int getMinutes() {
    return minutes;
  }

  public int getSeconds() {
    return seconds;
  }

  public void addHours() {
    if (hours == 23) {
      hours = 0;
    }
    else hours++;
  }

  public void addMinutes() {
    if (minutes == 59) {
      minutes = 0;
      addHours();
    }
    else minutes++;
  }

  public void addSeconds() {
    if (seconds == 59) {
      seconds = 0;
      addMinutes();
    }
    else seconds++;
  }

  // Main Method
  public static void main(String[] args) {
    Time t1 = new Time();
    System.out.println("Hours: "+ t1.getHours() +" - Minutes: "+ t1.getMinutes() +" - Seconds: "+ t1.getSeconds());

    Time t2 = new Time(2, 30, 59);
    System.out.println("Hours: "+ t2.getHours() +" - Minutes: "+ t2.getMinutes() +" - Seconds: "+ t2.getSeconds());

    t2.addHours();
    t2.addMinutes();
    t2.addSeconds();

    System.out.println("After procedures, Hours: "+ t2.getHours() +" - Minutes: "+ t2.getMinutes() +" - Seconds: "+ t2.getSeconds());
  }
}
