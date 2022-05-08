import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (marks[i] == number) {
                System.out.print(i);
            }
        }
    }
}