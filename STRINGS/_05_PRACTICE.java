public class _05_PRACTICE {

    public static void main(String[] args) {
        
        String s1="Tony";

        for(char ch='a';ch<='z';ch++){
            s1+=ch;

        }

        System.out.println(s1);

        // IN THIS CODE WHEN WE ADD STRING IN THE EXISTING STRING THEN IN EVERY ITERATION THE STRING IS GOING TO COPY AND THEN NEW CHARACTER IS ADDED IN THET STRINGS WHICH M,EANS IN EVERY ITERATION FIRST A NEW COPY OF STRING IS CREATED AND AFTER THAT A NEW STRING CREATED SO THE TIME COMPLEXITY OF THAT STRING IS O(26*N) IF ADDEDE CHARACTER IS MORE THAN O(N*N);
        
        //THAT'S WHY WE USE STRING BUILDER 
        StringBuilder sb = new StringBuilder("");

        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }

        System.out.println(sb);

        //by using the string builder no copy are made only in every iteration neede for additon of the string that's the tome complexity is O(26)====>O(N)
    }
    
}
