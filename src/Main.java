public class Main {

    public static void main(String[] args) {

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

    }
}








