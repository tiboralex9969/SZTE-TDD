import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleInputsTest{
    SimpleInputs simpleInputs = new SimpleInputs();

    @Before
    public void shout(){
        System.out.println("Begins");
    }

    @Test
    public void testEmptyArray(){
        String[] empty = new String[0];
        String test = simpleInputs.emptyArray(empty);

        Assert.assertEquals("Hello, my friend", test);
    }

    @Test
    public void testSingleInput(){
        String[] stringArray = new String[] {"John"};
        String test = simpleInputs.singleArray(stringArray);

        Assert.assertEquals("Hello, John", test);
    }

    @After
    public void shout2(){
        System.out.println("Ends");
    }

}
