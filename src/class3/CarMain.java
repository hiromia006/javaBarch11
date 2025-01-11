package class3;

public class CarMain {
    public static void main(String[] args) {
        Car masum = new Car();
         masum.color="red";
         masum.year=2024;
         masum.serialNumber="20x-0y-2024";
         masum.printVariables();

        Car foysal = new Car("Audi");
        foysal.color="red2";
        foysal.year=2025;
        foysal.serialNumber="20x-0y-2025";
        foysal.printVariables();

    }
}
