package Pattern.alphabetStar;

public class c_star_pattern {
    public static void c() {
        int height = 5;
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < (height - 1); j++) {
                if (i == 0 || i == height - 1)
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }
}
