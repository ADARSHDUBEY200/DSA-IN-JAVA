public class _05_SEARCH_SORTED_ROTATED_ARRAY {

    public static int Search(int arr[], int target, int si, int ei) {
        // BASE CASE
        if (si > ei) {
            return -1;
        }

        // WORK
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // CASE 1 : IF THE MID LIE ON THE LINE 1
        if (arr[si] <= arr[mid]) {

            // case a : if target is samller then the si and mid element then search in left
            // of mid
            if (target >= arr[si] && target <= arr[mid]) {
                return Search(arr, target, si, mid-1);
            } else {
                return Search(arr, target, mid+1, ei);
            }

        }

        // CASE 2 : IF THE MID IS LIE ON THE LINE 2
        if (arr[mid] <= arr[ei]) {

            // case c: if target is greater than the mid and smaller than the ei then we
            // need searh
            if (target >= arr[mid] && target <= arr[ei]) {
                return Search(arr, target, mid+1, ei);
            } else {
                return Search(arr, target, si, mid-1);
            }

        }

        return -1 ;
        // BELIVE IN INNER FUNCTION CALL

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int targetIndx = Search(arr, target, 0, arr.length - 1);
        System.out.println("THE TARGET IS AT THE INDEX IS : " + targetIndx);
    }

}
