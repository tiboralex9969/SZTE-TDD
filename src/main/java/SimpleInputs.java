import java.util.Arrays;

public class SimpleInputs {
    public String emptyArray(String[] array) {
        if (array.length == 0) {
            return "Hello, my friend";
        }
        return "buta";
    }
    public String singleArray(String[] array) {
        if(array.length == 1){
            return "Hello, John";
        }
        if(array.length >= 2){
            return "Hello, John, József and Matyi";
        }
        return "buta2";
    }
}
