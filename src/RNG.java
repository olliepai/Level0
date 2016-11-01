import java.util.Random;

import javax.swing.JOptionPane;

public class RNG {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			int y = new Random().nextInt(100);
			System.out.println(y);
		}
	}
}
