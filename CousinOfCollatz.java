//Name: Angel Mary Shyji

import java.util.Scanner;

public class CousinOfCollatz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            // Accept multiple inputs separated by whitespace
            String input = in.nextLine().trim();
            String[] inputs = input.split(" ");

            for (String numStr : inputs) {
                long n = Long.parseLong(numStr);
                if (n == 0) break; // exit condition

                // Start measuring execution time
                long startTime = System.currentTimeMillis();

                long longestStart = 0;
                int longestLength = 0;

                // Iterate from 1 to n to find the longest Cousin of Collatz sequence
                for (long i = 1; i <= n; i++) {
                    int length = getCousinCollatzLength(i);
                    if (length > longestLength) {
                        longestLength = length;
                        longestStart = i;
                    }
                }

                // End measuring execution time
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;

                // Output in the expected format: n longestStart longestLength executionTime
                System.out.println(n + " " + longestStart + " " + longestLength + " " + executionTime);
            }
        }
    }

    // Function to compute the Cousin of Collatz sequence length for a given number n
    public static int getCousinCollatzLength(long n) {
        int length = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 4 == 1) {
                n = 7 * n + 1;
            } else if (n % 4 == 3) {
                n = 7 * n - 1;
            }
            length++;
        }
        // Include the last step when n becomes 1
        length++;
        return length;
    }
}
