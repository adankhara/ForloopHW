import java.util.Scanner;

public class LeftNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int row = scanner.nextInt();
        int i,j,number;
        for (i =1; i<=row;i++){

            for (j=row; j>=i;j--)
                System.out.print(" ");

                for (number=i; number>=1;number--)
                    System.out.print(number);
                    System.out.println();
        }



    }
}

