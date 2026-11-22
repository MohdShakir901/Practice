import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C"))
                ? (temp - 32) * 5.0 / 9.0   // F to C
                : (temp * 5.0 / 9.0) + 32;   // C to F

        if (unit.equals("C")) {
            System.out.printf("%.2f°F = %.2f°C%n", temp, newTemp);
        } else if (unit.equals("F")) {
            System.out.printf("%.2f°C = %.2f°F%n", temp, newTemp);
        } else {
            System.out.println("Invalid unit. Please enter C or F.");
        }

        scanner.close();
    }
}