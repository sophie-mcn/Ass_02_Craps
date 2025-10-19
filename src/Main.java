import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain = "";
        boolean again = true;

        do {

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            int thePoint = 0;
            boolean game = true;
            boolean ynInput = false;

            System.out.println("die 1: " + die1);
            System.out.println("die 2: " + die2);
            System.out.println("sum: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("You crapped out! You lost.");
            }
            else if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("You rolled a natural. You won!");
            }
            else
            {
                thePoint = crapsRoll;
                System.out.println("The point is: " + thePoint);

                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;

                    System.out.println("die 1: " + die1);
                    System.out.println("die 2: " + die2);
                    System.out.println("sum: " + crapsRoll);

                    if (crapsRoll == 7)
                    {
                        System.out.println("You rolled a 7. You lost");
                        game = false;
                    } else if (crapsRoll == thePoint)
                    {
                        System.out.println("You rolled the point. You won!");
                        game = false;
                    }
                    else
                    {
                        System.out.println("Keep trying for the point. Roll again!");
                    }
                } while (game);

            }

            do
            {
                System.out.println("Do you want to play again? [y/n]");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("y")) {
                    again = true;
                    ynInput = true;
                } else if (playAgain.equalsIgnoreCase("n")) {
                    again = false;
                    ynInput = true;
                } else {
                    System.out.println("Please enter y/n not: " + playAgain);
                    ynInput = false;
                }
            } while (ynInput = false);


        } while (again);
    }
}