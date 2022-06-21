package Pattern.alphabetStar;

public class e_star_pattern {
    public static void e() {
        int height = 5;
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0 || i == height - 1)
                        || (i == height / 2
                                && j <= height / 2))
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }
}
