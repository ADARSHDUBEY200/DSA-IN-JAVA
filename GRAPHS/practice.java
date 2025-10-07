public class practice {
    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        String str = "";

        int dp[][] = new int[n][m];






        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                if (str.charAt(i - 1) == str.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // This is condition When Characters of String are same. 

                } else {
                    // This is the condition when the Characters of the strings are different.
                    int add = dp[i][j - 1] + 1;
                    int del = dp[i - 1][j] + 1;
                    int rep = dp[i - 1][j - 1] + 1;

                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }





    }
}
