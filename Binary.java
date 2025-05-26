import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int num = scan.nextInt();

        System.out.print("Binary: ");
        convert(num, 2);

        System.out.print("Octal: ");
        convert(num, 8);
    }

    public static void convert(int num, int base) {
        int[] result = new int[32];
        int index = 0;

        while (num > 0) {
            result[index++] = num % base;
            num = num / base;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
