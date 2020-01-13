package test_profit_loss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProfitLoss {

	@Test
	public void testPass() {
		Profit profit = new Profit();
		assertEquals(100.0, profit.profitLoss(200.0, 300.0), 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testProfit() {
		Profit profit = new Profit();
		profit.profitLoss(-200, 300);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testLoss() {
		Profit profit = new Profit();
		profit.profitLoss(200, -300);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNeg() {
		Profit profit = new Profit();
		profit.profitLoss(-200, -300);
	}

}
