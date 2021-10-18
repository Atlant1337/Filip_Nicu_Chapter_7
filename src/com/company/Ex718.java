package com.company;
import java.util.Random;

public class Ex718 {
    private Random randomNumbers=new Random();
    private enum Status{Continue, Won, Lost};
    int[] GamesWon;
    int[] GamesLost;
    int winTotal;
    int loseTotal;

    public void play(){
        int totalOfDice=0;
        int myPoint=0;
        Status gameStatus;
        int roll;
        GamesWon=new int[22];
        GamesLost=new int[22];
        for(int x=1; x<=1000000; x++){
            totalOfDice=rollDice();
            roll=1;
            switch(totalOfDice){
                case 7:
                case 11:
                    gameStatus=Status.Won;
                    break;
                case 3:
                case 2:
                case 12:
                    gameStatus=Status.Lost;
                    break;
                default:
                    gameStatus=Status.Continue;
                    myPoint=totalOfDice;
                    break;
            }
            while(gameStatus==Status.Continue){
                totalOfDice=rollDice();
                roll++;
                if(totalOfDice==myPoint)
                    gameStatus=Status.Won;
                else if(totalOfDice==7)
                    gameStatus=Status.Lost;
            }
            if(roll>21)
                roll=21;
            if(gameStatus==Status.Won){
                GamesWon[roll]++;
                winTotal++;
            }
            else{
                GamesLost[roll]++;
                loseTotal++;
            }
        }
        winlose();
    }
    public void winlose(){
        int totalGames=winTotal+loseTotal;
        int RollsToWin;
        for(int i=1; i<=21; i++){
            if(i==21)
                System.out.printf("\n%d WINS | %d LOSSES --> ROLLS > 20th roll", GamesWon[21],GamesLost[21] );
            else
            if(i<=21)
                System.out.printf("\n%d WINS | %d LOSSES --> ROLL %d", GamesWon[i], GamesLost[i], i);

            RollsToWin=(GamesWon[i]*i);
            System.out.printf("\nTotal ROLLS to WIN: "+RollsToWin);
        }
        System.out.printf("\n%s %d / %d = %.2f%%\n", "Chance of winning : ", winTotal, totalGames, (100.0*winTotal/totalGames));
    }
    public int rollDice(){
        int die1=1+randomNumbers.nextInt(6);
        int die2=1+randomNumbers.nextInt(6);
        int sum=die1+die2;
        return sum;
    }
    public static void main(String args[]){
        Ex718 game=new Ex718();
        game.play();
    }
}


