import java.util.*;

public class number_pyramid {
    public static void main(String args[]) {
        // System.out.println("");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}
