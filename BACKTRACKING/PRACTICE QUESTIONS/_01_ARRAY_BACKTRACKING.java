public class _01_ARRAY_BACKTRACKING {

    public static void PrintArr(int arr[]) {
        
        System.out.println();
        System.out.println("THIS THE ARRAY AFTER THE SUBTRACTION OF THE VALUE 1 IN THE ARRAY ");

        for (int i = 0; i <= arr.length - 1; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void ChangeArr(int arr[], int i) {

        // base case

        if (i >= arr.length) {

            System.out.println("THE ARRAY BEFORE THE SUBTRACTION OF THE VALUE 2 : ");

            for (int j = 0; j <= arr.length - 1; j++) {

                System.out.print(arr[j] + " ");
            }

            return;
        }

        // work
        arr[i] = i + 1;

        // BELEIVE IN OUR INNER FUNCTION CALL
        ChangeArr(arr, i + 1);

        // ON THE RETURN OF THE FUNCTION IS CALLED THE BACKTRACKING
        arr[i] = arr[i] - 2;

        // believe in the function call
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        int i = 0;
        // int n =1 ;

        ChangeArr(arr, i);
        PrintArr(arr);
    }

}
