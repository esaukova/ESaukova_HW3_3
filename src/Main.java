import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму кредита: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Введите годовую процентную ставку: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Введите срок кредита в годах: ");
        int loanTerm = scanner.nextInt();


        double monthlyPayment = service.calculate(loanAmount, annualInterestRate, loanTerm);

        System.out.println("Ежемесячный платеж: " + monthlyPayment);

    }
}

