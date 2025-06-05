public class Main {
    public static void main(String[] args) {

        int startSum = 100;
        int receipt = 300;
        System.out.println("Итого на счету:");
        System.out.println(startSum + receipt); // Итого на счету

        if (receipt > 1000) {
            System.out.println(receipt / 100); // Бонусы
        } else {
            System.out.println("Бонус:");
            System.out.println("0");
        }
    }
}