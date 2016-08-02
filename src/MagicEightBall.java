// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class MagicEightBall {

	public static void main(String[] args) {
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int RandomNumber = new Random().nextInt(5);
	// 3. Print out this variable
		System.out.println(RandomNumber);
	// 4. Get the user to enter a question for the 8 ball
		String Question = JOptionPane.showInputDialog("Enter a question.");
	// 5. If the random number is 0

	// -- tell the user "Yes"
		if(RandomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}

	// 6. If the random number is 1

	// -- tell the user "No"
		if(RandomNumber == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}

	// 7. If the random number is 2
		if(RandomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		if(RandomNumber == 3) {
			JOptionPane.showMessageDialog(null, "Don't ask.");
		}
	// -- write your own answer
		
		if(RandomNumber == 4) {
			JOptionPane.showInputDialog("Ask a different question.");
			
			int RandomNumber2 = new Random().nextInt(4);
			
			System.out.println(RandomNumber);
			
			if(RandomNumber2 == 0) {
				JOptionPane.showMessageDialog(null, "Yes");
			}
			
			if(RandomNumber2 == 1) {
				JOptionPane.showMessageDialog(null, "No");
			}
			
			if(RandomNumber2 == 2) {
				JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
			}
			
			if(RandomNumber2 == 3) {
				JOptionPane.showMessageDialog(null, "Don't ask.");
			}
		}
	}
}



