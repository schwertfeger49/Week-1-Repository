
public class App {

	private static String fullName1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice1 = 4.99;
		double itemPrice2 = 14.99;
		double amountOfMoneyInWallet1 = 20.00;
		double amountOfMoneyInWallet2 = 40.00;
		int numberOfFriends1 = 3;
		int numberOfFriends2 = 5;
		int ageInYears1 = 31;
		int ageInYears2 = 65;
		String firstName1 = "Brady";
		String firstName2 ="Marcia";
		String lastName1 = "Schwertfeger";
		String lastName2 = "Desy";
		char middleInitial1 = 'C';
		char middleInitial2 = 'J';
		int totalFriends1 = ageInYears1 * numberOfFriends1;
		int totalFriends2 = ageInYears2 * numberOfFriends2;
		double newAmountOfMoney1 = amountOfMoneyInWallet1 - itemPrice1;
		double newAmountOfMoney2 = amountOfMoneyInWallet2 - itemPrice2;
		String fullName1 = firstName1 + " " + middleInitial1 + " " + lastName1;
		String fullName2 = firstName2 + " " + middleInitial2 + " " + lastName2;
		System.out.println("My name is " + fullName1 + " and I have $" + newAmountOfMoney1 + " in my wallet after buying something for $" + itemPrice1 + ".");
		System.out.println("Also, I am " + ageInYears1 + " years old and have " + totalFriends1 + " friends.");
		System.out.println("My name is " + fullName2 + " and I have $" + newAmountOfMoney2 + " in my wallet after buying something for $" + itemPrice2 + ".");
		System.out.println("Also, I am " + ageInYears2 + " years old and have " + totalFriends2 + " friends.");
	}

}
