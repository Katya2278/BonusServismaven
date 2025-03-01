import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServisTest {

    @Test
    public void testRegistredUnderlimit() {
        BonusServis service = new BonusServis();

        int expected = 150;
        long amount = 5_000;
        boolean registered = true;
        long actual = service.calculate(amount, registered);
        //System.out.println("1. " + expected + " == ? ==" + actual);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testUndregistredUnderLimit() {
        BonusServis service = new BonusServis();
        int expected = 50;
        long amount = 5_000;
        boolean registered = false;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }


}
