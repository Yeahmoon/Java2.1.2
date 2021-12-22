public class Main {
    public static void main(String[] args) {
        int balance = 100;
        //начальный баланс
        int limit = 1000;
        //лимит пополнения для бонуса
        int deposite = 500;

        int bonus = 0;
        //изначальный бонус
        if (deposite > limit) {
            bonus = deposite / 100;
        }
        int total = balance + deposite + bonus;

        System.out.println(total);
    }
}
