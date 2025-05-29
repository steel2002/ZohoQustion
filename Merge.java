import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Merge {
    public static void main(String[] args) {
        int [] arr1={2,4,6,7,9,10,13};
        int [] arr2={2,3,4,5,6,7,8,9,11,15};
        ArrayList<Integer> me=new ArrayList<>();
        ArrayList<Integer> dub=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            me.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!me.contains(arr2[i])){
                me.add(arr2[i]);

            }else{
                dub.add(arr2[i]);
            }
            
        }
        Collections.sort(me);
       System.out.println("Merged Array:"+me);
       System.out.println("Dupicates Array:"+dub);
    }
    
}
// Right rotate in Value 

class Met6{
    void Right1(int [] arr){
        int temp=arr [arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        for(int num:arr){
            System.out.print(" " +num);
        }
    }
    public static void main(String[] args) {
        int rig[]={1,2,3,4,5};
        Met6 obj= new Met6();
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
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Met7 obj = new Met7();
        obj.Le(rig);
    }
}
