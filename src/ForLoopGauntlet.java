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
		
		/* for (int i = 0; i < 3; i++) {
			for (int i2 = 0; i2 < 3; i2++) {
				System.out.println(i + " " + i2);
			}
		} */
		/* for (int j = 1; j < 9; j+= 3) {
			System.out.println(j + " " + (j + 1)+ " " + (j + 2) );
		} */
		for (int j = 1; j < 100; j += 9) {
			System.out.println(j + " " + (j + 1) + " " + (j + 2) + " " + (j + 3) + " " + (j + 4) + " " + (j + 5) + " " + (j + 6) + " " + (j + 7) + " " + (j + 8) + " " + (j + 9)); 
		}
			
	}

}
