import java.util.Scanner;

public class lab4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("hello this is the menu. choose a number of 1-4 for a random quote");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("A memory is something that is consciously recalled, right? That's why sometimes, it can be mistaken or wrong. It's different from a memory locked deep within your heart");
                break;
            case 2:
                System.out.println("People are ignorant. They'll feel better as long as someone is punished");
                break;
            case 3:
                System.out.println("We fight, we survive, we endure, we don't need a reason");
                break;
            case 4:
                System.out.println("I'm feeling full of beans");
                break;
        }
    }
}
