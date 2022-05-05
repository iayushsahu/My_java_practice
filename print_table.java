package My_java_practice;

import java.util.Scanner;

public class print_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Table of " + n + " is :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + ": " + n * i);
        }

    }

}
