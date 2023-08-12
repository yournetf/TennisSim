public class TennisPlayer {

    private double breakPercentage;
    private double holdPercentage;

    private String name;

    TennisPlayer(String name ,double holdP, double breakP){
        this.breakPercentage = breakP;
        this.holdPercentage = holdP;
        this.name = name;
    }

    public double getBreakPercentage(){
        return breakPercentage;
    }

    public double getHoldPercentage(){
        return holdPercentage;
    }

    public String getName(){
        return name;
    }



}
