//Försök på att skapa highscore board. Måste anpassas till Astroban och implementeras.

import java.util.ArrayList;
import java.util.Collections;

public class Players {

    private ArrayList<Player> data = new ArrayList<Player>();

    public boolean add(Player p){
        // add a new player ensuring that the name does
        //not exist in the data list
        Boolean found = false;
        for(Player pl : data) {
            if(pl!=null && p.getName().toLowerCase().equals(pl.getName().toLowerCase())) {
                found = true;
            }
        }
        return found ? false : data.add(p);
    }

    public boolean upDateScore(String n, int sc){
        // update the number of goals scored by player named n by sc
        Boolean status = false;
        for(Player p : data) {
            if(p!=null && n.toLowerCase().equals(p.getName().toLowerCase())) {
                p.setScore(sc);
                return true;
            }
        }
        return status;
    }
    public ArrayList<String> getTeam(String t){
        //return a list of the names of the teams in the data list
        ArrayList<String> list = new ArrayList<String>();

        for (Player p : data){
            if (t.toLowerCase().equals(p.getTeam().toLowerCase())) {
                list.add(p.getName());
            }
        }

        return list;
    }

    public Player getPlayer(String n){
        // retrieve a players details given the name n
        Player find = null;
        for (Player p : data) {
            if (n.toLowerCase().equals(p.getName().toLowerCase())){
                find = p;
            }
        }
        return find;
    }

    public int getNumPlayers(){
        // return the number of players in the data list
        return data.size();
    }

    public int totalMoves(){
        // calculate the total number of goals scored
        int totalMoves = 0;
        for(Player p: data){
            totalMoves += p.getScore();
        }
        return totalMoves;
    }

    public void display(){
        Collections.sort(data);
        System.out.println(data);
    }

}