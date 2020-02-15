
import java.util.ArrayList;
import java.util.*;


public class Team {
    
    private int maxSize = 16;
    private ArrayList<Player> players = new ArrayList<Player>(maxSize);
    private String name;
    
    
    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player name) {
        if (players.size() < maxSize) {
         players.add(name);   
        }
    }
    
    public void printPlayers() {
        for (Player member: players) {
            System.out.println(member);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int goals = 0;
        
        for (Player mGoals: players) {
            goals += mGoals.goals();  
        }
        
        return goals;
    }
}

