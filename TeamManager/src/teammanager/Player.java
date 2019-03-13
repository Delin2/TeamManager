//Dennis Lin
//109426873
//dennis.lin@stonybrook.edu
//HOMEWORK 1
//CSE 214
//Vladimir Yevseenko

package teammanager;

public class Player{
    //obj variables
    private String playerName;
    private int hits;
    private int errors;
    private int position;
    
    
    //constructor Method
    public Player(String name, int h, int e, int pos){
        playerName = name;
        hits = h;
        errors = e;
        position = pos;
    }

    /**
     * Gets the Player's Name
     * @return Player's name
     */
    public String getName() {
        return playerName;
    }
    
    /**
     * Gets the Player's Hits
     * @return Player's hits
     */
    public int getHits(){
        return hits;
    }
    
    /**
     * Gets the Player's Errors
     * @return Player's errors
     */
    public int getErrors(){
        return errors;
    }
    
    /**
     * Gets the Player's position
     * @return player's position
     */
    public int getPosition(){
        return position;
    }
    
    /**
     * Prints the player with hits and errors
     */
    public void printPlayer(){
            System.out.println(this);
    }
    
    /**
     * String representation of player object with name hits and errors
     * @return The String representation of this player object
     */
    @Override
    public String toString(){
        return playerName+ " - " +hits+" hits, " +errors+ " errors\n";
    }
}