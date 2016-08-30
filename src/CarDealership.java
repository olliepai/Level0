import javax.swing.JOptionPane;

public class CarDealership {
	public static void main(String[] args) {
		String Make = JOptionPane.showInputDialog("What make of car do you want? (Porsche, Ford, or Audi)");
		String Model = JOptionPane.showInputDialog("What model car do you want?");
		String Color = JOptionPane.showInputDialog("What color car do you want");
		String Year = JOptionPane.showInputDialog("What year is the car's model");
		String PorschePrice = "120,000";
		String FordPrice = "15,000";
		String AudiPrice = "30,000";		
		int YearN = Integer.parseInt(Year);
		if(Make.equals("Porsche")) {
			if(YearN > 2005) {
				PorschePrice = "130,000";
			}
			JOptionPane.showMessageDialog(null, "Your " + Year + " " + Color + " " + Make + " " + Model + " will cost " + PorschePrice);
		}
		if(Make.equals("Ford")) {
			if(YearN > 2005) {
				FordPrice = "25,000";
			}
			JOptionPane.showMessageDialog(null, "Your " + Year + " " + Color + " " + Make + " " + Model + " will cost " + FordPrice);
		}
		if(Make.equals("Audi")) {
			if(YearN > 2005) {
				AudiPrice = "50,000";
			}
			JOptionPane.showMessageDialog(null, "Your " + Year + " " + Color + " " + Make + " " + Model + " will cost " + AudiPrice);
		}
	}
}
