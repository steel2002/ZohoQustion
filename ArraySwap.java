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
