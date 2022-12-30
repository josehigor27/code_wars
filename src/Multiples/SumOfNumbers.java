package Multiples;

import java.util.stream.IntStream;

public class SumOfNumbers {

    public int getSum(int a, int b){
//        int sum = 0;
//        if(a!=b){
//          if(a<b){
//              for(;a<=b;a++){
//                  sum += a;
//              }
//              return sum;
//          } else if(b<a){
//              for(;b<=a;b++){
//                  sum+=b;
//              }
//              return sum;
//          }
//
//        }
//        return a;
//        Solução abaixo mais compacta
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }
    public static void main(String[] args) {
        SumOfNumbers solution = new SumOfNumbers();
        System.out.println(solution.getSum(2,1));
    }
}