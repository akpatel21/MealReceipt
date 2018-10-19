/**
 * 
 * @author Akul Patel
 * MealReceipt
 *
 */
import java.util.Scanner;

public class MealReceipt 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tax and Tip Calculator");
		
		System.out.print("\nPlease enter the name of your appetizer: ");
		String appetizerName = keyboard.nextLine();
		System.out.print("\nPlease enter the price for the appetizer: ");
		String strAppetizerPrice = keyboard.nextLine();
		Double appetizerPrice = Double.parseDouble(strAppetizerPrice);
		System.out.print("\nPlease enter the name of your entrée: ");
		String entréeName = keyboard.nextLine();
		System.out.print("\nPlease enter the price for the entrée: ");
		String strEntréePrice = keyboard.nextLine();
		Double entréePrice = Double.parseDouble(strEntréePrice);
		System.out.print("\nPlease enter the name of your dessert: ");
		String dessertName = keyboard.nextLine();
		System.out.print("\nPlease enter the price for the dessert: ");
		String strDessertPrice = keyboard.nextLine();
		Double dessertPrice = Double.parseDouble(strDessertPrice);
		System.out.print("\nPlease enter the name of your drink: ");
		String drinkName = keyboard.nextLine();
		System.out.print("\nPlease enter the price for the drink: ");
		String strDrinkPrice = keyboard.nextLine();
		Double drinkPrice = Double.parseDouble(strDrinkPrice);
		System.out.print("\nWhat percentage would you like to tip (as decimal): ");
		String strTipPercent = keyboard.nextLine();
		Double tipPercent = Double.parseDouble(strTipPercent);
		
		System.out.println("\nItem					Price");
		System.out.println(appetizerName + "					" + appetizerPrice);
		System.out.println(entréeName + "					" + entréePrice);
		System.out.println(dessertName + "					" + dessertPrice);
		System.out.println(drinkName + "					" + drinkPrice);
		
		Double subtotal = appetizerPrice + entréePrice + dessertPrice + drinkPrice;
		System.out.println("\nSubtotal					$" + subtotal);
		Long tax = Math.round(subtotal * .06);
		System.out.println("Tax					$" + tax);
		Long tip = Math.round(subtotal * tipPercent);
		System.out.println("Tip @ " + tipPercent * 100 + "%					$" + tip);
		Double total = subtotal + tip + tax;
		System.out.print("Total					$" + total);
		
		
		
		

	}

}
