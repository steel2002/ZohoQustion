public class AddDivide {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Addition Table for " + num);

        for (int i = 1; i <= 10; i++) {
            int result = num + i;
            System.out.println(num + " + " + i + " = " + result);
        }

        System.out.println(); 

        System.out.println("Division Table for " + num);

        for (int i = 1; i <= 10; i++) {
            double result = (double) num / i;
            System.out.println(num + " / " + i + " = " + result);
        }
    }
}
