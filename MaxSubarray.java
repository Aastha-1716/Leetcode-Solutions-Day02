import java.util.Scanner;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (sum > 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();
    }
}