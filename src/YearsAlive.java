import javax.swing.JOptionPane;

public class YearsAlive {
		public static void main(String[] args) {			
			String age = JOptionPane.showInputDialog("How old are you?");			
			int age2 = Integer.parseInt(age);
			int year = 2016 - age2;
			if (age2 > 30) {
				JOptionPane.showMessageDialog(null, "You're too old!");
				System.exit(0);
			}
			if (age2 < 12) {
				JOptionPane.showMessageDialog(null, "You're too young!");
			}			
			for (int i = year; i <= 2016; i++) {				
				JOptionPane.showMessageDialog(null, i);
		}	
	}
}
