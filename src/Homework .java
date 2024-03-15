// Main class

import java.util.Scanner;
class Homework {
    public static void main(String[] args) {
        datermain b = new datermain();
        Scanner cn = new Scanner(System.in);
        System.out.println("Input three number :");
        int n =cn.nextInt();
        for(int i =0 ;i<3;i++){
            System.out.println("Enter Number : ");
            int number = cn.nextInt();
            b.hightNumber(number);
            b.lowerNumber(number);
        }
        System.out.println("The Greatest is :"+ b.highestnumber);
        System.out.println("The Lowest is : "+ b.lowernumber);
    }
}

