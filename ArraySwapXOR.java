import java.util.Arrays;

public class ArraySwapXOR {
    public static void main(String[] args) {
        int res []={10,20,30,40,50};

       for(int i=0,j=res.length-1;i<j;i++,j--)
        {
            
            res[i]=res[i]^res[j];
            res[j]=res[i]^res[j];
            res[i]=res[i]^res[j];
        }
        System.out.println(Arrays.toString(res));

        
        System.out.println("After Swap:");
        for(int k=0;k<res.length;k++){
            System.out.print(res[k]+" ");

        }
        System.out.println();
    }
    
}


