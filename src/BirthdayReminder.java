 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;


public class BirthdayReminder {


	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String Bernie = "September 8th";
		String Ted = "December 22nd";
		String Mike = "June 7th";


		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog("Who's birthday do you want to know? (Bernie Sanders, Ted Cruz, or Mike Pence)");
		
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, answer);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if (answer.equals("Bernie Sanders")) {
			JOptionPane.showMessageDialog(null, Bernie);
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (answer.equals("Ted Cruz")) {
			JOptionPane.showMessageDialog(null, Ted);
		}
		
		// 6. if user asked for your name
			// print myBirthday
		else if (answer.equals("Mike Pence")) {
			JOptionPane.showMessageDialog(null, Mike);
		}
		
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}

	} 
}
