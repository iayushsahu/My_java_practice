import java.util.Scanner;
class find_largest_number_between_3 {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int largest;
          if(a>b && a>c){
              largest = a;
          }
          else if(b>a && b>c){
              largest = b;
          }
          else{
              largest = c;
          }
          System.out.println("largest number is: " + largest);
  }
}