// java program to check odd number or even number
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        // user input
        int n = sc.nextInt();

        // check if remainder is equal to zero when didided by 2
        if(n%2 == 0){
            System.out.println(n+" is even number");
        }
        else{
            System.out.println(n+" is odd number");
        }
        sc.close();
    }
}