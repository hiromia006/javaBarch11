package class3;

public class Car {
    private String brand;
    String color;
    public String serialNumber;
    protected int year;

    public Car() {

    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Every Car can drive");
    }

    public void printVariables() {
        System.out.println("Car " + color + " " + year + " " + serialNumber + " " + brand);
    }

    public static void main(String[] args) {
        Car arafat = new Car();
        arafat.year = 2025;
        arafat.color = "Black";
        arafat.brand = "Tesla";
        arafat.serialNumber = "asdsa";
        arafat.drive();
        arafat.printVariables();
    }
}
