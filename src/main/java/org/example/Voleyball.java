package org.example;

public class Voleyball extends Player{
    protected int numberofpoints;
    public Voleyball(String name,String teamname,int positionnumber,int numberofpoints){
        super(name,teamname,"Volleyball",positionnumber);
        this.numberofpoints=numberofpoints;
    }
}
