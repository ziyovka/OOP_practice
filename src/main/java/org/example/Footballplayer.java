package org.example;

public class Footballplayer extends Player{
    protected int redCards;
    protected int yellowCards;
    protected int goals;
    public Footballplayer(String name,String teamname, int positoinnumber,int redCards, int yellowCards, int goals){
        super(name,teamname,"Football",positoinnumber);
        this.redCards=redCards;
        this.yellowCards=yellowCards;
        this.goals=goals;
    }
}
