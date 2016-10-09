import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
/**
 * Created by ralphigi on 08.10.16.
 */
@RunWith(Parameterized.class)
public class PrimeNumberTest {
    private PrimeNumberChecker pr;
    private boolean expectedResult;
    private Integer inputNumber;

    @Before
    public void initialize() {
        pr = new PrimeNumberChecker();
    }

    public PrimeNumberTest(Integer inputNumber, boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {2,true},
                {4,false},
                {7,true},
                {13,true},
                {24,false}
        });
    }

    @Test
    public void testPrimeNumbersChecker() {
        System.out.println("Parametrized number is: " + inputNumber);
        assertEquals(expectedResult,pr.validate(inputNumber));
    }

}
