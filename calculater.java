package My_java_practice;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        System.out.println("Enter two numbers for calculation: ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        System.out.println("Enter 1 for +");
        System.out.println("Enter 2 for -");
        System.out.println("Enter 3 for *");
        System.out.println("Enter 4 for /");
        int sym = sc.nextInt();

        switch (sym) {
            case 1:
                System.out.println("Answer is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Answer is: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Answer is: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Answer is: " + (num1 / num2));
                break;
            default:
                System.out.println("Enter vaild input");
        }
    }
}
