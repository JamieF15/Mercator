import java.util.List;

public class PriceCalculator {
	private static final int APPLE_PRICE = 60;   // price in pence
	private static final int ORANGE_PRICE = 25;  // price in pence

	double checkoutItems(List<String> items) {
		int amountOfApples = 0;
		int amountOfOranges = 0;

		for (String item : items) {
			switch (item.toUpperCase()) {
				case "APPLE" -> amountOfApples++;
				case "ORANGE" -> amountOfOranges++;
			}
		}

		// Calculate chargeable apples for buy 1, get 1 free
		int chargeableApples = (amountOfApples / 2) + (amountOfApples % 2);
		int appleTotal = chargeableApples * APPLE_PRICE;

		// Calculate chargeable oranges for 3 for 2
		int chargeableOranges = (amountOfOranges / 3) * 2 + (amountOfOranges % 3);
		int orangeTotal = chargeableOranges * ORANGE_PRICE;

		int totalPence = appleTotal + orangeTotal;

		return totalPence / 100.0;
	}
}
