
public class _02_PRACTICE {

    // if we take the left bottom element as the starting point then what we need to do 

    public static void StairCaseSorted2( int arr [][] , int key ){

        int row = arr.length-1 ;
        int coloumn =0;

        while (row >=0 && coloumn < arr[0].length) {

            if ( arr[row][coloumn]== key ){

                System.out.println(" THE GIVEN KEY IS FOUNT OUT AT BY TAKING THE STARTING OF LEFT CORNER ELEMENT : "+"("+row+","+coloumn+")");

                break ;
            }else if (arr[row][coloumn]< key ) {

                coloumn ++;
                
            }else{

                row--;

            }
            
        }
    }

    public static void StairCaseSorted(int arr[][], int key) {

        int row = 0;
        int coloumn = arr[0].length - 1;
        int num[] = new int[2];
        System.out.println(arr[row][coloumn]);

        while ((row < arr.length) && (coloumn >= 0)) {
            
            // COMPARE THE VALUE OF THE KEY WITH THE CELL ELEMENT

            if (arr[row][coloumn] == key) {

                System.out.println("THE GIVEN KEY IS AT THE INDEX IS BY USING THE RIGHT CORNER ELEMENT AS THE CORNER ELEMENT : " + "("+row+","+coloumn+")");

                break;

            } else if (arr[row][coloumn] < key) {

                row++;

            } else {

               coloumn--;

            }
        }

    }

    public static void main(String[] args) {

        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 },

        };

        int key = 33;

        StairCaseSorted(arr, key);
        StairCaseSorted2(arr, key);
        // System.out.println(" THE GIVEN KEY IS FOUND AT THE INDEX :
        // "+"("+num[0]+","+num[1]+")");
    }

}
