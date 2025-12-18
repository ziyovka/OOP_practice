package org.example;

public abstract class Player implements Information{
   protected String name;
    protected String teamname;
    protected String sporttype;
    protected int positionnumber;
    public Player(String name, String teamname, String sporttype,int positionnumber){
        this.name=name;
        this.teamname=teamname;
        this.sporttype=sporttype;
        this.positionnumber=positionnumber;
    }

    @Override
    public String getteamname() {
        return teamname;
    }

    @Override
    public String getinfo() {
        return name+" plays "+sporttype+" for "+teamname;
    }
}
