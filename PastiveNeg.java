public class PastiveNeg {

    public static void main(String[] args) {
    int num=-5;

    if( num >0){
        System.out.println("This is Postive :");
    }else if( num < 0){
        System.out.println("This is Nagative ");
    }else {
        System.out.println("This is Zero :");
    }
}
}

class Postive{
    public static void main(String[] args) {
        int n =-8;
        String result =(n >0) ? "Postive" : (n<0) ? "Negative" :"Zero";

        System.out.println(n+ " is " +result+ " ");
    }
}
    

