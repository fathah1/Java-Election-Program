package practicle.pkg4;
import java.util.ArrayList; 
import java.util.Scanner;
/**
 * @author Muhammed Fathah And Mohammed Al Ameen
 */
public class Practicle4 {
     public static void vote (ArrayList <Integer> count, ArrayList <String> names)
    {
        
     String choice = "";                                  //choice to be used as condition for while loop
     Scanner input= new Scanner(System.in);              //scanner object  
     
     
       while(!choice.equals("-1" )|| choice.isEmpty()){ //continous till user chooses -1 or empty line
           
        String candidateName = input.nextLine();  //getting candidate candidateName by user input
        choice = candidateName;  //changing choice to user input
       
        if (candidateName.equals("-1") || candidateName.isEmpty())  //checking if user wants to stop
            break;
       
       else if(!(names.contains(candidateName)))   //runs if name does not exists in arraylist 
       {    names.add(candidateName);              //adds name to names Array List                              
            count.add(1);                          // add a value 1 to count array list
     
       }
       
       
       else if(names.contains(candidateName)){       //runs if name exists in array List
           
           int index = names.indexOf(candidateName); //gets the index of candidate in list
           int currentValue = count.get(index);      //gets value of count of that candidate
           count.set(index,currentValue+1);          //increases the count by one
          
           
       }
       
    
       }
       
    }
     public static int winner (ArrayList <Integer> count, ArrayList <String> names)
     {
      
       
        
        //for loop to display the candidate who is the winner
        int max = 0; 
        for (int i=0; i<names.size();i++){
            
            if (max<count.get(i)){ //comapres max value with the counts of other candidates
                max = count.get(i); //then that value of count is reassigned to the variable 
            }
        }
      return max;     
     }
 
    public static void main(String[] args) {
        ArrayList <Integer> count= new ArrayList <>(); // array list of count
        
       ArrayList <String> names = new ArrayList <>(); // array list of candidate candidateName
       
      
        System.out.println("\t---------------------------------------- ");
        System.out.println("\tEnter the Candidate's Name for your vote");  
        System.out.println("\t----------------------------------------");
        System.out.println("type -1 or press enter to end the voting. \n");
       
       
       vote(count,names);
       //for loop to print the amount of votes each candidate got 
          System.out.println("\t-----------------------------");
        for (int i=0; i<names.size();i++){
            
            System.out.println("\t    "+names.get(i) + " recieved "+ count.get(i) + " votes" );
            
        }
          System.out.println("\t-----------------------------");
       
        
        int winnerIndex = count.indexOf(winner(count,names)); //get the index of candidate with max votes
        System.out.println("\n \t"+names.get(winnerIndex)+" won with " + winner(count,names) + " votes!");
        
    }
    
}
