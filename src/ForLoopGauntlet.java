import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		/*for (int i = 0; i <= 100; i++) {
			JOptionPane.showMessageDialog(null, i);
		}*/
		
		/*for (int i = 100; i >= 0; i--) {
			JOptionPane.showMessageDialog(null, i);
		}*/
		
		/*for (int i = 2; i <= 100; i ++) {
			JOptionPane.showMessageDialog(null, i++);
		}*/
		
		/*for (int i = 1; i <= 99; i++) {
			JOptionPane.showMessageDialog(null, i++);
		}*/
		
		/*for (int i = 1; i <= 500; i++) {
			if(i % 2 == 0) {
				JOptionPane.showMessageDialog(null, i + " even");
			}
			if(i % 2 == 1) {
				JOptionPane.showMessageDialog(null, i + " odd");
			}
		}*/
		
		/*for (int i = 7; i <= 77; i += 7) {
			JOptionPane.showMessageDialog(null, i);			
		}*/
		
		/*int Age = 0;
				
		for (int i = 2003; i <= 2016; i++) {
			Age += 1;
			JOptionPane.showMessageDialog(null, "In " + i + ", I was " + Age + " years old." );
		}*/
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			for (i = 0; i < 3; i++) {
				System.out.println(i);
			}
		}
	}

}
