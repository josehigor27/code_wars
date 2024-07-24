package Multiples;

public class TransportationOnVacation {
    public static int rentalCarCost(int d){
       if (d>=7){
           return (d*40)-50;
       } else if(d>=3 && d<7){
           return (d*40)-20;
       } else {
           return d*40;
       }
    }
    public static void main(String[]args){
        System.out.println(rentalCarCost(7));
    }
}
