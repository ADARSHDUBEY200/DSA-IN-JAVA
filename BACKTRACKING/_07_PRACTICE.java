public class _07_PRACTICE {

    public static void Subset(String str, int i, String ans) {

        // BASE CASE
        if (i == str.length()) {
            
            if (ans == "") {
                System.out.println("null");
            } else {
                System.out.println(ans + " ");
            }

            return;
        }

        // WORK

        // YES CHOICE
        Subset(str, i + 1, ans + str.charAt(i));

        // NO CHOICE
        Subset(str, i + 1, ans);

        // BELIVE IN THE INNER FUNCTION CALL

    }

    public static void main(String[] args) {

        String str = "abc";
        Subset(str, 0, "");
    }

}
