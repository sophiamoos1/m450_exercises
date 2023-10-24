package ch.schule.bank.junit5;

import ch.schule.Booking;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Tests für die Klasse Booking.
 *
 * @author Luigi Cavuoti
 * @version 1.1
 */
public class BookingTests
{
	/**
	 * Tests f�r die Erzeugung von Buchungen.
	 */
	@Test
	public void testInitialization()
	{
		Booking booking = new Booking(31102023, 4400);

		assertEquals(31102023, booking.getDate());
		assertEquals(4400, booking.getAmount());

	}

	/**
	 * Experimente mit print().
	 */
	@Test
	public void testPrint()
	{
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Booking booking = new Booking(31102023, 4400);

		booking.print(4400);
		System.setOut(System.out);

		assertEquals("04.07.88364       0.04       0.09", outContent.toString().trim());
	}
}
