package practicle.pkg4;
import java.util.ArrayList; 
import java.util.Scanner;
/**
 * @author Muhammed Fathah and Mohammed Al Ameen
 */
public class Practicle4 {
 
    public static void main(String[] args) {
        ArrayList <Integer> count= new ArrayList <>(); // array list of count
        
       ArrayList <String> names = new ArrayList <>(); // array list of candidate candidateName
       
       Scanner input= new Scanner(System.in); //scanner object
       
        System.out.println("Enter the candidateName for your vote");  
        System.out.println("-----------------------------");
       
       
       
       String choice = ""; //choice to be used as condition for while loop
       
       while(!choice.equals("-1" )|| choice.isEmpty()){ //continous till user chooses -1 or empty line
           
       String candidateName = input.nextLine();  //getting candidate candidateName by user input
       choice = candidateName;  //changing choice to user input
       
       if (candidateName.equals("-1") || candidateName.isEmpty())  //checking if user wants to stop
           break;
       
       else if(!(names.contains(candidateName))){ //runs if name does not exists is arraylist 
           names.add(candidateName);              //adds name to names Array List
           count.add(1);                          // add a value 1 to count array list
     
           
       }
       
       
       else if(names.contains(candidateName)){ //runs if name exists in array List
           
           int index = names.indexOf(candidateName); //gets the index of candidate in list
           int currentValue = count.get(index);      //gets value in count for index of name
           count.set(index,currentValue+1);          //increases the count by one
          
           
       }
       
    
       }
       
       
        //for loop to print the amount of votes each candidate got 
          System.out.println("-----------------------------");
        for (int i=0; i<names.size();i++){
            
            System.out.println(names.get(i) + " recieved "+ count.get(i) + " votes" );
            
        }
          System.out.println("-----------------------------");
       
        
        //for loop to display the candidate who is the winner
        int max = 0;
        for (int i=0; i<names.size();i++){
            
            if (max<count.get(i)){
                max = count.get(i);
            }
        }
        
        int winnerIndex = count.indexOf(max); //get the index of candidate with max votes
        System.out.println(names.get(winnerIndex)+" won with " + max + " votes!");
        
    }
    
}
