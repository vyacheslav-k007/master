package lesson3.task3;
import java.util.Scanner;

public class DiscountCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість товару, яку ви хочете придбати");
        int enteredQuantity = scanner.nextInt();

        double totalPrice;
        if (enteredQuantity > 80) {
            double discount = Double.parseDouble(args[0]) * enteredQuantity * 0.13;
            totalPrice = Double.parseDouble(args[0]) * enteredQuantity - discount;
        }else if  (enteredQuantity > 30) {
            int additionalUnits = enteredQuantity - 30;
            double additionalDiscount = Double.parseDouble(args[0]) * additionalUnits * 0.004;
            totalPrice = Double.parseDouble(args[0]) * enteredQuantity * 0.88 - additionalDiscount;
        }else if  (enteredQuantity > 20) {
            double discount = Double.parseDouble(args[0]) * enteredQuantity * 0.10;
            totalPrice = Double.parseDouble(args[0]) * enteredQuantity - discount;
        }else if (enteredQuantity > 10) {
            double discount = Double.parseDouble(args[0]) * enteredQuantity * 0.05;
            totalPrice = Double.parseDouble(args[0]) * enteredQuantity - discount;

        } else {
            totalPrice = Double.parseDouble(args[0]) * enteredQuantity;
        }
        System.out.println("Загальна вартість товару: " + totalPrice);
    }
}
