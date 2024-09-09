import java.util.Scanner;
public class ReverseOfNum {

    static int reverse(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        return rev;       
    }
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();
    System.out.println(reverse(num));
    sc.close();
}
}