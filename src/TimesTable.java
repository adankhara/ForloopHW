import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive starting number:");
        int i = scanner.nextInt();
        System.out.println("Please enter a positive ending number:");
        int j = scanner.nextInt();

        if (i <= 0 || j <= 0){
            System.err.println("Invalid Entry..!!!");
            return;
        }
        for (int n = 1; n <=j; n++){
            //System.out.println(n);
            int sum = i * n;
            System.out.println(i + "*" + n +"="+ sum);
        }
    }
}
