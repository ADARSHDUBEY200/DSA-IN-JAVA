
public class _02_Direction {

    public static void ShortestPath(String str) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'N') {

                y++;

            } else if (str.charAt(i) == 'S') {

                y--;

            } else if (str.charAt(i) == 'W') {

                x--;

            } else if (str.charAt(i) == 'E') {

                x++;

            }

        }

        int shortestDistance = (int) Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));

        System.out.println(
                "THE SHORTEST DISTANCE BETWEEN THE STARTING POINT AND THE FINAL POINT IS : " + shortestDistance);
    }

    public static void main(String[] args) {

        String directions = "WNEENESENNN";

        ShortestPath(directions);
    }

}
