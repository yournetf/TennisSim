import java.util.Random;

public class Game {
    //Creates variables for point scored in each game, the performance rating for each player and their names.


    int pointsForPlayerOne = 0;
    int pointsForPlayerTwo = 0;

    double rating1;
    double rating2;

    String name1;
    String name2;


    Game(TennisPlayer one, TennisPlayer two){

        //Creates a game with two players. Initializes their names and creates a total rating based off of the combined values of their break and hold percentages.
        this.name1 = one.getName();
        this.name2 = two.getName();

        this.rating1 = (one.getHoldPercentage()  ) + (one.getBreakPercentage() );
        this.rating2 = (two.getHoldPercentage() )+ (two.getBreakPercentage() );

    }




    public void printPlayerPerformance(){

        System.out.print(name1 + ": ");
        System.out.println(this.rating1 + " Rating");
        System.out.print(name2 + ": ");
        System.out.println(this.rating2 + " Rating");

    }


    public void playGame(){

        while( !((pointsForPlayerOne>=4 || pointsForPlayerTwo >=4) && ((Math.abs(pointsForPlayerOne-pointsForPlayerTwo))>= 2) ) ) {

            Random rand1 = new Random();
            Random rand2 = new Random();
            double variance1 = rand1.nextDouble();
            double variance2 = rand2.nextDouble();


            double  inGamePerformance1 = rating1 / (rating1 + rating2);
            double  inGamePerformance2 = rating1 / (rating1 + rating2);



            if((variance1)<inGamePerformance1) {
                System.out.println("------------------");
                System.out.println();
                System.out.println(name1 + " scores!");
                pointsForPlayerOne++;
            }
            else{
                System.out.println("------------------");
                System.out.println();
                System.out.println(name2 + " scores!");
                pointsForPlayerTwo++;
            }


            System.out.println("Score is now " +pointsForPlayerOne + "-" + pointsForPlayerTwo);
            System.out.println();


        }

        if(pointsForPlayerOne > pointsForPlayerTwo){
            System.out.println("------------------");
            System.out.println(name1 + " Wins!");
            System.out.println();
            System.out.println();
            System.out.println();
        }

        else{
            System.out.println("------------------");
            System.out.println(name2 + " Wins!");
            System.out.println();
            System.out.println();
            System.out.println();
        }

    }

    public String getWinner(){
        if (pointsForPlayerOne > pointsForPlayerTwo){
            return name1;
        }

        else {
            return name2;
        }
    }

    public int getPointsForPlayerOne(){
        return pointsForPlayerOne;
    }

    public int getPointsForPlayerTwo(){
        return pointsForPlayerTwo;
    }




}
