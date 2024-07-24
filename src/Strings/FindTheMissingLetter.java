package Strings;

import java.util.ArrayList;

public class FindTheMissingLetter {

    public static  char findTheMissingLetter(char[]array){
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        int c = 0;

        for (int i = firstElement; i< lastElement;i++){
            if(!(i == array[c])){
                return (char) i;
            }
            c++;
        }
        return ' ';
    }

    public static void main(String[] args) {

        char [] array = new char[]{'a','b','c','d','f'};
        char [] array2 = new char[]{'O','Q','R','S'};

        System.out.println( findTheMissingLetter(array));
        System.out.println( findTheMissingLetter(array2));
    }
}
