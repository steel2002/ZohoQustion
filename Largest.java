import java.util.*;
public class Largest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Four Numbes : ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int big;
    if(a >=b && a >=c && a >=d){
        big=a;

    } else if (b >=a && b >= c && b >=d){
        big=b;
    } else if ( c>=a && c>=b && c >=d){
        big=c;
    }else {
        big=d;
    }
    System.out.println("The Largest Number is "+big);
    }
}
class LargestMax {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=40;
        int d=50;

        int LargestMax = Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println("The Max Value "+LargestMax);
    }
}
class Largest1 {
    public static void main(String[] args) {
        int a=10;
        int b=50;

        int max=(a >b) ? a:b;
        System.out.println("Largest Number "+max);
    }

}