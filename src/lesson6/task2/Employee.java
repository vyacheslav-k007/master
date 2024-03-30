package lesson6.task2;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private double hourlySalary;

    public Employee(String firstName, String lastName, String position, double hourlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.hourlySalary = hourlySalary;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition (String position){
        this.position = position;
    }

    public double getHourlySalary(){
        return hourlySalary;
    }

    public void setHourlyWages (double hourlySalary){
        this.hourlySalary = hourlySalary;
    }


    public void salaryCalculation(){
        double workingHours = 40;
        double monthlySalaryWithoutTaxes = workingHours  * 4 * hourlySalary;
        System.out.println("Monthly salary without taxes: " + monthlySalaryWithoutTaxes + "$");


    }

    public void haveLunch(String food) {
        System.out.println(firstName + " " + lastName + " usually eats " + food + " for lunch");
        System.out.println();
    }


}
