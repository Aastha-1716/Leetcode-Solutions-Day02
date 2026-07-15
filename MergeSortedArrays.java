import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in nums1 (m): ");
        int m = sc.nextInt();

        System.out.print("Enter the number of elements in nums2 (n): ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];

        System.out.println("Enter " + m + " sorted elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = m; i < m + n; i++) {
            nums1[i] = 0;
        }

        int[] nums2 = new int[n];

        System.out.println("Enter " + n + " sorted elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array:");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}