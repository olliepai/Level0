import javax.swing.JOptionPane;

public class SpudCounter {
	public static void main(String[] args) {
		String Potato = JOptionPane.showInputDialog("How many potatoes do you want?");
		int Pot = Integer.parseInt(Potato);
		JOptionPane.showMessageDialog(null, "One potato");
		for (int i = 0; i < Pot ; i++) {
			JOptionPane.showMessageDialog(null, i + "potatoes");
		}
	}
}
