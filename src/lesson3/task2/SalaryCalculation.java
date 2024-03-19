package lesson3.task2;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class SalaryCalculation {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        double hourlyRate = Double.parseDouble(args[1]);
        double taxPercentage = Double.parseDouble(args[2]);

        int totalWorkdays = calculateWorkdays(month);
        double salaryWithoutTax = totalWorkdays * 8 * hourlyRate;
        double taxAmount = salaryWithoutTax * (taxPercentage / 100);
        double salaryWithTax = salaryWithoutTax - taxAmount;

        System.out.println("Зарплата за місяць без податку: $" + salaryWithoutTax);
        System.out.println("Сума податку: $" + taxAmount);
        System.out.println("Зарплата за місяць з податком: $" + salaryWithTax);
    }


    public static int calculateWorkdays(int month) {
        LocalDate date = LocalDate.now().withMonth(month).withDayOfMonth(1);
        int totalDays = date.lengthOfMonth();
        int workdays = 0;

        for (int i = 1; i <= totalDays; i++) {
            DayOfWeek dayOfWeek = date.withDayOfMonth(i).getDayOfWeek();
            if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
                workdays++;
            }
        }

        return workdays;
    }
}
