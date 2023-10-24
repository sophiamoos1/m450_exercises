package ch.schule.bank.junit5;

import ch.schule.PromoYouthSavingsAccount;
import ch.schule.SavingsAccount;



/**
 * Tests f�r die Klasse SavingsAccount.
 *
 * @author Roger H. J&ouml;rg
 * @version 1.0
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests für die Klasse SavingsAccount.
 *
 * @author XXX
 * @version 1.0
 */
public class SavingsAccountTests
{
	SavingsAccount savingsAccount;
	@BeforeEach
	public void setUp(){
		savingsAccount = new SavingsAccount("S-12345678");
	}
	@Test
	public void testInitialization()
	{
		assertEquals("S-12345678", savingsAccount.getId());
	}
	@Test
	public void testWithdraw(){
		assertFalse(savingsAccount.withdraw(30902023, 1000));
	}
	@Test
	public void testWithdrawWithNegativeValue(){
		assertFalse(savingsAccount.deposit(30902023, -1000));
	}
}

