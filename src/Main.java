public class Main {

    public static void main(String[] args) {
        // Бонусов нет

        int balance = 200;
        int popolnenie = 400;
        int chek = balance + popolnenie;

        int persent;

        if (popolnenie > 1000) {
            persent = popolnenie / 100 * 1;
        } else {
            persent = 0;
        }
        int vsego = chek + persent;
        System.out.println("Итоговая сумма" + vsego);

    }

    }







