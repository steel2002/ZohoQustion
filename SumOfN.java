import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int n=10;
        int sum = n * (n + 1) / 2;
        System.out.println("The sum of Number :"+sum);

        int small=14;
        
        int temp=sum;

        while (temp > 0) {
            int digit=temp % 10;
            if(digit < small){
                small=digit;
            }
            temp /=10;
        }
        System.out.println("small digits in the sum "+small);
    }
    
}
// sum of N numbers 

 class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scan.nextInt();

        int sum = n * (n + 1) / 2;
        System.out.println(+ sum);

        for(int i=n-1;i>=1;i--){
            System.out.println((sum-i));
            sum=sum-i;
        }
    }
}

