// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String passcode = "password";
		String name = "person";
		String mess = JOptionPane.showInputDialog("GIMME A SECRET MESSAGE!!!!!!!!!!!!!!!!!!!!!!!");
		String match = JOptionPane.showInputDialog("What is the password???????");
		if(passcode.equals(match)) {
			String username = JOptionPane.showInputDialog("Give me a username.");
			if(name.equals(username)) {
				JOptionPane.showMessageDialog(null, "YAAAYYY!!!!!!");
				JOptionPane.showMessageDialog(null, mess);
			}
			else {
				JOptionPane.showMessageDialog(null, "INTRUDER");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "INTRUDER");
		}
		
	}
	
	// 1. Set the passcode in a String variable
	
	// 2. Using a pop-up, ask for a secret message and store it in a variable

	// 3. Ask your friend for the passcode and store it in a variable

	// 4. If the passcode matches, show the secret message

	// 5. If the passcode does not match, pop-up "INTRUDER!!"

	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.

}



