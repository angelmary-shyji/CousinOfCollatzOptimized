# Cousin of Collatz Sequence Analyzer

## Description  
This Java program analyzes a variant of the Collatz sequence, referred to as the "Cousin of Collatz" sequence. The program takes multiple space-separated positive integers as input and determines, for each integer \( n \), the number \( i \) (from 1 to \( n \)) that generates the longest sequence according to the Cousin of Collatz rules. It also measures the execution time of this computation.

## Cousin of Collatz Sequence Rules  
For a given integer \( n \), the sequence is generated using the following rules:  
1. If \( n \) is even, divide it by 2:  
   ```
   n = n / 2
   ```
2. If \( n \) is odd and \( n \mod 4 = 1 \), apply the transformation:  
   ```
   n = 7n + 1
   ```
3. If \( n \) is odd and \( n \mod 4 = 3 \), apply the transformation:  
   ```
   n = 7n - 1
   ```
4. The sequence continues until \( n = 1 \), at which point the length of the sequence is recorded.

## Program Functionality  
### 1. **Input Handling:**  
- The program reads a line of input from the user, which may contain multiple space-separated numbers.  
- It processes each number independently.  
- If the input contains `0`, the program terminates execution.  

### 2. **Finding the Longest Cousin of Collatz Sequence:**  
- For each input number \( n \), the program iterates through all numbers from \( 1 \) to \( n \) and computes their sequence lengths using the `getCousinCollatzLength()` function.  
- It tracks the number that produces the longest sequence and records the sequence length.  

### 3. **Performance Measurement:**  
- The program records the start time before the computation and the end time after completion.  
- It calculates the total execution time in milliseconds.  

### 4. **Output Format:**  
- The program prints the results in the format:  
  ```
  n longestStart longestLength executionTime
  ```
  - `n` is the input number.  
  - `longestStart` is the number between 1 and `n` that produces the longest sequence.  
  - `longestLength` is the length of that sequence.  
  - `executionTime` is the computation time in milliseconds.  

## Example Usage  
### **Input:**  
```
10
```
### **Processing:**  
For `n = 10`, the program evaluates numbers from 1 to 10 and determines which number produces the longest sequence.  
### **Output:**  
```
10 3 9 2
```
#### **Explanation:**  
- For `n = 10`, the number `3` generated the longest sequence.  
- The sequence length was `9`.  
- The computation took `2` milliseconds.  

## Code Structure  
### **Main Components**  
- **`main` method:**  
  - Handles user input and loops through multiple space-separated numbers.  
  - Calls `getCousinCollatzLength()` for each number from 1 to \( n \) to determine the longest sequence.  
  - Measures execution time and prints results.  

- **`getCousinCollatzLength(long n)` method:**  
  - Implements the Cousin of Collatz rules.  
  - Computes and returns the sequence length for a given starting number.  

## Complexity Analysis  
- The time complexity of the program is **O(n * T(n))**, where **T(n)** is the number of steps needed to reach 1 for a given `n`.  
- Since `T(n)` varies significantly based on the number, the worst-case scenario is hard to predict, but it follows a behavior similar to the original Collatz sequence.  

## Potential Optimizations  
- **Memoization:** Storing previously computed sequence lengths to avoid redundant calculations.  
- **Parallelization:** Distributing calculations across multiple threads for large inputs.  

---
