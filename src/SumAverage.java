import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        float a,b,c,d,e;
        float sum;
        float average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any 5 numbers:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();

        sum = a + b + c + d + e;
        average =( a + b + c + d + e) / 5;
        System.out.println("Sum of above numbers :" + "" + sum);
        System.out.println("Average of above numbers :" + "" +average);
    }
}
