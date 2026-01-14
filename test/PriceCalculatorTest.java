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
		assertEquals(0.60, total, 0.001);
	}

	@Test
	void testCheckoutTwoApples() {
		List<String> items = List.of("APPLE", "APPLE");
		double total = calculator.checkoutItems(items);
		assertEquals(0.60, total, 0.001);
	}

	@Test
	void testCheckoutThreeApples() {
		List<String> items = List.of("APPLE", "APPLE", "APPLE");
		double total = calculator.checkoutItems(items);
		assertEquals(1.20, total, 0.001);
	}

	@Test
	void testCheckoutSingleOrange() {
		List<String> items = List.of("ORANGE");
		double total = calculator.checkoutItems(items);
		assertEquals(0.25, total, 0.001);
	}

	@Test
	void testCheckoutThreeOranges() {
		List<String> items = List.of("ORANGE", "ORANGE", "ORANGE");
		double total = calculator.checkoutItems(items);
		assertEquals(0.50, total, 0.001);
	}

	@Test
	void testCheckoutFourOranges() {
		List<String> items = List.of("ORANGE", "ORANGE", "ORANGE", "ORANGE");
		double total = calculator.checkoutItems(items);
		assertEquals(0.75, total, 0.001);
	}

	@Test
	void testCheckoutMixedItems() {
		List<String> items = List.of("APPLE", "ORANGE", "APPLE", "ORANGE", "ORANGE");
		double total = calculator.checkoutItems(items);
		assertEquals(1.10, total, 0.001);
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
