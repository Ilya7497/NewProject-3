public class Main {
    public static void main(String[] args) {
        int x = 200; // Начальный счёт
        int y = 1200; // Сумма пополнения

        int z;
        if (y > 1000) {
            z = 1;
        } else {
            z = 0;
        }

        int bonus = y / 100 * z;

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговая сумма: " + ((x + y) + bonus));


    }
}
