import java.io.IOException;

public class RocketShip {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		int Countdown = 10;
		
		for (int i = Countdown; i > -1; i--) {
			
			Runtime.getRuntime().exec("say " + i).waitFor();
			System.out.println(i);
			
			if(i == 0) {
				Runtime.getRuntime().exec("say " + "GOGOGOGOGOGOGOGOGOGO BLASTOFF").waitFor();			
			}				
		}
	}
}
