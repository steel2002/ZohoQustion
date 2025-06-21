import java.util.*;



// ArrayList Example



public class Collactions {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<=10;i++){
            list.add(i);
            
        }
        System.out.println("ArrayList: " + list);   

        System.out.println("Size of ArrayList: " + list.size());  // Array size give me 

        System.out.println("Is ArrayList empty? " + list.isEmpty()); // Array is empty true || fasle 

        System.out.println("Does ArrayList contain 5? " + list.contains(11));  // Array check tha value true || false

        System.out.println("Element at index 3: " + list.get(3));   // Array index posstion la value 

        System.out.println("Element at remove "+list.remove(8));

        System.out.println("ArrayList after removal: " + list);     // Array after remove value
}
    
}

class Collactions1 {
    public static void main(String[] args) {
        ArrayList<Integer> t1 = new ArrayList<>();
        t1.add(12);
        t1.add(23);
        t1.add(48);
        t1.add(55);
        t1.add(66);
        
        
             Collections.sort(t1, Collections.reverseOrder());
             for(int n : t1){
               System.out.print(" " +n);
             }
        
        
    }

}

