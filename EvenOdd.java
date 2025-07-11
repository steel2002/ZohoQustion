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


class EvenOdd2 {
    public static void main(String[] args) {
    
    int arr []={1,2,3,4,5,6,7,9,0,10,11,12,13,14,15};

    int count=0;
    
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even Number is "+arr[i]);
                count++;
            } else {
                System.out.println("Odd Number is "+arr[i]);
            }
        }
        System.out.println("Total Even Number is "+count);

    }
}
    