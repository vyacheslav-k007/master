package lesson6.task4;

public class Credit {
    private String borrowerName;
    private double amount;
    private double interestRate;
    private int duration;


    public Credit(String borrowerName, double amount, double interestRate, int duration) {
        this.borrowerName = borrowerName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double calculateTotalPayment() {
        double totalInterest = amount * interestRate * duration / 12;
        return amount + totalInterest;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = interestRate / 12;
        double monthlyPayment = amount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -duration));
        return monthlyPayment;
    }
    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
