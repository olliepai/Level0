import javax.swing.JOptionPane;

public class RANDOMNESS {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "These are the numbers from 1 to 1,000,000,000");
		System.exit(0);
		for (int i = 1; i < 1000000000; i++) {
			JOptionPane.showMessageDialog(null, 1%2);
			JOptionPane.showMessageDialog(null, i);
		}
	}
}
