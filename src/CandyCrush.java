import javax.swing.JOptionPane;

public class CandyCrush {

		public static void main(String[] args) {
			
			
			String Name = JOptionPane.showInputDialog("Who do you not like?");
				
			// 2. Change the next line so that the pop-up will tell them they have a crush on that person
			JOptionPane.showMessageDialog(null, "You totally have a crush on " + Name);
			
			String Friend = JOptionPane.showInputDialog("Who is your best friend?");

			JOptionPane.showMessageDialog(null, Friend + " is sweet as candy.");

		} 
	}

