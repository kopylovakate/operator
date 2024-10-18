public class Bonus {
    public static void main(String[] args) {
        // Бонус есть

        int balance = 300;
        int popolnenie = 1500;
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
