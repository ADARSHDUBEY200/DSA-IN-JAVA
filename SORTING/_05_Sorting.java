public class _05_Sorting {

    public static void BubbleSort(int numbers[]) {

        for (int i = 0; i <= numbers.length - 1; i++) {// numbers of the turn we comapred in the array

            // adjacent element comparision
            for (int j = 0; j <= numbers.length - 2 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
            }

        }

    }

    public static void SelectionSort(int numbers[]) {

        for (int i = 0; i <= numbers.length - 1; i++) {
           int min=Integer.MAX_VALUE;
           int index=0;
            for (int j = i; j <= numbers.length - 1; j++) {
                if (min> numbers[j]) {
                    min=numbers[j];
                    index=j;
                   

                }
            }

            // Swap

            if(min<numbers[i]){
                int temp=numbers[i];
                numbers[i]=min;
                numbers[index]=temp;
                

            }

       
        }

    }

    public static void InsertionnSort(int numbers[]){
        for(int i=1;i<=numbers.length-1;i++){
            int insert=numbers[i];
            int index=i;
            for(int j=i-1;j>=0;j--){
                if (insert<numbers[j]) {
                 
                    numbers[index]=numbers[j];
                    numbers[j]=insert;
                    index--;
                    
                }
            }
        }
    }

    public static void CountingSort(int numbers []){
        int max =Integer.MIN_VALUE;
// FOR FINDING THE MAXIMUM RANGE IN THE ARRAY
        for(int i=0;i<=numbers.length-1;i++){

            if(max<numbers[i]){
                max=numbers[i];
            }

        }

        int count []=new int[max+1];
        
        // NOW WE MAKE THE COUNT ARRAY

        for(int i=0;i<=numbers.length-1;i++){

           count[numbers[i]]++;


        }

        //SORTING 

        int index=0;

        for(int i=0;i<=count.length-1;i++){

            for(int j=1;j<=count[i];j++){

                numbers[index]=i;
                index++;

            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1,4,1,3,2,4,3,7};

        // BubbleSort(numbers);
        // SelectionSort(numbers);
        //    InsertionnSort(numbers);

        CountingSort(numbers);

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i]);
        }
    }

}
