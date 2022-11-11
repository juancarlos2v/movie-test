package utils;

public class StringUtil {

    public static String repeat(String str, int times){

        if(times<0){
            throw new IllegalArgumentException("numero de veces negativo");
        }
        String result= "";

        for (int i = 0; i < times; i++) {
            result+=str;
        }

        return result;
    }

    public static boolean isEmpty(String str){
        if(str.length()>0 ){
            return false;
        }
        return true;
    }
}
