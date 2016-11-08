import java.util.Random;


public class BIGRANDOM {
	public static void main(String[] args) {
		int a = 0;
		for (int i = 0; i < 999999999; i++) {
			int x = new Random().nextInt();
			if (a < x) {
				a = x;
				System.out.println(a);
			}
		}
	}
}
