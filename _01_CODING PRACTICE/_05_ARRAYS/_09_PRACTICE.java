public class _09_PRACTICE {

    // BASICALLY BINARY SEARCH CALLED THAT
    // WE NEED TO SORT OUR ARRAY AND IT ALWAYS WORKS ON THE SORTED ARRAY

    // ALGORITHM
    // 1. CREATE A LOOP AND FIND THE MIDDLE ELEMENT WHICH IS EQAUL TO MID =
    // (LOW+HIGH)/2;
    // 2. COMPARE IF THE ELEMET IS SMLLER THAN THE MIDDLE ELEMENT THEN WE NEED TO
    // SERACH IN LEFT SIDE ARRAY AND IF THE ELEMET IS LARGEST THEN WE NEED TO SEARCH
    // IN THE RIGHT SIDE OF THEN ARRAY

    public static int BinarySerach(int arr[], int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {

                return mid;

            } else if (arr[mid] < key) {

                low = mid + 1;

            } else {

                high = mid - 1;

            }
        }

        return -1;

    }

    public static void main(String[] args) {
            
            int arr []= {2,5,6,9,10,15,16};
            int key = 10;

           int value =  BinarySerach( arr, key );
           System.out.println("THE INDEX OF THE KEY YOU WANT OT FIND IS : "+value );
        }

}
