public class _05_STAIRCASE_SEARCH {

    public static boolean StairCaseSerach(int arr[][], int key) {

        int start = 0;
        int end = arr[0].length - 1;

        while ((start <= arr.length - 1) && (end >= 0)) {
            if (arr[start][end] == key) {
                System.out.println("AT THE INDEX : "+start+","+end);
                return true;
            } else if (arr[start][end] < key) {
                start++;
            } else if (arr[start][end] > key) {
                end--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int key = 25;

        boolean value = StairCaseSerach(matrix, key);
        System.out.println("THE KEY IS FOUND OR NOT : " + value);
    }

}
