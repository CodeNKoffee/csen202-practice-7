public class Country {
  private String CountryName;
  private int noOfCitizens;
  private boolean isRoyal;
  private String Continent;
  private int politicalState;

  public Country(
    String CountryName,
    int noOfCitizens,
    boolean isRoyal,
    String Continent,
    int politicalState
  ) {
      this.CountryName = CountryName;
      this.noOfCitizens = noOfCitizens;
      this.isRoyal = isRoyal;
      this.Continent = Continent;
      this.politicalState = politicalState;
  }

  public int getState() {
    return politicalState;
  }

  public boolean getRoyalState() {
    return isRoyal;
  }

  public void setDefCon(int p) {
    politicalState = p;
  }

  public void increaseCitizen(int c) {
    noOfCitizens += c;
  }

  public void display() {
    System.out.println("Country Name: " + CountryName);
    System.out.println("Number of Citizens: " + noOfCitizens);
    System.out.println("Is Royal: " + isRoyal);
    System.out.println("Continent: " + Continent);
    System.out.println("Political State: " + politicalState);
  }

  public int compareTo(Country a) {
    return noOfCitizens - a.noOfCitizens;
  }

  public static int compareTo(Country a, Country b) {
    return a.noOfCitizens - b.noOfCitizens;
  }

  public static void main(String[] args) {
    // Construct a country c1 and initialize it.
    Country c1 = new Country("Country1", 1000000, true, "Asia", 4);

    // Display a full report about the country.
    c1.display();

    // Set the political state of the country.
    c1.setDefCon(1);

    // Construct another country c2 and initialize it.
    Country c2 = new Country("Country2", 5000000, false, "Europe", 3);

    // Compare the two countries and print the country name with the larger number of citizens.
    if (c1.compareTo(c2) > 0) {
        System.out.println("Country1 has more citizens than Country2");
    } else {
        System.out.println("Country2 has more citizens than Country1");
    }

    if (Country.compareTo(c1, c2) > 0) {
        System.out.println("Country1 has more citizens than Country2");
    } else {
        System.out.println("Country2 has more citizens than Country1");
    }
}
}
