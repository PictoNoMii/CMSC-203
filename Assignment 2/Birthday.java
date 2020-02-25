import javax.swing.JOptionPane;
import java.util.Random;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;	
		String name;
		int age;
		String str;
		String toyType;	
		boolean choiceIsOK;
		char restart = 'n';
		String balloon;
		String card;
		double cost = 0;
		double totalCost = 0;
		Toy toy;
		int orderNumber;
		Random rand = new Random();
		
		System.out.println("BIRTHDAY GIFTS");
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");	
		do {
			restart = 'n';
			do {
				name = JOptionPane.showInputDialog("Enter the name of the child");
			
			
				str = JOptionPane.showInputDialog("How old is the child(0-7)?");
				age = Integer.parseInt(str);
			
			
				do {
					restart = 'n';
					
					toyType = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
					choiceIsOK = false;
				
					switch(toyType) {
					case "Book":
					case "book":
					case "Blocks":
					case "blocks":
					case "Plushie":
					case "plushie":
						choiceIsOK = true;
						break;
					default:
						JOptionPane.showMessageDialog(null, "ERROR Choose a toy: a plushie, blocks, or a book");
						choiceIsOK = false;
						break;
					}
				}while(!choiceIsOK);
			
				toy = new Toy(toyType, age);
				if(!toy.ageOK()) {
					input = JOptionPane.showInputDialog("This toy is not age appropriate for the child. Do you want to start over(y/n)?"); 
					restart = input.charAt(0);
				}
			}while (restart == 'y');
			
			balloon = JOptionPane.showInputDialog("Would you like to add a balloon(yes/no)?");
			toy.addBalloon(balloon);
			card = JOptionPane.showInputDialog("Would you like to add a card(yes/no)?");
			toy.addCard(card);
			cost= toy.getCost();
			
			System.out.println("The gift for " + name + " " + age + " years old is " + toyType + " $" + cost);
			
			totalCost += cost;
			
			input = JOptionPane.showInputDialog("Do you want to add another toy to your order(y/n)?");
			restart = input.charAt(0);
		}while(restart == 'y');
		
		orderNumber = rand.nextInt(10000);
		System.out.println("The total cost of your order is $" + totalCost + " Order number is " + orderNumber);
		System.out.println("Programmer: Noah Nesbitt");
	}
}
