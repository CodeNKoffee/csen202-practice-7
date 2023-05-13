public class Clerk {
  private String fName, lName;
  private int yob, salary;
  private boolean isMarried;

  private double basicSalary = 2000.0;
  private double multiplier = 17.0 / 9.0;
  private double marriageBonus = 12.3;

  public Clerk() {}

  public Clerk(
    String fName,
    String lName,
    int yob,
    int salary,
    boolean isMarried
  ) {
    this.fName = fName;
    this.lName = lName;
    this.yob = yob;
    this.salary = salary;
    this.isMarried = isMarried;
  }

  public static void promote(Clerk a, int newSalary) {
    a.salary = newSalary;
  }

  public void marry() {
    isMarried = true;
  }

  public void divorce() {
    isMarried = false;
  }

  public double calculateSalary(int thisYear) {
    // Base Salary
    double theSalary;
    theSalary = basicSalary * (100.0 + (multiplier * salary) / 100.0);
    System.out.println("Salary of "+ fName +" without bonus is "+ theSalary);

    // Age Bonus
    int age = thisYear - yob;
    int bonus = 0;
    if (age > 30) {
      bonus = ((age - 25) / 5);
    }

    theSalary = ((100.0 + bonus) / 100.0) * theSalary;

    // Marriage Bonus
    if (isMarried) {
      theSalary += (marriageBonus / 100) * basicSalary;
    }

    return theSalary;
  }

  public static int compare(Clerk a, Clerk b) {
    return a.salary - b.salary;
  }

  // Main Method
  public static void main(String[] args) {
    Clerk a = new Clerk();
    Clerk b = new Clerk("John", "Shoukry", 1980, 1, false);

    System.out.println("Clerk A earns: "+ a.calculateSalary(2016));
    System.out.println("Clerk B earns: "+ b.calculateSalary(2016));

    a.marry();

    promote(b, 7);
    System.out.println("Clerk B earns: "+ b.calculateSalary(2016));

    System.out.println(compare(a, b) > 0 ? a.fName : b.fName);
  }
}
