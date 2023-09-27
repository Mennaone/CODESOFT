package game.number;

import java.util.*;

public class GameNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char check = 'N';
        do {
            int num = (int) (Math.random()*100) + 1;
            System.out.println("Please enter your guss number: ");
            int guss_num = input.nextInt();
            int count = 0, attem = 3;
            while (attem >= 1) {
                attem--;
                if (guss_num == num) {
                    System.out.println("is correct");
                    count++;
                    break;
                } else if (guss_num > num) {
                    System.out.println("too high");
                } else if (guss_num < num) {
                    System.out.println("too low");
                }
                System.out.println("Oops!, try again you now have " + (attem+1) +" attempts ");
                guss_num = input.nextInt();
            }
            System.out.println("your score = " + count+" / 4");
            System.out.println("Do you want to play another game? (y or n)");
            check = input.next().charAt(0);
        } while (check == 'y' || check == 'Y');

    }

}
