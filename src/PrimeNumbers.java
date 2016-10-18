import javax.swing.JOptionPane;

public class PrimeNumbers {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Give me a number");
		int NUMBER = Integer.parseInt(number);
		for (int i = 2; i < NUMBER; i++) {
			if(NUMBER%i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime.");

				System.exit(0);
				
			}
			else if(NUMBER%i != 0) { 
				JOptionPane.showMessageDialog(null, "Your number is prime");

				System.exit(0);
			}
			
		}

	}
}
