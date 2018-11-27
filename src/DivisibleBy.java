import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the limit:");
        int a = scanner.nextInt();
        int i;
        System.out.print("number divisible by 3 are:" + " ");

        for ( i = 1; i <= a; i++){
            if (i%3==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Number divisible by 5 are:" + " ");

        for (i=1; i<=a; i++){
            if (i%5==0){
                System.out.print(i + " ");
            }
        }

    }
}
