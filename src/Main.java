public class Main {
    public static void main(String[] args) {

        int startSum = 100;
        int receipt = 300;

        int bonus = 0;
        if (receipt > 1000) {
            bonus = receipt / 100;
        }

        int totalSum = startSum + receipt + bonus;
        System.out.println("Бонус:" + bonus);
        System.out.println("Итого на счету:" + totalSum);
    }
}