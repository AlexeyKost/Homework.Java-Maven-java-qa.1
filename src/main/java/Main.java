public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1000, true);
        System.out.println("1." + expected + "==?==" + actual);

        expected = 500;
        actual = service.calculate(1000_000, true);
        System.out.println("2." + expected + "==?==" + actual);


        expected = 10;
        actual = service.calculate(1000, false);
        System.out.println("3." + expected + "==?==" + actual);


    }
}