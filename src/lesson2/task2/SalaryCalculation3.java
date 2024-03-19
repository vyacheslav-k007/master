package lesson2.task2;

class SalaryCalculation3 {
    public static void main(String[] args) {
        double workingHours = 40;
        double hourlyСost = 5.5;
        double taxPercentage = 5.5;

        double monthlySalaryWithoutTaxes = workingHours * 4 * hourlyСost;
        double taxAmount = (monthlySalaryWithoutTaxes * taxPercentage) / 100;
        double monthlySalaryWithTaxes = monthlySalaryWithoutTaxes - taxAmount;
        double yearlySalaryWithoutTaxes = monthlySalaryWithoutTaxes * 12;
        double yearlySalaryWithTaxes = monthlySalaryWithTaxes * 12;
        System.out.println("Зарплатня на місяць без податків: " + monthlySalaryWithoutTaxes);
        System.out.println("Зарплатня на місяць з податками: " + monthlySalaryWithTaxes);
        System.out.println("Зарплатня на рік без податків: " + yearlySalaryWithoutTaxes);
        System.out.println("Зарплатня на рік з податками: " + yearlySalaryWithTaxes);
    }
}