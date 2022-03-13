import org.junit.Assert;
import org.junit.Test;

public class ShoutingInputsTest {
    @Test
    public void onlyShoutingTest(){
        String[] array = new String[] {"BARRY"};
        ShoutingInputs shoutingInputs = new ShoutingInputs();

        String test = shoutingInputs.onlyShouting(array);
        Assert.assertEquals("HELLO BARRY!", test);
    }
}
