package task1;


import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {
    @Test
    public void testReverseConcat() {
        String str1 = "Hello";
        String str2 = "Diana";
        String actual = "HelloDiana";
        String expected = Utils.reverseConcat(str1, str2);
        Assert.assertEquals(expected,actual);
    }

}
