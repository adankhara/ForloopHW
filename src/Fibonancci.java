import java.util.Scanner;

public class Fibonancci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int givenNum = scanner.nextInt();
        int n1 =0, n2 =1,n3;
        if (givenNum<1){
            return;
        }
        for (int i =1; i<=givenNum;i++){
            n3 = n1 +n2;
            n1=n2;
            n2=n3;
            System.out.println(n1);

        }
    }
}
