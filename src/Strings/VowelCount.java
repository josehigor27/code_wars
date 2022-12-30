package Strings;

public class VowelCount {
    public static int getCount(String str){
      return str.toLowerCase().replaceAll("[^aeiou]","").length();
    }

    public static void main(String[] args) {

        VowelCount solution = new VowelCount();
        System.out.println(solution.getCount("pear tree"));

    }
}
