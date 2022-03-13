public class ShoutingInputs {
    public String onlyShouting(String[] array){
        if(array[0].equals(array[0].toUpperCase())){
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < array.length; i++) {
                sb.append(array[i]);
            }

            String str = sb.toString();
            return "HELLO " + str + "!";
        }
        return "This does not contain uppercase";
    }
}
