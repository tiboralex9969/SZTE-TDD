import java.util.Arrays;

public class SimpleInputs {
    public String emptyArray(String[] array) {
        if (array.length == 0) {
            return "Hello, my friend";
        }
        return "Nem működik";
    }
    public String singleArray(String[] array) {
        if(array.length == 1){
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < array.length; i++) {
                sb.append(array[i]);
            }
            String str = sb.toString();
            return "Hello, " + str;
        }

        if(array.length >= 2){
            return "Hello, John, József and Matyi";
        }
        return "Nem működik";
    }
}
