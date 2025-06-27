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

// SubArray 

 class SubarraySum {
    public static int maxSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i]; 
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
        
    }
    

    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 5, 10, 50};
       int[] nums2 = {10, 20, 30, 40, 50};
       int[] nums3 = {12, 17, 15, 13, 10, 11, 12};
        
    }
}


class Rain {
    public static void main(String[] args) {
        int arr []= {2,3,1,3,2};
        int left=0,right=arr.length-1,leftmax=arr[left],rightmax=arr[right],water=0;

        while(left < right){
            if(leftmax < rightmax){
                leftmax=Math.max(leftmax,arr[left]);
            }
        }

    }

}

// 48. Rotate Image

 class Image {

    public void rotate(int[][] arr) {
        int n = arr.length;

     
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }

        printMatrix(arr);
    }

   
   private void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        new Image().rotate(arr);
    }
}
