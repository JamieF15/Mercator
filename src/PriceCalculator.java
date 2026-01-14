import java.util.List;
import java.util.Map;

public class PriceCalculator {

	Map<String, Integer> prices = Map.of(
			"APPLE", 60,
			"ORANGE", 25
	);

	//checkAppleIsFree
	//checkOrangeIsFree

	double checkoutItems(List<String> itemList) {
		double totalPence = 0;
		for (String item : itemList) {
			Integer price = prices.get(item.toUpperCase());
			if (price != null) {
				totalPence += price;
			}
		}
		return totalPence / 100.0;
	}
}
