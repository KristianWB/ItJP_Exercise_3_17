import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args)   {
        Random randominstigator = new Random();
        Scanner input = new Scanner(System.in);

        int random = randominstigator.nextInt(3);

        System.out.print(random + "\n");

        System.out.print(
                "Press 1 for scissor, 2 for rock or 3 for paper: "
        );

        int choice = input.nextInt();

        if (random == 0) {
            if (choice == 1)
                System.out.print(
                        "Computer choose scissors and player chose scissors... its a TIE: try again"
                );
            else if (choice == 2)
                System.out.print(
                        "Computer choose scissors and player chose rock... Therefore Player wins!!!"
                );
            else
                System.out.print(
                        "Computer choose scissors and player chose paper... Computer wins"
                );
        }
        else if (random == 1) {
            if (choice == 1)
                System.out.print(
                        "Computer chose rock and player chose scissors... Computer wins"
                );
            else if (choice == 2)
                System.out.print(
                        "Computer choose rock and player choose rock... Its a TIE"
                );
            else
                System.out.print(
                        "Computer choose rock and Player choose paper... player wins"
                );
        }
        else {
            if (choice == 1)
                System.out.print(
                        "Computer choose paper and player choose scissors... player wins"
                );
            else if (choice == 2)
                    System.out.print(
                            "Computer choose paper and Player choose rock... Computer wins"
                    );
            else
                System.out.print(
                        "Computer choose paper and Player choose paper... Its a TIE"
                );

        }


    }
}
