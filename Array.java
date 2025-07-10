import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String name ="selvin jojo";

         for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
    }
}


class Array2 {
    public static void main(String[] args) {
        String name = "selvin jojo";
        char[] arr = name.toCharArray();

        for (char c : arr) {
            System.out.print(c);
        }
    }
}


//Print Array in Reverse Order

class Array3 {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};

        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        
    }
}

class Array4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int n= arr.length;

        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}

// 4. Check if an array is sorted

class Array5{
    public static void main(String[] args) {
        boolean isSorted = true;

        int arr []= {1,2,3,4,5};

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] >arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Sorted" : "Not Sorted");
    }
}

// Find duplicate elements in array

class Array6 {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,4,5,6,2,};

        for(int i=0;i<arr.length-1;i++){

          for(int j=i+1;j<arr.length-1;j++)
          {
            if(arr[i]==arr[j])
            {
                System.out.println("Duplicate "+arr[i]);
            }
          }
        }
    }
}
