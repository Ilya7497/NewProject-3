public class Main {
    public static void main(String[] args) {
        int amount = 200; // Начальный счёт
        int deposit = 1200; // Сумма пополнения

        int award;
        if (deposit > 1000) {
            award = 1;
        } else {
            award = 0;
        }

        int bonus = deposit / 100 * award;

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговая сумма: " + ((amount + deposit) + bonus));


    }
}
