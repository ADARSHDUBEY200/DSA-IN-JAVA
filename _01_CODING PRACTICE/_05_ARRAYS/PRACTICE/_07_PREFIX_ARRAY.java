public class _07_PREFIX_ARRAY {

    public static int PrefixArray(int arr[]) {
        // Calucating the prefix array
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i]; // for making the array

        }

        int max = Integer.MIN_VALUE;
        int SumSubarry =0;
        // Calculating the sub array
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                if (start == 0) {
                     SumSubarry = prefix[end];

                } else {
                     SumSubarry = prefix[end] - prefix[start - 1];

                  
                }

                
                if (max < SumSubarry) {
                    max = SumSubarry;
                }

                SumSubarry = 0;

            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };
        int maxValue = PrefixArray(arr);
        System.out.println("THE MAXIMUM SUBARRAY SUM VALUE IS : " + maxValue);
    }

}
