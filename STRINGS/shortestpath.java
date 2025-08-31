public class shortestpath {

    public static float shortesttpath(String path) {

        // Initial Co-ordinates
        int x = 0;
        int y = 0;

        // Loop for calculating final coordinates---
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i); // stores letter at that index

            if (direction == 'S')
                y--;
            else if (direction == 'N')
                y++;
            else if (direction == 'E')
                x++;
            else if (direction == 'W')
                x--;
        }
        // shortest path= sqrt(x^2+y^2)
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path= " + shortesttpath(path));
    }
}
