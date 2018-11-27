import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
    int givenNum;
    givenNum = scanner.nextInt();
    boolean isPrime = true;
        for (int i = 2; i <= givenNum/2 ; i++)
        {
            if (givenNum % i == 0){
                 isPrime = false;
                break;
            }
        }
        if (isPrime)
        {
            System.out.println("It's prime number");
        }
        else
        {
            System.out.println("It's not a prime number");
        }
    }


}
