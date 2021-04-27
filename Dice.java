/*
* The logging program determines how many logs a truck can carry if a log
* weighs 20kg/m and is either 0.25m, 0.5m or 1m and the truck can carry 1100kg.
*
* @author  Cameron Teed
* @version 1.0
* @since   2020-04-22
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
  * The logging program determines how many logs a truck can carry if a log
  * weighs 20kg/m and is either 0.25m, 0.5m or 1m and the truck can carry
  * 1100kg.
  * @param args
  */

  public static void main(final String[] args) {

    // creates scanner
    Scanner myObj = new Scanner(System.in);
    // ask for user input
    System.out.println("Please enter the range of your dice (1-?):");

    int counter = 0;

    // checks if input is a float
    try {
      // Stores float in length
      int uperbound = myObj.nextInt();

      // Checks if you inputed the correct length
      if (uperbound > 1) {
          // Outputs how many logs the truck can carry
          int randomint = (int) (Math.random() * (uperbound - 1 + 1) + 1);

          while (true) {
            System.out.println();
            System.out.println("Please enter your guess for what number the"
            + " dice landed on:");

            int userguess = myObj.nextInt();

            counter = counter + 1;

            if (userguess == randomint) {

              System.out.println();
              System.out.println("You guessed the number!");
              System.out.println("It was " + randomint + "!");
              System.out.println("You took you " + counter + " tries(s)!");
              System.out.println();
              System.out.println("Done");

              break;
            } else {
              System.out.println();
              System.out.println("Guess again!");
            }
          }

    } else {
      // Outputs that the correct number needs to be inputed
      System.out.println();
      System.out.println("Please enter a number greater than 1");
      }

    } catch (Exception e) {
      // Runs if anything other than an intiger is inputted
      System.out.println();
      System.out.println("Invalid input. Please try again");
    }
  }
}
