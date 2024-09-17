// Java program to find compound interest
import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // take input from users
    System.out.print("Enter the principal: ");
    double principal = scanner.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = scanner.nextDouble();

    System.out.print("Enter the time: ");
    double time = scanner.nextDouble();

    System.out.print("Enter number of times interest is compounded: ");
    int number = scanner.nextInt();

    double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Number of Time interest Compounded: " + number);
    System.out.println("Compound Interest: " + interest);

    scanner.close();
    }
}

