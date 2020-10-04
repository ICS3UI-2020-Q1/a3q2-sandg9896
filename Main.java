import java.util.Scanner;
/**
 * Determining what animal user has chose
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // Ask user if animal has feathers
    System.out.println("Does the animal have feathers? (yes/no)");
    String featherAnswer = input.nextLine();
     if(featherAnswer.equals("yes")){
      System.out.println("Can this animal swim? (yes/no)");
     }else if(featherAnswer.equals("no")){
      System.out.println("Does the animal have legs? (yes/no)");
     }
     // ask user if animal can swim 
     String swimAnswer = input.nextLine();
     if(swimAnswer.equals("yes")){
      System.out.println("This is a duck");
     }else if(swimAnswer.equals("no")){
      System.out.println("This is a Hen");
     }
     String legAnswer = input.nextLine();
     if(legAnswer.equals("yes")){
      System.out.println("This is a Lizard");
     }else if(legAnswer.equals("no")){
      System.out.println("This is a snake");
     }
      

    
  }
}
