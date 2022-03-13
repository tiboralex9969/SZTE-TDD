public class Split {

    public String hasComma(String[] array){
       StringBuffer sb = new StringBuffer();

       for(int i = 0; i < array.length; i++){
           sb.append(array[i]);
       }
       
       String str = sb.toString();
       if(str.contains(",")){
           str = str.replace(",", ", and ");
       }
       return "Hello " + str;
    }
}
