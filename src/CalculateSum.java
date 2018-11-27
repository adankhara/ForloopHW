import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();

        float sum=2.0f;

        for (int i =2; i <=n;i++){
           sum += 1.0f/i;
        }
        System.out.println(sum);
    }
}
