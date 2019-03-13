//Dennis Lin
//109426873
//dennis.lin@stonybrook.edu
//HOMEWORK 1
//CSE 214
//Vladimir Yevseenko 

package teammanager;

import java.io.PrintStream;
import java.util.Scanner;


public class TeamManager {
    public static final int MAX_TEAMS = 5;
    
    public static void main(String[] args) {
        Team TLO = new Team();
        System.out.println("Welcome to TeamManager!\n"); 
        System.out.println("Please select an Option:");
        System.out.println("A) Add Player");
        System.out.println("G) Get Player stats");
        System.out.println("L) Get leader in a stat.");
        System.out.println("R) Remove a player.");
        System.out.println("P) Print all players.");
        System.out.println("S) Size of team.");
        System.out.println("T) Select team ");
        System.out.println("C) Clone team");
        System.out.println("E) Team equals");
        System.out.println("U) Update stat.");
        System.out.println("Q) Quit\n");
        
        String selection;
        PrintStream out = System.out;
        Scanner in = new Scanner(System.in);
        do{
            out.print("Select a Menu Option: ");
            selection = in.nextLine();
            if (selection.toUpperCase().equals("A")){
                out.println("Enter the player's name: ");
                    String playerName = in.nextLine();
                out.println("Enter the number of hits: ");
                    int hits = in.nextInt();
                        in.nextLine();
                out.println("Enter the number of errors: "); 
                    int errors = in.nextInt();
                        in.nextLine();
                out.println("Enter the position: ");
                    int position = in.nextInt();    
                        in.nextLine();
                Player P = new Player(playerName, hits, errors, position);
                
                try{
                    TLO.addPlayer(P, position);
                }catch (FullTeamException e){
                    System.out.println("Unable to add");
                }
                
                System.out.println("Player added: " + playerName +" - " + hits + " hits, " + errors + " errors\n");
            }
            if (selection.toUpperCase().equals("G")){
                out.println("Enter the position");
                    int position = in.nextInt();
                        in.nextLine();
                    TLO.getPlayer(position).printPlayer();
            }
            if (selection.toUpperCase().equals("L")){
                out.println("Enter the stat: ");

                    
            }
                
            if (selection.toUpperCase().equals("R")){
                out.println("Enter the position:");
                     int position = in.nextInt();
                     in.nextLine();
                    
                     try{
                         TLO.removePlayer(position);
                     }catch(IllegalArgumentException e){
                         out.println("Unable to remove");
                     }
                         
            }
            if (selection.toUpperCase().equals("P")){
                out.println("Player#     Name           Hits           Errors");
                out.println("---------------------------------------------------");
                TLO.printAllPlayers();
            }
            if (selection.toUpperCase().equals("S")){
                out.println("There are "+TLO.size()+ " players(s) in the current Team.\n");
            }         
        }while(!selection.toUpperCase().equals("Q"));
                out.println("Program terminating normally...");

    }
}