
public class Fibonacci {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		for (int i = 1; i <= 12; i++) { 
			int z = 1;
			z += 1;
			System.out.println(i + x+ y + z);
			//0 1 1 2 3 5 8 13
		}
	}
}
