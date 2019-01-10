package main;

public class GameEntry{
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    //getter methods the method which can access the private members alt+Ins
    //setter methods the method that can modify and return the private members

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return "(" + name + "," + score + ")";
    }
}
class Scoreboard{
    private int numEntries=0;
    private GameEntry[] board;
    public Scoreboard(int capacity){
        board=new GameEntry[capacity];
    }
    public void add(GameEntry e)
    {
        int newScore= GameEntry.score;
        if (numEntries<board.length || newScore>board[numEntries-1].score){
            if(numEntries<board.length)
            {
                numEntries++;
            }
            int j=numEntries-1;
            while(j>0 && )
        }

        //attempts to add a new score to the board(if it is high enough)
    }
    public void remove(int i)
    {
        //for removing purpose
    }

}
class Main{
    public static void main(String[] args) {
        Scoreboard scoreboard=new Scoreboard(5);//ctrl+p
        GameEntry gameEntry=new GameEntry("Mike",720);
        scoreboard.add(gameEntry);

    }
}