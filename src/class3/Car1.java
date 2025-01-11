package class3;

// Define a class named Car
public class Car1 {

    // Fields (attributes) of the class
    private String brand;
    private String color;
    private int year;

    // Constructor to initialize a Car object
    public Car1(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Getter method for brand
    public String getBrand() {
        return brand;
    }

    // Setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Setter method for year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Car object
        Car1 myCar = new Car1("Toyota", "Red", 2020);

        // Display the car's details
        myCar.displayInfo();

        // Update car attributes
        myCar.setColor("Blue");
        System.out.println("\nUpdated Car Info:");
        myCar.displayInfo();
    }
}
