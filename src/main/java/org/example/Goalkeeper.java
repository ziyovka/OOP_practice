package org.example;

public class Goalkeeper extends Footballplayer {
    private int saves;
    public Goalkeeper(String name,String teamname, int positionnumber,int redCards, int yellowCards, int goals, int saves){
        super(name,teamname,positionnumber,redCards,yellowCards,goals);
        this.saves=saves;
    }
}
