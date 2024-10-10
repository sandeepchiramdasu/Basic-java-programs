// java program to find perfect number or not
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // input from user
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        
        // take a variable to store factors of num
        int sum = 0;
        
        for(int i = 1;i < num;i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        // compare sum with num 
        if(sum == num){
            System.out.println("perfect number");
        }
        else{ 
            System.out.println("not a perfect number");
        }
        sc.close();
    }   
}
