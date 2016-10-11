 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99) + 1;
		// 2. Print out the random variable above
		//JOptionPane.showMessageDialog(null, random);
		// 11. do the following 10 times
		String guess1B = "0";
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess a number between 1 and 100");
			for (int i = 0; i < 10; i++) {
				if(i > 0) {
					guess1B = JOptionPane.showInputDialog("Guess again");
				}
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				int guessA = (Integer.parseInt(guess));	
				int guessB = (Integer.parseInt(guess1B));
				// 5. if the guess is correct
				if (guessA == random || guessB == random) {
					JOptionPane.showMessageDialog(null, "You win");
					break;
				}
					// 6. win
				// 7. if the guess is high
				else if (guessA > random || guessB > random) {
					JOptionPane.showMessageDialog(null, "The answer is too high.");
				}
					// 8. tell them it's too high
				// 9. if the guess is low
				else if (guessA < random || guessB < random) {
					JOptionPane.showMessageDialog(null, "The answer is too low.");
				}
					// 10. tell them it's too low
				if(i == 9 && guessB != random) {
					JOptionPane.showMessageDialog(null, "You lose");
				}
			}
		// 12. tell them they lose
	}

}



