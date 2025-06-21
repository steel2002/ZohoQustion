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

        System.out.println("duplicate number is: " + left);
    }

}

// 746. Min Cost Climbing Stairs Top down Method

class MinCostClimbingStairs {
    public static void main(String[] args) {
        int [] cost = {10,15,20};
        int n= cost.length;

        int dp []= new int [n+1];

        dp[0]=0;
        dp[1]=0;

        for(int i=2;i<=n;i++){
            dp[i]=Math.min(cost[i-1] + dp[i-1], cost[i-2] + dp[i-2]);

        }
        System.out.println("The minimum cost to climb the stairs is: " + dp[n]);
    }
}


  





