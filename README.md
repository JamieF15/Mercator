# Mercator Checkout Exercise

## Overview
This is a solution for the pre-interview checkout exercise.  
The checkout system calculates the total cost for apples and oranges, including simple offers.

## Items and Prices
- Apple: £0.60  
- Orange: £0.25  

### Offers
- Buy One Get One Free on apples  
- 3 for 2 on oranges  

## Project Structure
- src/ - main checkout code (PriceCalculator.java)
- test/ - JUnit tests


## Assumptions
- Input: `List<String>` of scanned items  
- Item names are case-insensitive  
- Unknown items are ignored  

## Example Usage
```java
PriceCalculator calculator = new PriceCalculator();
List<String> items = List.of("APPLE", "APPLE", "ORANGE", "APPLE");
double total = calculator.checkoutItems(items);
System.out.println(total); // 2.05
```

## Testing

Tests cover single items, multiple items, offers, empty baskets, and unknown items.

Uses JUnit 5. Run via IDE or command line.

## Git Workflow

Step 1: basic checkout -> git tag step-1

Step 2: offers added -> git tag step-2
