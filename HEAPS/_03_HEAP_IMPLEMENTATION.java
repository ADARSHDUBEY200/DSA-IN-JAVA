import java.util.ArrayList;

public class _03_HEAP_IMPLEMENTATION {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data ){

            // STEP -1 : ADD THE DATA IN THE LAST OF THE ARRAYLIST
            arr.add(data);

            // STEP -2 : FIX THE HAEP 
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){

                // SWAPPING THE CHILD AND THE PARENT 

                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public void print (){

            for(int i=0 ; i<arr.size(); i++){
                System.out.println(arr.get(i)+" ");
            }
        }

        public int  peek(){
            return arr.get(0);  // minimum element in the heap 
        }

        private void heapify(int i){

            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i ;

            if(left < arr.size() && arr.get(left) < arr.get(minIdx)){
                    minIdx = left;
            }

            if(right < arr.size() && arr.get(right) < arr.get(minIdx)){
                minIdx = right;
            }

            if(minIdx != i ){
                int temp = arr.get(minIdx);
                arr.set(minIdx, arr.get(i));
                arr.set(i, temp);

                heapify(minIdx);
            }

        }

        public int remove(){

            // step:1 - swap the first and the last element 

            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step:2 - remove the element from the last 
            int value  = arr.remove(arr.size()-1);

            //step:3 - arrange the element by using of the heapify 

            heapify(0);

            return value;

        }

        public boolean isEmpty(){
            return arr.size() == 0;

        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(10);
        // heap.add(1);

        heap.print();
        System.out.println("THIS IS AFTER ");

        while(!heap.isEmpty()){
            System.out.println(heap.peek());
            heap.remove();

        }
    }
    
}
