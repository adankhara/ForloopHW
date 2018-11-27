import java.util.Scanner;

public class CubeOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = scanner.nextInt();

        for (int i =1; i <= a; i++){
            int cube = i * i * i;
            System.out.println("Cube of "+ i+ ":" + cube);
        }
    }
}
