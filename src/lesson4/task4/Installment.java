package lesson4.task4;

import java.util.Scanner;

public class Installment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть загальну суму кредиту:");
        double loanAmount = scanner.nextDouble();

        System.out.println("Введіть місячний відсоток на залишок по кредиту (%):");
        double monthlyInterestRate = scanner.nextDouble() / 100;

        System.out.println("Виберіть один з варіантів:");
        System.out.println("1. Розрахувати кількість щомісячних платежів для повного погашення кредиту.");
        System.out.println("2. Розрахувати суму щомісячного платежу.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введіть суму щомісячного внеску:");
                double monthlyPayment = scanner.nextDouble();
                calculateNumberOfPayments(loanAmount, monthlyInterestRate, monthlyPayment);
                break;
            case 2:
                System.out.println("Введіть кількість платежів:");
                int numberOfPayments = scanner.nextInt();
                calculateMonthlyPayment(loanAmount, monthlyInterestRate, numberOfPayments);
                break;
            default:
                System.out.println("Вибір неправильний.");
        }

        scanner.close();
    }

    public static void calculateNumberOfPayments(double loanAmount, double monthlyInterestRate, double monthlyPayment) {
        int numberOfPayments = 0;
        while (loanAmount > 0) {
            loanAmount *= (1 + monthlyInterestRate);
            loanAmount -= monthlyPayment;
            numberOfPayments++;
        }
        System.out.println("Кількість щомісячних платежів для повного погашення кредиту: " + numberOfPayments);
    }

    public static void calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfPayments) {
        double monthlyPayment = loanAmount * monthlyInterestRate  * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        System.out.println("Сума щомісячного платежу: " + monthlyPayment);
    }
}


