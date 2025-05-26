import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter the any Number ;");
        int n=scan.nextInt();


        System.out.println(n + (n%2==0 ? "is Even " : " is odd"));
    }
    
}
class EvenOdd1{
    public static void main(String[] args) {
        int a=3;

        if(a%2==0){
            System.out.println("Even number This is "+a);
        } else {
            System.out.println("Odd Number This is "+a);
        }
    }
}
