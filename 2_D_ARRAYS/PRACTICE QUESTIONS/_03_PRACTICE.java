

public class _03_PRACTICE {

    public static void main(String[] args) {
        
        int [][] arr={{1,2,3},{4,5,6}};
        int trans[][]=new int[arr[0].length-1][arr.length-1];

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                trans[j][i]=arr[i][j];
            }
        }

        for(int i=0;i<=trans.length-1;i++){
            for(int j=0;j<=trans[0].length-1;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
