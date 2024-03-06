package lab2.factorial;

public class Factorial {

    public static void main(String[] args) {

        int result = factorial(6);
        System.out.println(result);
    }

    public static int factorial(int number){
        if (number == 1 || number == 0){
            return 1;
        }
        return number * factorial(number - 1);
    }
}
