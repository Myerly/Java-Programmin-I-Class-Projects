class Main {
  public static void main(String[] args) 
  {
    // declare three variables of type double - miles, gallons, pounds
    double miles = 5.4979;
    double gallons = 80;
    double pounds = 137;
    // declare three variables of type double - kilometers, liters, kilograms
    double kilometers = miles * 1.60934;
    double liters = gallons * 3.78541;
    double kilograms = pounds * 0.453592;
    // print three statements to the console
    System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    System.out.println(gallons + " gallons is equal to " + liters + " liters.");
    System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
  }
}