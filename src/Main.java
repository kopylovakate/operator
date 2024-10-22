public class Main {

    public static void main(String[] args) {

        // Бонусов нет

        int balance = 200;
        int replenishment = 400;
        int total = balance + replenishment;

        int persent;
        if (replenishment > 1000) {
            persent = replenishment / 100 * 1;
        } else {
            persent = 0;
        }

        int general = total + persent;

        System.out.println("Итоговая сумма" + general);

        // Бонус есть

        int score = 300;
        int made = 1500;
        int whole = (score + made);

        int fraction;
        if (made > 1000) {
            fraction = made / 100 * 1;
        } else {
            fraction = 0;
        }

        int finish = whole + fraction;

        System.out.println("Итоговая сумма" + finish);
    }
}








