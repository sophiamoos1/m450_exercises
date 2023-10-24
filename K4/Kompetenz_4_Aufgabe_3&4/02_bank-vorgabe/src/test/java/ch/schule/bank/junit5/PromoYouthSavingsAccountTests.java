package ch.schule.bank.junit5;

import ch.schule.PromoYouthSavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests für das Promo-Jugend-Sparkonto.
 *
 * @author XXXX
 * @version 1.0
 */
public class PromoYouthSavingsAccountTests
{
	PromoYouthSavingsAccount promoYouthSavingsAccount;

	@BeforeEach
	public void setUp(){
		promoYouthSavingsAccount = new PromoYouthSavingsAccount("P-12345678");
	}

	@Test
	public void testInitialization()
	{
		assertEquals("P-12345678", promoYouthSavingsAccount.getId());
	}

	@Test
	public void testWithdraw(){
		assertTrue(promoYouthSavingsAccount.deposit(30902023, 1000));
	}

	@Test
	public void testWithdrawWithNegativeValue(){
		assertFalse(promoYouthSavingsAccount.deposit(30902023, -1000));
	}
}
