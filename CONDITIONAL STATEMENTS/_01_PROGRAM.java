 import java.util.*;

 public class _01_PROGRAM {
 
    public static void main(String[] args) {
        int age=16;
        // SINGLE IF ELSE
        if(age>=18){
            System.out.println("your are adul youc can drive\n ");

        }else{
            System.out.println("you are eligilble for driving");
        }

        // MULTIPLE IF CONDITIONS IN CODE 

        if (age>=18) {
            System.out.println("you are eligible for driving ");
            
        }
        if(age>13&&age<18){
            System.out.println("you are a teenager");
        }
        else{
            System.out.println("you area kid you are not elibile for any thing ");
        }
    }
 }
