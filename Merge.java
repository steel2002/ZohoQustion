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


// 45. Write a program to print the following output for the given input. You can

/*
 1         1
 2       2
  3     3
   4   4
    5 5
     6 
 */

class printpattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tex = scan.nextLine();
        int n= tex.length();
        int k=0;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=(i-1))
                {
                    System.out.print(" ");
                } else {
                    if (j==i || j==n) {
                        System.out.print(tex.charAt(k) + " ");
                        
                    }else {
                        System.out.print("  ");
                    }
                    
                }
            }
            k++;
            System.out.println();
        }
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
            System.out.print(i + " ");
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
class ReverseLitter {
    public static void main(String[] args) {
        String input =" one tow three";

        String [] words = input .split(" ");

        recurs(words, words.length - 1);



    }

static void recurs(String[] words, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(words[i] + " ");
        recurs(words, i - 1);
    }

}

// 50. Write a program to output the number in words (0-999)
/*
Input: 234
Output: Two hundred and Thirty Four
 */

 class Prog50
{
    public static void main(String[]args)
    {
        String[]ones = {"","one","two","three","four","five","six","seven","eight","nine","ten",
                       "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
        String[]tens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the value between 0 and 999");
        int n = java.nextInt();
        while(n>0)
        {
            if(n>=100)
            {
                System.out.print(ones[n/100] + " hundred and ");
                n = n%100;
            }
            else if(n>=10)
            {
                System.out.print(tens[n/10] + " ");
                n = n%10;
            }
            else
            {
                System.out.print(ones[n]);
                n = n/10;
            }
        }
    }
}
 // 51. Write a program to sort the elements in odd positions in descending order and elements in ascending order.
/*
 Eg 1: Input: 13,24,15,12,10,5
Output: 13.2.12.10.5.15.4
 */

 class SortOddEven {
    public static void main(String[] args) {
        int arr[]={13, 24, 15, 12, 10, 5};
        int n = arr.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%2==0){
                odd.add(arr[i]);
            }else {
                even.add(arr[i]);
            }
        }
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(odd.get(j++) + " ");
            }else {
                System.out.print(even.get(k++) + " ");
            }
        }


    }
}

// 52. Write a program to print the alphabet 'C' with the stars based on the given numbers

/*
**** 
*
*
*
****
 */

class PrintC{
    public static void main(String[] args) {
        int n = 10; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < n - 1) || (i == n - 1 && j < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// 53. Write a program to make such a pattern like a pyramid with numbers increased by 1.
/*
Eg:
Input: 10
Output:
   1
  2 3
 4 5 6
7 8 9 10

 */

 
class PyramidNumbers {
public static void main(String[] args){
  int n=4;
  int count=1;
  
        for(int i=1;i<=n;i++)
        {
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
// 54. Write a program to print the following output for the given input. You can assume the string is of odd length

/*
1    5
 2  4
  3
 2  4
1    5
 */
class PrintPattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print(j + " ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}
// 55. Write a program to print the following pattern for the given input number.

/*
    3 3 3 3 
    3 2 2 2 
    3 2 1 2 
    3 2 2 2  
 */

class PrintPattern3 {
    public static void main(String[] args) {
        int n=4;
        int mid=n/2;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int value=Math.max(Math.abs(i-mid), Math.abs(j-mid))+1;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// 56. Print all the substring of the given string without using strings.
/*
 a
ab
abc
b
bc
c 
 */

class PrintSubString {
    public static void main(String[] args) {
        String input = "abc";
        int n = input.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }
}

// 57. Print the numbers which are mismatched from two array.
/*
 Example:
Input:
Arrl = {abc defgh i)
Arr2 = {abde egg i i)
Output:
cd, de, f, g, h, i

 */

 class mismatched {
    public static void main(String[] args) {
        char ch1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        char ch2[] = { 'a', 'b', 'd', 'e', 'e', 'g', 'i', 'i','g'};
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                System.out.print(ch1[i]+" "+ch2[i] + " ");
            }
        }
    }
 }

 // 58. Given 2 huge numbers as separate digits, store them in array and process them and calculate the sum of 2 numbers and store the result in an array and print the sum.
/*
 * Input:
Number of digits: 12
928135673116
Number of digits: 9
784621997
Output:
928920295113
 */

 class Prog {
    public static void main(String[] args) {
        
        int a [] = {9,2,8,1,3,5,6,7,3,1,1,6};

        int b [] = {7,8,4,6,2,1,9,9,7};

        int al= a.length-1;
        int bl=b.length-1;

        int c []= new int[(Math.max(al,bl)+ 1)];

        int cl= c.length-1;

        int temp=0;

        while(al>=0 || bl>=0|| temp!=0)
        {
             int num1=(al >0)? a[al]:0;

             int num2=(bl >0)? b[bl] :0;
             c[cl]=(num1 + num2 + temp)%10;
             temp=(num1+num2+temp)/10;
             al--;
             bl--;
             cl--;

        }
        int start=0;

        if(c[start]==0)
        {
            start=1;
        }
        for(int i=start;i<c.length;i++)
        {
            System.out.print(c[i]+"");
        }


    }
 }

 // 59 
 /*
  * 
  /*Program to print the below format
+===+===+
| | |
| | |
| | |
+===+===+
| | |
| | |
| | |
+===+===+*/
  
class Prog1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.err.println("Enter the Number :");
        int n =scan.nextInt();
       

        for (int i=0;i<=n;i++) {

            if(i%4==0)
            {
                System.err.println("+===+===+");
            } else {
                System.err.println("| | |");
            }
            
        }
    }
}


 














