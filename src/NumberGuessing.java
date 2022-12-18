import java.util.Scanner;
import java.util.Random;


//TODO: Save games
//TODO: Delete Difficulties
public class NumberGuessing {

    static Scanner input = new Scanner(System.in);
    public static void guessNumber() {




        System.out.println("Pick a difficulty: \nEasy (Do show previous guesses):     Hard (Do not show previous guesses):");
        System.out.println("1) 0 to 10 \t \t \t \t \t \t \t 4) 0 to 10 \n2) 0 to 100 \t \t \t \t \t \t 5) 0 to 100 \n3) 0 to 1000 \t \t \t \t \t \t 6) 0 to 1000");

        int number = input.nextInt();

        if (number <= 3) {
            diffEasy(number);
        } else {
            diffHard(number);
        }
    }

    private static void diffEasy(int mode) {
        Random randNumber = new Random();

    }

    private static void diffHard(int mode) {

        int n;
        int guessedNumber;
        Random randNumber = new Random();
        boolean won = false;

        if (mode == 4) {
            n = randNumber.nextInt(11);
        } else if (mode == 5) {
            n = randNumber.nextInt(101);
        } else {
            n = randNumber.nextInt(1001);
        }

        System.out.println("Guess the Number");
        for (int tries = 0; tries < 5; tries++) {
            guessedNumber = input.nextInt();

            if(n == guessedNumber) {
                System.out.println("Correct, you've won!");
                won = true;
                break;
            } else if (n > guessedNumber) {
                System.out.println("Too low! " + (5 - (tries + 1)) + " tries left");
            } else {
                System.out.println("Too high! " + (5 - (tries + 1)) + " tries left");
            }
        }

        if (!won) {

            System.out.println("You've lost! The number was " + n);

        }

    }




    }


