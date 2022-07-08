public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        double result = payment.calculate(1000000, 12, 9.99);
        System.out.println(Math.round(result));

        double result_1 = payment.calculate(1000000, 24, 9.99);
        System.out.println(Math.round(result_1));

        double result_2 = payment.calculate(1000000, 36, 9.99);
        System.out.println(Math.round(result_2));
    }
}
