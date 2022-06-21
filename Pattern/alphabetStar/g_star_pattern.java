package Pattern.alphabetStar;

public class g_star_pattern {
    public static void g() {
        int height = 5;
        int width = (2 * height) - 1;
        int i, j;
        width--;
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1)
                        && (j == 0 || j == width - 1))
                    System.out.printf(" ");
                else if (j == 0)
                    System.out.printf("*");
                else if (i == 0 && j <= height)
                    System.out.printf("*");
                else if (i == height / 2
                        && j > height / 2)
                    System.out.printf("*");
                else if (i > height / 2
                        && j == width - 1)
                    System.out.printf("*");
                else if (i == height - 1
                        && j < width)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }
}
