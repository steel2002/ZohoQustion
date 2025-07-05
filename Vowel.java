import java.util.*;
public class Vowel{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the Single char :");

        char ch = scan.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'){
            System.out.println(ch+ " This is Vowel value :");
        } else {
            System.out.println(ch+ " This is constant Value :");
        }
        
    }

}

// Alphabet check 

class Vowel1{
    public static void main(String[] args) {
        char ch='$';

        if((ch >= 'A' && ch <='Z' ) || (ch >='a' && ch <='z')){
            System.out.println("This is Alphabet :"+ch);
        }else {
            System.out.println("This is Not Alphabet :"+ch);
        }
    } 
}