public class CreditPaymentService {
    public double calculate(double loanAmount, double annualInterestRate, int loanTerm) {
        /*
        Месячная процентная ставка МПС= П% / 12 / 100= ... .

        Количество платежей равно количеству месяцев — M.

        Подставляем данные в формулу и считаем коэффициент аннуитета:

        МПС × (1 + МПС)^M / ((1 + МПС)^M − 1) = KA

        Теперь подставляем коэффициент аннуитета в расчет платежа:
        Кредит × KA = EП — ежемесячный платёж.
         */
        int numberOfPayments = loanTerm * 12;

        double monthlyInterestRate = annualInterestRate / 12 / 100;

        double annuityRatio = monthlyInterestRate*(Math.pow (1 + monthlyInterestRate, numberOfPayments)) / (Math.pow (1 + monthlyInterestRate, numberOfPayments)-1);

        double monthlyPayment = loanAmount*annuityRatio;

        return (int) monthlyPayment;
    }

}
