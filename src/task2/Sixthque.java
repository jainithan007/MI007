package task2;


import java.util.Scanner;

public class Sixthque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        double PerDay = sc.nextDouble();
        int Days = sc.nextInt();
        
        double hotel;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                hotel = PerDay * Days * 1.2;
                break;
            default:
                hotel = PerDay * Days;
                break;
        }


 
    }
}


