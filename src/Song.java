import javax.swing.JOptionPane;

public class Song {

	public static void main(String[] args) {
		String drink;
		drink = JOptionPane.showInputDialog("What type of drink do you want?");
		for (int i = 99; i > 0; i-= 2) {
			if(i-2 == - 1) {
				i = 2;
			}
			System.out.println(i + " bottles of " + drink + " on the wall.");
			System.out.println(i + " bottles of " + drink + ".");
			System.out.println("Take one down, pass it around.");
			System.out.println((i-2) + " bottles of " + drink + " on the wall.");
			System.out.println();
		}
	}

}
