public class main {
    public static void main(String[] args) {
        BonusServis service = new BonusServis();

        int expected = 150;
        long amount = 5_000;
        boolean registered = true;
        long actual = service.calculate(amount, registered);
        System.out.println("1. " + expected + " == ? ==" + actual);

        expected = 50;
        amount = 5_000;
        registered = false;
        actual = service.calculate(amount, registered);
        System.out.println("2. " + expected + " == ? ==" + actual);

        expected = 500;
        amount = 70_000;
        registered=false;
        actual = service.calculate(amount, registered);
        System.out.println("4. " + expected + " == ? ==" + actual);

        expected = 500;
        amount = 100_000;
        registered = true;
        actual = service.calculate(amount, registered);
        System.out.println("3. " + expected + " == ? ==" + actual);





    }}



