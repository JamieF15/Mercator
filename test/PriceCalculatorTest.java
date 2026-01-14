import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriceCalculatorTest {

	private PriceCalculator calculator;

	@BeforeEach
	void setUp() {
		calculator = new PriceCalculator();
	}

	@Test
	void testCheckoutSingleApple() {
		List<String> items = List.of("APPLE");
		double total = calculator.checkoutItems(items);
		assertEquals(0.60, total, 0.001); // 60p = 0.60
	}

	@Test
	void testCheckoutSingleOrange() {
		List<String> items = List.of("ORANGE");
		double total = calculator.checkoutItems(items);
		assertEquals(0.25, total, 0.001); // 25p = 0.25
	}

	@Test
	void testCheckoutMultipleItems() {
		List<String> items = List.of("APPLE", "ORANGE", "APPLE");
		double total = calculator.checkoutItems(items);
		assertEquals(1.45, total, 0.001); // 60 + 25 + 60 = 145p
	}

	@Test
	void testCheckoutEmptyList() {
		List<String> items = List.of();
		double total = calculator.checkoutItems(items);
		assertEquals(0.0, total, 0.001);
	}

	@Test
	void testCheckoutUnknownItem() {
		List<String> items = List.of("BANANA");
		double total = calculator.checkoutItems(items);
		assertEquals(0.0, total, 0.001);
	}
}
