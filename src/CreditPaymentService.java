public class CreditPaymentService {
    public double calculate(double sun, double term, double bid) {
        double monthlyInterest = bid / 12 / 100;
        double coefficient = monthlyInterest + (monthlyInterest/(Math.pow((1 + monthlyInterest), term) - 1));
        double payment = coefficient * sun;
         return payment;
    }
}
