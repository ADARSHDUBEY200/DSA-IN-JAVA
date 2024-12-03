public class _10_Binary_Strings {

    public static void BinaryStrings(int n,int lastPlace, StringBuilder str ){
        //base
        if(n==0){
            System.out.println(str);
            return;
        }
       

        //work

        if (lastPlace==0) {
            str.append("0");
            BinaryStrings(n-1, 0, str);

            str.append("1");
            BinaryStrings(n, 1, str);
            
        }else{
            str.append("0");
            BinaryStrings(n-1,0,str);
        }


    }

    public static void main(String[] args) {
        
        BinaryStrings(3,0,new StringBuilder());
    }
    
}
