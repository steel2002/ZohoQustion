public class ArraySwap {

    public static void main(String[] args) {

        int res[] = {10, 20, 30, 40, 50};  
        int i = 1;
        int j = 4;

        int temp = res[i];
        res[i] = res[j];
        res[j] = temp;

       
        System.out.println("After Swap:");
        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Array1 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};

        int max=0;
        int min=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min )
            {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

// Count the Frequency of Each Element

class Array2 {
    public static void main(String[] args) {
        int arr[]= {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        int count [] = new int [arr.length];

        boolean visited[] = new boolean[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(visited[i]) {
              continue;

            }
           
        }
    }
}