import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = scanner.nextInt();
        for (int i =1; i<=a; i++){
            System.out.println();
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
        }
    }
}
