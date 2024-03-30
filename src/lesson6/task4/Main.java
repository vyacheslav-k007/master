package lesson6.task4;

public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit("Thomas Black", 0, 0, 0);
        credit.setAmount(10000);
        credit.setInterestRate(0.05);
        credit.setDuration(12);
        credit.setBorrowerName("Ted Tailor");

        System.out.println("Borrow name - " + credit.getBorrowerName() + ", Amound - " + credit.getAmount() +", Interest rate - " + credit.getInterestRate() +", Duration - " + credit.getDuration());
        System.out.println("Total Payment: " + credit.calculateTotalPayment());
        System.out.println("Monthly Payment: " + credit.calculateMonthlyPayment());
    }
}
