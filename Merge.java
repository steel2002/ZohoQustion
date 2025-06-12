import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

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
// 37. Java Program to reverse the elements of an array
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

// 38. Java Program to print the delete an elements of an array
class DeleteElement{
   
      public static int[] remove(int[] arr, int in) {
        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }

      	int[] arr2 = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == in)
                continue;
			
          	arr2[k++] = arr[i];
        }

        return arr2;
    }
  
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };

      	int in = 2;

    
        arr = remove(arr, in);

        System.out.println(Arrays.toString(arr));
    }
}

// 38. Java Program to print the delete an elements of an array part 2

class DeleteElemente{
    public static void main(String[] args) {
        int arr []= {10,20,30,40,50,60};

        int index=2;

        for(int i=0;i<arr.length;i++){
            if(i==index){
                continue;
            } 
            System.out.print(arr[i]+ "  ");
        }
    }
}

// 39. Java Program to print the average of all items of the array
 class AverageArray {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 3, 4, 5 };
        double sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = sum / arr.length;
        System.out.println("Average of the array elements: " + average);
    }
}

// 39. Java Program to print the average of all items of the array Part 2  without using for loop 

class Element {
    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 4, 5};
        double sum = 0;

        int count=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        sum+= count;
        double average = sum / arr.length;
        System.out.println("Average of the array elements: " + average);
    }
}

// 40. Java Program to inverse the elements of an array.
class InverseArray {
  
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] inverse = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1 ; i >=0; i--) {
            inverse[j++] = arr[i];
        }

        System.out.println("Inverse of the array: " + Arrays.toString(inverse));
    }
}

// 41  Write a programs to print following patterns pyramid pattern
/*
    1          1 
   1 2 
  1 2 3
 1 2 3 4
1 2 3 4 5

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
class PyramidPattern 
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
               int count = 1;
            for(int j=1;j<=n;j++)
            {
                if(j<=(n-i))
                {
                    System.out.print(" ");
                } else 
                {
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }
    }
}
// 42  Write a programs to print following patterns pyramid pattern

/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 */
class Patteern {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=(n-i))
                {
                    System.out.print(" ");
                } else 
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }

    
}



// 44  Write a programs to print following patterns Diment pattern

/*
   *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

    A 
   B B 
  C C C 
 D D D D 
E E E E E 
 D D D D 
  C C C 
   B B 
    A 

 */

class DimentPattern {
    public static void main(String[] args) {
        int n=5;
        int l=0;
        char c ='A'-1;
        for(int i=-n+1;i<n;i++)
        {
             if(i<0 || i==0)
                {
                    l=-i;
                    c++;
                } else {
                    l=i;
                    c--;
                }
            for(int j=1;j<=n;j++)
            {
                if(j<=l){
                    System.out.print(" ");
                } else {
                System.out.print(c +" ");
                }
            }
            System.out.println();
        }
    }
}

// 136. Single Number Hashset  LEET code 

class SingleNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 ,3};
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }

        System.out.println("The single number is: " + set.iterator().next());
    }
}

// 217. Contains Duplicate HashSet LEET code true or false  one value in array same time is true 

class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Contains duplicate: true");
                return;
            }
        }

        System.out.println("Contains duplicate: false");
    }
}
// 46. Write a program to find the odd numbers in between the range.
 /* Input:
15
Output:
3,5,7,9,11,13
*/
class oddNumber {
    public static void main(String[] args) {
        int n=15;
        for(int i=2;i<n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i + " ");
            }

        }
        
    }
}
// 47. Write a program to print a letters from 'A' to the user input character without using strings.
 /* Example 1: input: D
Output : ABCD
*/

 class printLetters {
    public static void main(String[] args) {
        char input = 'D';
        
        for(char i = 'A'; i <= input ;i++)
        {
            System.out.println(i + " ");
        }
    }
 }
 // 48. write a program to find the sum of given number and it's reverse number.
 /* Example 1: Input: 12345
Output: 12345+54321 = 66666
*/ 

class SumandReverse {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;
        int original = num;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        int sum = original + reverse;

        System.out.println("Sum " + original + " reverse " + reverse + " is: " + sum);
    }
}
// 49. Using Recursion reverse the string such as
 /* Eg 1: Input: one two three
Output: three two one

*/





