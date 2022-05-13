package Pattern.alphabetStar;

public class b_star_pattern {
    public static void b() {
        int height = 5;
        int width = (2 * height) - 1;
        int i, j, half = (height / 2);
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1 || i == half)
                        && j < (width - 2))
                    System.out.printf("*");
                else if (j == (width - 2)
                        && !(i == 0 || i == height - 1
                                || i == half))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }
}
