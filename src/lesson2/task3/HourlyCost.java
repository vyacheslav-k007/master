package lesson2.task3;

import java.util.Scanner;

public class HourlyCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість робочих годин на тиждень:");
        double workingHours = scanner.nextDouble();

        System.out.println("Введіть річну зарплатню з податками:");
        double yearlySalaryWithTaxes = scanner.nextDouble();

        System.out.println("Введіть відсоток податку:");
        double taxAmount = scanner.nextDouble();

        double yearlyTax = yearlySalaryWithTaxes / 100 * taxAmount;
        double yearlySalaryWithoutTaxes = yearlySalaryWithTaxes - yearlyTax;
        double hourlyCost = yearlySalaryWithoutTaxes / (workingHours * 4 * 12);

        System.out.println("При " + workingHours + " робочих годин на тиждень з річною зарплатею в " + yearlySalaryWithTaxes + "$" + " та податком " + taxAmount + "% ");
        System.out.println("година часу коштує " + hourlyCost + "$");

        scanner.close();
    }
}