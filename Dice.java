/*
* The dice program lets you create paramaters for a dice then
* makes you guess the number
*
* @author  Cameron Teed
* @version 1.0
* @since   2020-04-27
* Class Dice.
*/

import java.util.Scanner; // import scanner

final class Dice {

   private Dice() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

  /**
  * The dice program lets you create paramaters for a dice then
  * makes you guess the number.
  *
  * @param args
  */

  public static void main(final String[] args) {

    // creates scanner
    Scanner myObj = new Scanner(System.in);
    // ask for user input
    System.out.println("Please enter the range of your dice (1-?):");

    // Creates
    int counter = 0;

    // Begins try statment
    try {
      // Stores the input as an int
      int uperbound = myObj.nextInt();

      // Checks if you inputed the dice sides
      if (uperbound > 1) {
          // Creates a random number
          int randomint = (int) (Math.random() * (uperbound - 1 + 1) + 1);

          // infinit loop
          while (true) {
            // Asks user to input guess
            System.out.println();
            System.out.println("Please enter your guess for what number the"
            + " dice landed on:");

            // Gets users guess
            int userguess = myObj.nextInt();

            // Counts how many tries it took
            counter = counter + 1;

            // Checks if you guessed the correct number
            if (userguess == randomint) {

              // Prints out that you got the number and the tries
              System.out.println();
              System.out.println("You guessed the number!");
              System.out.println("It was " + randomint + "!");
              System.out.println("You took you " + counter + " tries(s)!");
              System.out.println();
              System.out.println("Done");

              // Exits loop
              break;

            // Runs if you guess the wrong number
            } else {
              // Prints that you need to gues again
              System.out.println();
              System.out.println("Guess again!");
            }
          }

    // Runs if number less than 1 was inputted
    } else {
      // Outputs that the correct number needs to be inputed
      System.out.println();
      System.out.println("Please enter a number greater than 1");
      }

    // Catches errors
    } catch (Exception e) {
      // Runs if anything other than an intiger is inputted
      System.out.println();
      System.out.println("Invalid input. Please try again");
    }
  }
}
