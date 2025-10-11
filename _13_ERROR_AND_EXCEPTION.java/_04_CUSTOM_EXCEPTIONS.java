public class _04_CUSTOM_EXCEPTIONS {
    static class InvalidAmounnt extends Exception {
        InvalidAmounnt (String msg){
            super(msg);
        }
    }

    static class InvalidAge extends RuntimeException {
        InvalidAge(String msg){
            super(msg);
        }
    }
    public static void main(String[] args) {
        // throw new InvalidAmounnt("THIS IS INAVALID AMOUNT : "); compiler forces it to handle it.

        throw new InvalidAge("YOU AGE IS INVALID IN NATURE : "); // compiler is not going to force to handle it.
    }
}
