import java.util.Scanner;

public class ScannerAdventure {
public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("You are trapped in a room. Do you want to go through the door(1), the window(2), or the trap door on the roof(3)?");
		String answer1 = kb.nextLine();
		if(answer1.equals("1") ) {
			System.out.println("Ok. Now you are in a garage. The door you came through has disappeared. There is a car(1), a plane(2), and a boat(3). Which one do you want to use to escape?");
			String answer1a = kb.nextLine();
			if(answer1a.equals("1")) {
				System.out.println("Oh no. The car crashed somwhere in the forest. Would you like to venture into the forest(1), go back to the house(2), or stay in the car(3)?");
				String answer1aa = kb.nextLine();
				if(answer1aa.equals("1")) {
					System.out.println("Uh oh. A lion in the forest ate you. You die. :(");
				}
				else if(answer1aa.equals("2")) {
					System.out.println("Uh oh. You got lost on your way back to the house. You starve. You die. :(");
				}
				else if(answer1aa.equals("3")) {
					System.out.println("Uh oh. You stay in the car a fall asleep. You never wake up again. You die. :(");
				}
				else {
					System.out.println("YOU LOSE");
				}
			}
			else if(answer1a.equals("2")) {
				System.out.println("Oh no. The plane crashed. You die. :(");
			}
			else if(answer1a.equals("3")) {
				System.out.println("Oh no. The boat crashed. You die. :(");
			}
			else {
				System.out.println("YOU LOSE");
			}
		}
		else if(answer1.equals("2")) {
			System.out.println("Ok. Now you are in the front yard. The room you came out of has dissappeared. There is a fence surounding the field. To escape, you must get pass the fence. Would you jump the fence(1), dig a hole under the fence(2), or kick the fence down(3)?");
			String answer2a = kb.nextLine();
			if(answer2a.equals("1")){
				System.out.println("When you tried to jump the fence, you tripped and fell on one of the spikes. The spike stabbed you in the stomach. You die. :(");
			}
			else if(answer2a.equals("2")){
				System.out.println("When you started digging a hole in the fence, you found a mound of fire ants. The ate you skin off. You die. :(");
			}
			else if(answer2a.equals("3")){
				System.out.println("When you tried to kick the fence down, you stuck your foot one of the spikes in the fence. The hole in your foot got infected. You die. :(");
			}
			else {
				System.out.println("YOU LOSE");
			}
		}
		else if(answer1.equals("3")) {
			System.out.println("Ok. Now you are on the top of the building. The trap door behind you has disappeared. You walk towards the edge of the roof and trip. You fall off the building and onto a tree stump. The tree stump is sharp so when you fall on it, it stabs you through the stomach. You die. :(");
		}
		else {
			System.out.println("YOU LOSE");
		}
	}
}

