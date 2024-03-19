package lesson3.task1;
import java.util.Scanner;

public class NumberInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число");
        int enteredNumber = scanner.nextInt();

        if (enteredNumber % 2 == 0) {
            System.out.println(enteredNumber + " парне");
        } else {
            System.out.println(enteredNumber + " непарне");
        }

        if (enteredNumber > 0) {
            System.out.println(enteredNumber + " додатнє");
        } else if (enteredNumber < 0) {
            System.out.println(enteredNumber + " від'ємне");
        }

        if (isPrime(enteredNumber)) {
            System.out.println(enteredNumber + " є простим числом");
        } else {
            System.out.println(enteredNumber + " є складеним числом");
        }

    }

    public static boolean isPrime(int enteredNumber) {
        if (enteredNumber< 2) {
            return false;
        }
        for (int i = 2; i < enteredNumber; i++) {
            if (enteredNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}