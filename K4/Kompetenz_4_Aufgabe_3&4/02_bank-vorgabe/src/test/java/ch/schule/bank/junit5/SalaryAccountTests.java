package ch.schule.bank.junit5;

import ch.schule.Booking;
import ch.schule.SalaryAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests der Klasse SalaryAccount.
 *
 * @author XXX
 * @version 1.1
 */
public class SalaryAccountTests
{
	SalaryAccount salaryAccount;

	@BeforeEach
	public void setUp(){
		salaryAccount = new SalaryAccount("S-12345678", -1000);
	}

	/**
	 * Tested die Initialisierung eines Kontos.
	 */
	@Test
	public void testInit() {
		assertEquals("S-12345678", salaryAccount.getId());
	}

	/**
	 * Testet das Einzahlen auf ein Konto.
	 */
	@Test
	public void testDeposit() {
		assertTrue(salaryAccount.deposit(30092023, 500));
	}

	/**
	 * Testet das Einzahlen auf ein Konto mit einem negativen Wert.
	 */
	@Test
	public void testDepositWithNegativeValue() {
		assertTrue(salaryAccount.deposit(30092023, -500));
	}

	/**
	 * Testet das Abheben von einem SalaryAccount.
	 */
	@Test
	public void testWithdraw() {
		assertTrue(salaryAccount.withdraw(30092023, 500));
	}

	/**
	 * Testet das Abheben von einem SalaryAccount mit einem negativen Wert
	 */
	@Test
	public void testWithdrawWith() {
		assertFalse(salaryAccount.withdraw(30092023, -500));
	}

	/**
	 * Tests the reference from SavingsAccount
	 No idea what this means
	@Test
	public void testReferences() {
		fail("toDo");
	}
	 */

	/**
	 * testet the canTransact Flag
	 */
	@Test
	public void testCanTransact() {
		assertTrue(salaryAccount.canTransact(31102023));
	}

	/**
	 * testet the canTransact Flag
	 */
	@Test
	public void testCanNotTransact() {
		Booking booking = new Booking(31102023, 4400);
		salaryAccount.setBooking(booking);
		assertFalse(salaryAccount.canTransact(10101910));
	}

	/**
	 * Experimente mit print().
	 */
	@Test
	public void testPrint() {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		salaryAccount.print();
		System.setOut(System.out);

		assertEquals("Kontoauszug 'S-12345678'\n" +
				"Datum          Betrag      Saldo", outContent.toString().trim());
	}

	/**
	 * Experimente mit print(year,month).
	 */
	@Test
	public void testMonthlyPrint() {

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		salaryAccount.print(2023, 9);
		System.setOut(System.out);

		assertEquals("Kontoauszug 'S-12345678' Monat: 9.2023\n" +
				"Datum          Betrag      Saldo", outContent.toString().trim());
	}
}
