import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs.");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Enter the Choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359239;
            System.out.printf("%.2f lbs = %.2f kg", weight,newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.2046226218;
            System.out.printf("%.2f kgs = %.2f lbs", weight,newWeight);
        } else{
            System.out.println("That was not a valid choice!");
        }

        scanner.close();

    }

}
