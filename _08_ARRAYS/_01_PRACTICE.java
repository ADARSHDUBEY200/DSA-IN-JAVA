import java.util.Scanner;

public class _01_PRACTICE {

    public static void ChangeEveryThing(int marks[],int n){
        n=10;
        for(int i=0;i<=marks.length-1;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
      int  marks[]=new int [5];
      int arr[]={1,2,3,4};

      marks[0]=1;
      marks[1]=2;

      int n=5;

      System.out.println(marks[0]);
      System.out.println(marks[1]);
      System.out.println(marks.length);
      System.out.println(marks);
      for(int i=0;i<=marks.length-1;i++){
         marks[i]=sc.nextInt();

      }

      for(int i=0;i<=marks.length-1;i++){
        System.out.println(marks[i]);
      }

      ChangeEveryThing(marks,n);

      System.out.println("THE VALUE OF THE N IS : "+n);

      for(int i=0;i<=marks.length-1;i++){
        System.out.println("THE VALUE OF THE MARKS AFTER FUNCTION CALL IS" + "marks  [i]" + marks[i]);
      }
    }

  
    
}
