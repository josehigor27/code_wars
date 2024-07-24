package Multiples;

public class Square {
    public static boolean isSquare(int n){

        if(Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0){
            System.out.println("É um quadrado perfeito");
            return true;
        } else {
            System.out.println("Não é um quadrado perfeito");
            return false;
        }
    }

    public static void main(String []args){
        System.out.println(isSquare(24));
        System.out.println(isSquare(25));
    }
}
