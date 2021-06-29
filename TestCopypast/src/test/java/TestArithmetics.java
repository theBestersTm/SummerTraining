import org.junit.*;
import org.junit.rules.Timeout;

public class TestArithmetics {

    private static Arithmetics arithmetics;

    @Rule
    public Timeout timeout =  new Timeout(1000);
    @BeforeClass
    public static void runT() {
        arithmetics = new Arithmetics();
    }

    @Test
    public void testAdd() {

        double res = arithmetics.add(3, 7);
        Assert.assertTrue(res == 10);

        //if(res!=10) Assert.fail();

    }

    @Test
    public void testMult() {

        double res = arithmetics.mult(3, 7);
        if (res != 21) Assert.fail();

    }

    @Test
    public void testDeduct() {

        double res = arithmetics.deduct(3, 7);
        if (res != -4) Assert.fail();

    }

    @Test
    public void testDiv() {
        double res = arithmetics.div(10, 5);
        Assert.assertTrue(res == 2.0);

    }
    @Test(expected = Exception.class)
    public void testDivException() {
        arithmetics.div(10.0, 0.0);

    }
    @Test(timeout = 1000)
    public void testTime() {
        double res = arithmetics.div(10, 10);

    }

}

