import java.util.HashSet;
import java.util.Set;

public class Leetcode {
   
        
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
    }

// 287. Find the Duplicate Number Binary Search LEET code only return one value

class FindDuplicatenumber {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int left = 1;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;

            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("The duplicate number is: " + left);
    }

}

