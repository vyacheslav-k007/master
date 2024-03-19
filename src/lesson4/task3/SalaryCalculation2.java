package lesson4.task3;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class SalaryCalculation2 {
        public static void main(String[] args) {
            double hourlyRate = Double.parseDouble(args[0]);
            double taxPercentage = Double.parseDouble(args[1]);

            double totalSalaryWithoutTax = 0;
            double totalSalaryWithTax = 0;

            for (Month month : Month.values()) {
                int workdays = calculateWorkdays(month);
                double monthlySalaryWithoutTax = workdays * 8 * hourlyRate;
                double taxAmount = monthlySalaryWithoutTax * (taxPercentage / 100);
                double monthlySalaryWithTax = monthlySalaryWithoutTax - taxAmount;

                System.out.println(month + " " + monthlySalaryWithTax + " " + monthlySalaryWithoutTax);

                totalSalaryWithoutTax += monthlySalaryWithoutTax;
                totalSalaryWithTax += monthlySalaryWithTax;
            }

            System.out.println("TOTAL: " + totalSalaryWithTax + " " + totalSalaryWithoutTax);
        }

        public static int calculateWorkdays(Month month) {
            LocalDate date = LocalDate.of(LocalDate.now().getYear(), month, 1);
            int totalDays = date.lengthOfMonth();
            int workdays = 0;

            for (int day = 1; day <= totalDays; day++) {
                DayOfWeek dayOfWeek = date.withDayOfMonth(day).getDayOfWeek();
                if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY) {
                    workdays++;
                }
            }

            return workdays;
        }
    }

