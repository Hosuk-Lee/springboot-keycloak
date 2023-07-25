package developer.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsTest {

    @Test
    void integerEquals(){
        Integer a = 10;
        Integer b = 10;
        Assertions.assertEquals(a,b);
        Assertions.assertTrue(a==b);
        Assertions.assertTrue(a.equals(b));
    }

}
