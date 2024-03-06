package lab2.printDigit;

import java.util.Scanner;

public class PrintDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printDigit(number);
    }

    public static void printDigit(int number){
        if (number < 10){
            System.out.println(number);
        }else {
            printDigit(number / 10 );
            System.out.println(number % 10);
        }
    }
}
