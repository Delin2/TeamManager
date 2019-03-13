//Dennis Lin
//109426873
//dennis.lin@stonybrook.edu
//HOMEWORK 1
//CSE 214
//Vladimir Yevseenko

package teammanager;

public class Team {
    private int position;
    private int size;
    private Player[] ArrP = new Player[MAX_PLAYERS];
    private Player Max_hits;
    private Player Least_errors;
    public static final int MAX_PLAYERS = 40;
    
    /**
     * Determines the number of Players currently in this Team.
     * @return The number of Players in this Team.
     */
    public int size(){
        return size;
    }
/**
 * Adds a Player to the team at the indicated position in the lineup.
 * @param P
 * @param position
 * @throws FullTeamException
 * @throws IllegalArgumentException 
 */
    public void addPlayer(Player P, int position)throws FullTeamException, IllegalArgumentException{
        
        if( position>=0 && position<=size+1 && position<=MAX_PLAYERS){
            for(int i = ArrP.length-2; i>=0; i--){
                ArrP[i+1] = ArrP[i];
            }
            ArrP[position-1] = P;
            size++;
        }else
            throw new FullTeamException();
        if(position < size)
            throw new IllegalArgumentException();
    }
    
    /**
     * Removes a Player from the team at the indicated position in the lineup.
     * @param position
     * @throws IllegalArgumentException 
     */
    public void removePlayer(int position)throws IllegalArgumentException{
        if(ArrP[position-1]!= null && position <= MAX_PLAYERS){
            for(int i = position-1; i<ArrP.length-1; i++){
                ArrP[i] = ArrP[i+1];
            }
            size--;
        }else
            throw new IllegalArgumentException();
    }
    
    /**
     * Returns a reference to a player in the lineup at the indicated position.
     * @param position
     * @return a reference to a player in the lineup at the indicated position.
     * @throws IllegalArgumentException 
     */
    public Player getPlayer(int position)throws IllegalArgumentException{
        if(ArrP[position-1] != null && position <= MAX_PLAYERS){
            return ArrP[position-1];
        }else 
            throw new IllegalArgumentException();
    }
    

    
    /**
     * Prints a neatly formatted table of each Player in the Team on its own line with its position number.
     */
    public void printAllPlayers(){
        System.out.println(this);
    }
    
    /**
     * Gets the String representation of this Team object, which is a neatly formatted table of each Player in the Team on its own line with its position number.
     * @return The String representation of this Team object.
     */
    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i <= size; i++) {
            if (ArrP[i] != null  ) {
                output += String.format("%-12d%-15s%-15d%d\n", i+1, ArrP[i].getName(), ArrP[i].getHits(), ArrP[i].getErrors());
            }
        }
        return output;
    }
}
