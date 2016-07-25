import java.util.Scanner;
public class Interest {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("You have won the lottery and have 100 million dollars!\nYou decide to invest in Citibank, which offers a 0.001% interest per day.\nEnter the number of days you have invested in this bank and the projected account balance will be estimated.\n");
		System.out.println("Please enter the number of days of compounded interest: ");
		int days = input.nextInt();
		double amount;
		double principle = 100;
		double rate = 0.00001;
			
		for(int i=0; i <= days; i++){
			amount = principle * Math.pow(1 + rate, i);
			System.out.println("Day: " + i + "   -----   " + amount + " million dolars");
		}
		
		input.close();
	}
}
