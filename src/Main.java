public class Main {
    public static void main(String[] args) {
        int Balance = 100;
        //начальный баланс
        int Limit = 1000;
        //лимит пополнения для бонуса
        int Deposite = 999;
        int Bonus = Deposite / 100;

        if (Deposite < Limit){
            Bonus = 0;
        }

        int Total = Balance + Deposite + Bonus;
        System.out.println(Total);
    }
}
