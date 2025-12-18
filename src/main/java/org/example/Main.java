package org.example;

public class Main {
    public static void main(String[] args){
Information player=new Goalkeeper("John","Real Madrid",1,4,2,1,15);
Information player2=new Setter("Ziyo","Balselona",4,2,6);
        System.out.println(player.getinfo());
        System.out.println(player.getteamname());
        System.out.println(player2.getinfo());
        System.out.println(player2.getteamname());
   }
}
