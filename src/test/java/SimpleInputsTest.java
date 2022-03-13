import org.junit.Assert;
import org.junit.Test;

public class SimpleInputsTest{
    SimpleInputs simpleInputs = new SimpleInputs();
    String test;

    @Test
    public void testEmptyArray(){
        String[] empty = new String[0];
        test = simpleInputs.emptyArray(empty);

        Assert.assertEquals("Hello, my friend", test);
    }

    @Test
    public void testSingleInput(){
        String[] stringArray = new String[] {"John"};
        test = simpleInputs.singleArray(stringArray);

        Assert.assertEquals("Hello, John", test);
    }
    @Test
    public void testMultipleInput(){
        String[] stringArray = new String[] {"John", "József", "Matyi"};
        test = simpleInputs.singleArray(stringArray);

        Assert.assertEquals("Hello, " + stringArray[0] + ", " + stringArray[1] + " and " + stringArray[2], test);
    }
}
