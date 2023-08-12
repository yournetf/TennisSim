import javax.security.auth.PrivateCredentialPermission;
import javax.swing.*;
import java.sql.Array;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Please enter the first contestant: ");
        double contestant1HoldP = Double.parseDouble(JOptionPane.showInputDialog("Now enter the \' Hold percentage \'"));
        double contestant1BreakP = Double.parseDouble(JOptionPane.showInputDialog("Now enter the \' Break percentage \'"));

        String input2 = JOptionPane.showInputDialog("Please enter the second contestant: ");
        double contestant2HoldP = Double.parseDouble(JOptionPane.showInputDialog("Now enter the \' Hold percentage \'"));
        double contestant2BreakP = Double.parseDouble(JOptionPane.showInputDialog("Now enter the \' Break percentage \'"));

        TennisPlayer contestant1 = new TennisPlayer(input1, contestant1HoldP, contestant1BreakP);
        TennisPlayer contestant2= new TennisPlayer(input2,contestant2HoldP, contestant2BreakP);





        Game[] Games = new Game[10000];

        int playerOneTotalGameWins = 0;
        int playerTwoTotalGameWins = 0;


        int playerOneCurrentGameWins = 0;
        int playerTwoCurrentGameWins = 0;


        int playerOneSetWins = 0;
        int playerTwoSetWins = 0;

        for (int i=0; i< Games.length;i++){
            Games[i] = new Game(contestant1, contestant2);
            Games[i].playGame();

            if (Games[i].getWinner() == Games[i].name1){
                playerOneTotalGameWins++;
                playerOneCurrentGameWins++;
                if(  (playerOneCurrentGameWins >=6)   &&   ( (playerOneCurrentGameWins - playerTwoCurrentGameWins) >=2 ))   {
                    playerOneCurrentGameWins = 0;
                    playerTwoCurrentGameWins = 0;
                    playerOneSetWins++;
                }
            }

            else {
                playerTwoTotalGameWins++;
                playerTwoCurrentGameWins++;
                if(  (playerTwoCurrentGameWins >=6)   &&   ( (playerTwoCurrentGameWins - playerOneCurrentGameWins) >=2 ))   {
                    playerOneCurrentGameWins = 0;
                    playerTwoCurrentGameWins = 0;
                    playerTwoSetWins++;
                }

            }

        }

        System.out.println(Games[1].name1 + " has " + playerOneTotalGameWins + " wins" );
        System.out.println(Games[1].name1 + " has " + playerOneSetWins + " sets" );
        System.out.println(Games[1].name2 + " has " + playerTwoTotalGameWins + " wins" );
        System.out.println(Games[1].name2 + " has " + playerTwoSetWins + " sets" );







    }
}










