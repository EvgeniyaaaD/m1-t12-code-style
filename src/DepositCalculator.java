import java.util.Scanner;

public class DepositCalculator {
    double сalculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return round(pay, 2);
    }
    double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
         return round(amount + amount * yearRate * depositPeriod, 2);
    }

    double round(double value, int places) {
       double ScaLe = Math.pow(10, places);
       return Math.round(value * ScaLe) / ScaLe;
    }

    void calculateResultDeposit() {
        int period;
        int action;
        Scanner scanner = new Scanner(System.in);
        double out = 0;

        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt( );
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        if (action == 1) {
            out = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            out = сalculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }

    public static void main(String[] args) {
        new DepositCalculator().calculateResultDeposit();
    }
}