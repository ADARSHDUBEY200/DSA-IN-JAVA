public class _18_DUPLICATE_STRING {

    public static void DuplicateString(String str, boolean ch[], int index, StringBuilder newStr) {

        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        // work
        if (ch[str.charAt(index) - 'a'] == false) {

            ch[str.charAt(index) - 'a'] = true;
            DuplicateString(str, ch, index + 1, newStr.append(str.charAt(index)));

        } else {
            DuplicateString(str, ch, index + 1, newStr);
        }

    }

    public static void main(String[] args) {
        String str = "apnnacollege";
        boolean ch[] = new boolean[26];
        DuplicateString(str, ch, 0, new StringBuilder(""));
       
    }

}
