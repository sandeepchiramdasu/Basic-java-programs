import java.util.*;
public class SwappingOfNums{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter 1st num : ");
        int num1 = sc.nextInt();

        System.out.print("enter 2nd num : ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping num1 = "+num1+", num2 = "+num2);
        sc.close();
    }
}