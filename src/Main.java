public class Main {
    public static void main(String[] args) {
        int InitialBalance = 300;
        int added = 1300;

        int bonus = 0;
        if (added > 1000) {
            bonus = added / 100;

            int finalBalance = InitialBalance + added + bonus;
            System.out.println("Итоговый счет:" + finalBalance);
            System.out.println("Бонус:" + bonus);

        }


    }
}