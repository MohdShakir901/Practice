import java.util.Scanner;
public class Calculater {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        double timesCompound;
        double amount;

        System.out.print("Enter the principle to invest: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the time period to investing money: ");
        timesCompound = scanner.nextDouble();

        amount = principle * Math.pow(1 + rate/100, timesCompound);

        System.out.printf("\nThe amount after %.0f years is: %.2f",timesCompound,amount);
        System.out.printf("\nAnd the interest is %.2f: ",amount-principle);


    }
}
