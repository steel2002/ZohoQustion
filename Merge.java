import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 7, 9, 10, 13 };
        int[] arr2 = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
        ArrayList<Integer> me = new ArrayList<>();
        ArrayList<Integer> dub = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            me.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!me.contains(arr2[i])) {
                me.add(arr2[i]);

            } else {
                dub.add(arr2[i]);
            }

        }
        Collections.sort(me);
        System.out.println("Merged Array:" + me);
        System.out.println("Dupicates Array:" + dub);
    }

}
// Right rotate in Value

class Met6 {
    void Right1(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }

    public static void main(String[] args) {
        int rig[] = { 1, 2, 3, 4, 5 };
        Met6 obj = new Met6();
        obj.Right1(rig);
    }

}

// 2d Array Right rotate

class Met7 {
    void Le(int[][] arr) {

        int temp0 = arr[0][0];
        arr[0][0] = arr[0][1];
        arr[0][1] = arr[0][2];
        arr[0][2] = temp0;

        int temp1 = arr[1][0];
        arr[1][0] = arr[1][1];
        arr[1][1] = arr[1][2];
        arr[1][2] = temp1;

        int temp2 = arr[2][0];
        arr[2][0] = arr[2][1];
        arr[2][1] = arr[2][2];
        arr[2][2] = temp2;

        System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
        System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
        System.out.println(arr[2][0] + " " + arr[2][1] + " " + arr[2][2]);
    }

    public static void main(String[] args) {
        int[][] rig = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        Met7 obj = new Met7();
        obj.Le(rig);
    }
}

// 28 Oustions Alternate sorting

class Met8 {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 7, 5, 6, 4 };
        Arrays.sort(arr); // Sort the array

        int[] result = new int[arr.length];
        int start = 0, end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[start++];
            } else {
                result[i] = arr[end--];
            }

        }
        System.out.println(Arrays.toString(result));
    }
}

// 29. Program to Find Factorial of a Number and the factorial number's reverse
// number.\

class FactorialReverse {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        int reverse = 0, temp = fact;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
        System.out.println("Reverse of factorial: " + reverse);
    }
}

// 30. Java Program to find the sum of elements of an array present on even
// position.
class SumEvenPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of elements at even positions: " + sum);
    }
}

// 31. Java Program to find the sum of elements of an array present on odd
// position.

class SumOddPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of elements at odd positions: " + sum);
    }
}

// 32 Java Program to print the 2nd largest element in an array

class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1, 35, 12, 40, 5 - 0, 60, 70, 80, 90, 100, 200, 300, 400, 500, 600, 700, 800,
                900 };

        Arrays.sort(arr);
       System.out.println(arr[arr.length - 2]);
       
    }
}

// 33. Java Program to print the 2nd smallest element in an array

class SecondSmallest {

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1, 35, 12, 40, 5 - 0, 60, 70, 80, 90, 100, 200, 300, 400, 500, 600, 700, 800,
                900 };

        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}

// 34. Java Program to print the number of elements present in an array
class CountElements {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Number of elements in the array: " + arr.length);
    }
}

// 35. Java Program to copy all elements of one array into another array
class CopyArray {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of the copied array: " + Arrays.toString(arr2));
    }
}

// 36. Java Program to find the frequency of each element in the array
class frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 5 };
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    freq[j] = -1;
                }
            }

        }

    }
}


