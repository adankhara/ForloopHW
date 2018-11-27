import java.util.Scanner;

public class StringToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        String name = scanner.next();
        System.out.println("Please enter your Surname:");
        String surName = scanner.next();

        String fullName  = name + " " + surName;

//        name = name.concat(surname);
//        System.out.println(name);

        System.out.println("Fullname:" + " " + fullName);

    }
}
