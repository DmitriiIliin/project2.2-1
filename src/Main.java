    public class Main {
    public static void main(String[] args) {
        // a totalAcc - итоговый счет на телефоне
        // b bonus - количество бонусных рублей
        // c putAcc сумма пополнения в рублях
        // d incAcc - начальное количество рублей на момент оплаты

        int totalAcc;
        int bonus;
        int putAcc = 100;
        int incAcc = 300;

        if (putAcc >= 1000) {
            bonus = (putAcc/ 100);
            totalAcc = (bonus + putAcc + incAcc);
        } else {
            bonus = 0;
            totalAcc = (putAcc + incAcc);
        }
        System.out.println((bonus) + "руб. Бонусных рублей");
        System.out.println((totalAcc) + "руб. Денежных средств на вашем телефоне");
    }


}
