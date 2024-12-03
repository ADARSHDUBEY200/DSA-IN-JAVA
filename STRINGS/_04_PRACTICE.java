public class _04_PRACTICE {

    public static void main(String[] args) {
        
        // COMPARING FUNCTIONS IN STRINGS 

        // String s1="Tony";
        // String s2="Tony";
        // String s3=new String("Tony");
        // if (s1==s2) {
        //     System.out.println("YOUR STRINGS ARE EQUAL");
            
        // }else{
        //     System.out.println("YOUR STRINGS ARE NOT EQUAL ");
        // }

        // if (s1==s3) {
        //     System.out.println("your strings are equal");
            
        // }else{
        //     System.out.println("YOUR STRINGS ARE NOT EQUAL ");
        // }

        //HERE S1 AND S2 REFER THE SAME STRING "TONY" BUT S3 IS A NEW STRING WHICH IS MADE INSIDE THE MEMORY WHICH ARE NOT GOING TO REFER THE S1 AND S2 STRING THAT'S WHY THEY ARE NOT EQUAL SO IF YOU WANT TO COMAPRE THAT THE STRINGS ARE EQUAL OR NOT THEN YOU NEED TO USE THE EQUALS FUNCTION WHICH IS INBUILT IN JAVA .


        // if (s1.equals(s3)) {
        //     System.out.println("YOU STINGS ARE EQUAL ");
            
        // }else{
        //     System.out.println("your strings re not equal");
        // }



        //SUBSTRINGS FUNCTIONS OF THE JAVA 

        String s1="Hello";
        int si=1;
        int ei=4;


        // for(int i=si;i<ei;i++){
        //     System.out.print(s1.charAt(i));//ello//ell
        // }

        //SUBSTRING INBUILT FUNCTION 

        System.out.println(s1.substring(1,3));
        System.out.println(s1);
    }
    
}
