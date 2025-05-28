public class Main {
    public static void main(String[] args) {

        int startsum = 100;
        int receipt = 300;
        System.out.println(startsum + receipt); // Итого на счету


        if (receipt > 1000) {
        System.out.println(receipt / 100); // Бонусы
        } else {
            System.out.println("0");
        }
    }
}