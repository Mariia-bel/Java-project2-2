public class Main {
    public static void main(String[] args) {


        //перемменные
        int balance = 100; //начальный счет
        int refill = 1100; // сумма пополнения
        int bonus = 0; // бонус

        //логика
        if (refill >= 1000) {
            bonus = refill / 100;
            System.out.println("Счёт пополнен на сумму " + refill + " руб. Ваш бонус составил " + bonus + " руб.");
        } else {
            System.out.println("Счёт пополнен на сумму " + refill + " руб. Внесите более 1000 руб. для получения бонуса.");
        }
        int total = balance + refill + bonus;
        System.out.println("Ваш баланс: " + total + " руб.");

    }
}