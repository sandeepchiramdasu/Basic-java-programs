// java program to find factors of a number
import java.util.*;
public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
