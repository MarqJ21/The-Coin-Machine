import java.util.Scanner;

//The Coin Machine
//Marques Johnson

public class TheCoinMachine {
	//Constants for the amount that each coin is worth
	public static final int QUARTER = 25;
	public static final int DIME = 10;
	public static final int NICKLE = 5;
	public static final int PENNIE = 1;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		//Prompt the user on the limits that they can enter and what the app is programmed to do
		System.out.println("Enter a number between 0 and 99 to find the easiest way of turning your number into \n the correct amount of quarters, dimes, nickles and pennies");
		int userNumber = keyboard.nextInt();
		
		//Declares variables to hold the amount of each coin that is needed
		int qAmount = 0;
		int dAmount = 0;
		int nAmount = 0;
		int pAmount = 0;
		
		//Declares a remainder variable that will sereve as a temporary value and continue to be changed throughout the program
		int remainder = 0;
		
		
		qAmount = userNumber / QUARTER; //Divides the user input by the coin value
		remainder = userNumber % QUARTER; //MODS and redeclares the 'remainder' variable to be the remainder of the change
		
		dAmount = remainder / DIME;
		remainder = remainder % DIME;
		
		nAmount = remainder / NICKLE;
		remainder = remainder % NICKLE;
			
		pAmount = remainder / PENNIE;
		
		
		System.out.println("The coins required to make " + userNumber + " cents is:  \n" +   "Quarters: " + qAmount + "\n" + "Dimes: " + dAmount + "\n" + "Nickles: " + nAmount + "\n" + "Pennies: " + pAmount);
		
				
	}

}
