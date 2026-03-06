import java.util.Scanner;

public class aavilapanoexam
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int num = 15;

        System.out.print("Guess a number from 10 to 20: ");
        int guess = keyboard.nextInt();

        if (guess < num)
        {
            System.out.print("You lose! you guessed too low!");
        }
        else if (guess > num)
        {
            System.out.print("You lose! you guessed to high!");
        }
        else
        {
            System.out.print("You Win! you guessed correctly!");
        }
    }
}
