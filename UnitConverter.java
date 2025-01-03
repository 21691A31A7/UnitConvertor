import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Unit Converter!");
        System.out.println("1. Length Conversion");
        System.out.println("2. Weight Conversion");
        System.out.println("3. Temperature Conversion");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                lengthConversion(scanner);
                break;
            case 2:
                weightConversion(scanner);
                break;
            case 3:
                temperatureConversion(scanner);
                break;
            default:
                System.out.println("Invalid choice! Exiting...");
        }

        //scanner.close();
    }

    public static void lengthConversion(Scanner scanner) {
        System.out.println("\nLength Conversion:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Feet to Meters");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        if (choice == 1) {
            System.out.println(value + " meters = " + (value / 1000) + " kilometers");
        } else if (choice == 2) {
            System.out.println(value + " feet = " + (value * 0.3048) + " meters");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static void weightConversion(Scanner scanner) {
        System.out.println("\nWeight Conversion:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        if (choice == 1) {
            System.out.println(value + " kg = " + (value * 2.20462) + " pounds");
        } else if (choice == 2) {
            System.out.println(value + " pounds = " + (value / 2.20462) + " kg");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static void temperatureConversion(Scanner scanner) {
        System.out.println("\nTemperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter value: ");
        double value = scanner.nextDouble();

        if (choice == 1) {
            System.out.println(value + " °C = " + ((value * 9/5) + 32) + " °F");
        } else if (choice == 2) {
            System.out.println(value + " °F = " + ((value - 32) * 5/9) + " °C");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
