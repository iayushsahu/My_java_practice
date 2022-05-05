package My_java_practice;

import java.util.*;

public class radious_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextInt();
        double pow = Math.pow(r, 2);
        double ans = 3.142 * pow;
        System.out.println("radious of circle: " + ans);
    }
}
