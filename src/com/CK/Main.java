package com.CK;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 0;

        int[][] dp = new int[2][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0)
                    dp[i % 2][j] = 1;
                else {
                    dp[i % 2][j] = dp[(i - 1) % 2][j] + dp[i % 2][j - 1];
                }
            }
        }

        return dp[(n - 1) % 2][m - 1];
    }
}