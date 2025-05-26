import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter the any Number ;");
        int n=scan.nextInt();


        System.out.println(n + (n%2==0 ? "is Even " : " is odd"));
    }
    
}
