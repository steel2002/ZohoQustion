public class ArraySwapXOR {
    public static void main(String[] args) {
        int res []={10,20,30,40,50};

        int i=1;
        int j=4;

        res[i]=res[i]^res[j];
        res[j]=res[i]^res[j];
        res[i]=res[i]^res[j];

        System.out.println("AfterSwap :");
        for(int k=0;k<res.length;k++){
            System.out.print(res[k]+" ");

        }
        System.out.println();
    }
    
}
