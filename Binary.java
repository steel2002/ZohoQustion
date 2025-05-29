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
        
        System.out.print("Hexadecimal: ");
        convertHex(num);
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

    public static void convertHex(int num) {

        
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9',
                           'A','B','C','D','E','F'};
        char[] result = new char[32];
        int index = 0;

        while (num > 0) {
            result[index++] = hexChars[num % 16];
            num = num / 16;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
}
