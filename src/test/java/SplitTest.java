import org.junit.Assert;
import org.junit.Test;

public class SplitTest {

    @Test
    public void hasCommaTest() {
        String[] array = new String[] {"Maya,Kayamode"};
        Split split = new Split();

        String test = split.hasComma(array);
        Assert.assertEquals("Hello Maya, and Kayamode", test);
    }
}
