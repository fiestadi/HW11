package task2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Utils1Test {

        @Test
        public void testReplaceChar() {
            char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
            String str = new String(arr);
            str = str.replace("?", "e");
            assertEquals("I likе Java", str);
        }
    }




