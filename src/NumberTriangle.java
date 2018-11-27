import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
          int row = scanner.nextInt();
          int i,j,number =1;

        for ( i =1; i<=row; i++){

            System.out.println();

            for ( j =1; j<=i; j++){

                System.out.print( number + " ");
                number++;
            }

        }
    }

}
