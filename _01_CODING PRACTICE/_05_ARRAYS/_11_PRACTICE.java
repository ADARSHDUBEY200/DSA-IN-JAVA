public class _11_PRACTICE {

    public static void PairsOfArray(int arr[]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i != j) {

                    System.out.print("(" + arr[i] + "," + arr[j] + ")");

                    count++;

                }
            }
            System.out.println();
        }

        System.out.println(" THE TOTAL NUMBER OF THE PAIRS IS : " + count);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };

        PairsOfArray(arr);
    }

}
