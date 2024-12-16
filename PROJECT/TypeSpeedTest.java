package PROJECT;

import java.util.*;
public class TypeSpeedTest {
    
    public static void main(String[] args) {

     //  Define the sentence 
     System.out.println("");
     System.out.println("THE GIVEN SENTENCE :");
     String sentence = "The company has a long tradition of serving its customers well. A day is 24 hours long. Ross went 3-of-7, and hit two of his six attempts from long range. His long legs moved with a glider's grace, and his long arm had the looseness of a whip";

     // Display the sentence
     System.out.println(sentence);
     System.out.println("");
        System.out.println("-------------");
        System.out.println("");

     // Start timer
     long startTimer = System.currentTimeMillis();  // calculate time in millisecond

     // Create Scanner object to read user input
     Scanner sc = new Scanner(System.in);

     // Read user input 
     System.out.println("START TYPING :");
     String input = sc.nextLine();

     // End timer
     long endTimer = System.currentTimeMillis();

     // Total Time taken
     long TimeTaken = endTimer - startTimer ;
     double timeInSeconds = TimeTaken / 1000 ; // divided by 1000 cause in milisecond
     
     // Word per Minute
     double wordsTyped = input.split("\\s+").length; // it means that SPLIT = split the sentnece , "//s+" = split sentence into words and whitespaces , .LENGTH = calculate the word typed
     double wpm = wordsTyped / (timeInSeconds / 60); // timeinsecond / 1000 = convert it into minutes

     // Final Result
     System.out.println("");
        System.out.println("Total words typed are " + wordsTyped);
        System.out.println("");
     System.out.println("The time taken in seconds is " + timeInSeconds);
     System.out.println("");
     System.out.println("Your typing speed is " + wpm + " WPM");

     sc.close();
    


    }
}
