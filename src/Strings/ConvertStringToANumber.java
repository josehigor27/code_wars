package Strings;

import java.lang.Integer;
public class ConvertStringToANumber {

    public static int stringToNumber(String str){
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {

        System.out.println(stringToNumber("123"));
    }
}
