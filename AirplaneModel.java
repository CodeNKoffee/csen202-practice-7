import java.util.*;

public class AirplaneModel {
  private String name;
  private double emptyWeight;
  private int seats;
  private double fuelConsumption;

  // Default constructor
  public AirplaneModel() {
  }

  // Constructor that initializes an airplane with only name and seats
  public AirplaneModel(String name, int seats) {
    this.name = name;
    this.seats = seats;
  }

  // Constructor that initializes an airplane with all attributes
  public AirplaneModel(String name, double emptyWeight, int seats, double fuelConsumption) {
    this.name = name;
    this.emptyWeight = emptyWeight;
    this.seats = seats;
    this.fuelConsumption = fuelConsumption;
  }

  public String getName() {
    return name;
  }

  public double getEmptyWeight() {
    return emptyWeight;
  }

  public int getSeats() {
    return seats;
  }

  public double getFuelConsumption() {
    return fuelConsumption;
  }

  public void addSeats(int x) {
    seats += x;
  }

  public String display() {
    return this.name + " - seats: "+ this.seats +"- ew: "+ this.emptyWeight +"- fc: "+ this.fuelConsumption;
  }

  public static void display(AirplaneModel a) {
    System.out.println("Name: " + a.name);
    System.out.println("Empty weight: " + a.emptyWeight);
    System.out.println("Seats: " + a.seats);
    System.out.println("Fuel consumption: " + a.fuelConsumption);
  }

  public int compare(AirplaneModel a) {
    return seats - a.seats;
  }

  public static int compare(AirplaneModel a, AirplaneModel b) {
    return a.seats - b.seats;
  }

  // Main method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    AirplaneModel airplane1 = new AirplaneModel("Boeing", 200);
    System.out.println(airplane1.getSeats());
    airplane1.addSeats(50);
    System.out.println(airplane1.getSeats());
    System.out.println(airplane1.display());

    System.out.println("Enter plane details: ");
    AirplaneModel airplane2 = new AirplaneModel(input.next(), input.nextDouble(), input.nextInt(), input.nextDouble());
    input.close();

    System.out.println(airplane1.compare(airplane2) >= 0 ? 
      airplane1.getName() : airplane2.getName()
    );

    System.out.println(compare(airplane1, airplane2) >= 0 ?
      airplane1.getName() : airplane2.getName()
    );
  }
}
