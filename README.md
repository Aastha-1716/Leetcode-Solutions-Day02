# LeetCode Solutions - Day 02

This repository contains Java solutions to popular LeetCode problems with their problem descriptions, approaches, time complexity, space complexity, and examples.

---

## 📘 Problems Solved

| # | LeetCode | Problem | Topic | Approach | Time Complexity | Space Complexity |
|---|----------|---------|--------|----------|-----------------|------------------|
| 1 | 88 | Merge Sorted Array | Arrays | Copy and Sort | O((m+n) log(m+n)) | O(1) |
| 2 | 121 | Best Time to Buy and Sell Stock | Arrays | Minimum Price Tracking | O(n) | O(1) |
| 3 | 53 | Maximum Subarray | Arrays | Kadane's Algorithm | O(n) | O(1) |
| 4 | 704 | Binary Search | Binary Search | Binary Search | O(log n) | O(1) |
| 5 | 169 | Majority Element | Arrays | Boyer-Moore Voting Algorithm | O(n) | O(1) |
| 6 | 242 | Valid Anagram | Strings | Sorting | O(n log n) | O(n) |

---

## 📌 Problem Descriptions

### 🔹 LeetCode 88 – Merge Sorted Array

Merge two sorted arrays into one sorted array.

**Approach**
- Copy all elements of `nums2` into `nums1`.
- Sort the combined array.
- Return the merged array.

---

### 🔹 LeetCode 121 – Best Time to Buy and Sell Stock

Find the maximum profit by buying and selling one stock.

**Approach**
- Track the minimum price.
- Calculate profit at each step.
- Update the maximum profit.

---

### 🔹 LeetCode 53 – Maximum Subarray

Find the contiguous subarray with the largest sum.

**Approach**
- Use Kadane's Algorithm.
- Extend the current subarray if beneficial.
- Update the maximum sum.

---

### 🔹 LeetCode 704 – Binary Search

Search for a target element in a sorted array.

**Approach**
- Find the middle element.
- Search the appropriate half.
- Repeat until found or exhausted.

---

### 🔹 LeetCode 169 – Majority Element

Find the element appearing more than ⌊n/2⌋ times.

**Approach**
- Use Boyer-Moore Voting Algorithm.
- Maintain a candidate and count.
- Return the final candidate.

---

### 🔹 LeetCode 242 – Valid Anagram

Determine whether two strings are anagrams.

**Approach**
- Compare lengths.
- Sort both character arrays.
- Compare the sorted arrays.

---

## 💻 Technologies Used

- Java
- VS Code
- LeetCode
