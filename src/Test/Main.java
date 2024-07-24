package Test;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static String cutThemAll(List<Integer> lengths, long minLength) {

        int sum = lengths.stream().mapToInt(Integer::intValue).sum();

        return ""+sum;

    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 5, 4, 3);
        System.out.println(Main.cutThemAll(nums,4));
    }
}
