package lesson6.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Smith", "Developer", 6);
        Employee employee2 = new Employee("Dean", "Tailor", "PM", 7);

        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " - " + employee1.getPosition() + ", Hourly salary - " + employee1.getHourlySalary() + "$");
        employee1.salaryCalculation();
        employee1.haveLunch("pizza");

        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " - " + employee2.getPosition() + ", Hourly salary - " + employee2.getHourlySalary() + "$");
        employee2.salaryCalculation();
        employee2.haveLunch("puree with cutlet");



    }
}
