# Leetcode-Solutions-Day02

Problems Included
1. Merge Sorted Array
Description

Merge two sorted arrays into a single sorted array by copying the elements of the second array into the first array and sorting the combined array.

Algorithm
Copy all elements of nums2 into the empty positions of nums1.
Sort the entire nums1 array.
Return the merged sorted array.

Time Complexity: O((m + n) log(m + n))

Space Complexity: O(1) (excluding the sorting algorithm's internal space)

2. Best Time to Buy and Sell Stock
Description

Find the maximum profit by buying a stock once and selling it once. Keep track of the minimum stock price seen so far and calculate the maximum profit during traversal.

Algorithm
Initialize the minimum price with the first element.
Traverse the array.
Update the minimum price whenever a smaller value is found.
Calculate the current profit.
Update the maximum profit if the current profit is greater.
Return the maximum profit.

Time Complexity: O(n)

Space Complexity: O(1)

3. Maximum Subarray
Description

Find the contiguous subarray with the largest sum using Kadane's Algorithm.

Algorithm
Initialize sum = 0 and maxSum = nums[0].
Traverse the array.
If the current sum is positive, add the current element.
Otherwise, start a new subarray from the current element.
Update the maximum sum whenever a larger sum is found.
Return the maximum sum.

Time Complexity: O(n)

Space Complexity: O(1)

4. Binary Search
Description

Search for a target value in a sorted array using the Binary Search algorithm.

Algorithm
Initialize left and right.
Find the middle index.
If the middle element is the target, return its index.
If the target is greater, search the right half.
Otherwise, search the left half.
Return -1 if the target is not found.

Time Complexity: O(log n)

Space Complexity: O(1)

5. Majority Element
Description

Find the element that appears more than ⌊n/2⌋ times using the Boyer-Moore Voting Algorithm.

Algorithm
Initialize candidate and count.
Traverse the array.
If count becomes zero, choose the current element as the new candidate.
Increase the count if the current element matches the candidate.
Otherwise, decrease the count.
Return the candidate.

Time Complexity: O(n)

Space Complexity: O(1)

6. Valid Anagram
Description

Determine whether two strings are anagrams by sorting their characters and comparing the sorted arrays.

Algorithm
Check whether both strings have the same length.
Convert both strings into character arrays.
Sort both arrays.
Compare the sorted arrays.
Return true if they are equal; otherwise, return false.

Time Complexity: O(n log n)

Space Complexity: O(n)

Technologies Used
Java
VS Code
LeetCode
