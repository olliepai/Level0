import javax.swing.JOptionPane;

public class TheRiddler {


	public static void main(String[] args) {


		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("Two chemists go into a bar. The first one says: I think I'll have an H2O. The second one says: I think I'll have an H2O too. What happened to the second man?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.equals("He died") || riddle.equals("he died") || riddle.equals("he died.") || riddle.equals("He died.")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score = 1;
			JOptionPane.showMessageDialog(null, "Your score so far is: " + score + ". Two more riddles to go.");
			
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "WRONG!!! \n He died.");
			JOptionPane.showMessageDialog(null, "Your score so far is: " + score + ". Two more riddles to go.");
		}

		// 6. Add some more riddles
		

		// 2. Make a pop up to show the score.
		
	}
}