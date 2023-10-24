package ch.schule.bank.junit5;

import ch.schule.Bank;
import ch.schule.Booking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests f�r die Klasse 'Bank'.
 *
 * @author xxxx
 * @version 1.0
 */
public class BankTests {
    Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }
    /**
     * Tests to create new Accounts
     */
    @Test
    public void testCreate() {
        assertEquals("P-1000", bank.createSalaryAccount(-100));
        assertEquals("S-1001", bank.createSavingsAccount());
        assertEquals("Y-1002", bank.createPromoYouthSavingsAccount());
    }
    /**
     * Testet das Einzahlen auf ein Konto.
     */
    @Test
    public void testDepositSuccess() {
        String id = bank.createSalaryAccount(-100);
        assertTrue(bank.deposit(id, 30092023, 1000));
    }
    /**
     *
     * Testet das Einzahlen auf ein Konto mit einem negativen Wert
     */
    @Test
    public void testDepositWithMinusNumber() {
        String id = bank.createSalaryAccount(-100);
        assertFalse(bank.deposit(id, 30092023, -1000));
    }

    /**
     * Testet das Abheben von einem Konto
     */
    @Test
    public void testWithdraw() {
        String id = bank.createSalaryAccount(-100);
        bank.deposit(id, 30092023, 1000);
        assertTrue(bank.withdraw(id, 30092023, 1000));
    }


    /**
     * Testet das Abheben von einem Konto mit keinem Guthaben
     */
    @Test
    public void testWithdrawWithNoSalary() {
        String id = bank.createSalaryAccount(-100);
        assertFalse(bank.withdraw(id, 30092023, 1000));
    }

    /**
     * Testet das Abheben von einem Konto mit einem negativen Wert
     */
    @Test
    public void testWithdrawWithWrongInput() {
        String id = bank.createSalaryAccount(-100);
        bank.deposit(id, 30092023, 1000);
        assertFalse(bank.withdraw(id, 30092023, -1000));
    }

    /**
     * Experimente mit print().
     */
    @Test
    public void testPrint() {
        String id = bank.createSalaryAccount(-100);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bank.print(id);
        System.setOut(System.out);

        assertEquals("Kontoauszug 'P-1000'\n" +
                "Datum          Betrag      Saldo", outContent.toString().trim());
    }

    /**
     * Experimente mit print(year, month).
     */
    @Test
    public void testMonthlyPrint() {
        String id = bank.createSalaryAccount(-100);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bank.print(id, 2023, 9);
        System.setOut(System.out);

        assertEquals("Kontoauszug 'P-1000' Monat: 9.2023\n" +
                "Datum          Betrag      Saldo", outContent.toString().trim());
    }

    /**
     * Testet den Gesamtkontostand der Bank. mit keinen vorhandenen Konten.
     */
    @Test
    public void testBalance() {
        String id = bank.createSalaryAccount(-100);
        bank.deposit(id, 30092023, 1000);
        assertEquals(-1000, bank.getBalance());
    }

    /**
     * Testet den Gesamtkontostand der Bank mit keinen vorhandenen Konten.
     */
    @Test
    public void testBalanceWithNoAccounts() {
        assertEquals(0, bank.getBalance());
    }

    /**
     * Tested die Ausgabe der "top 5" Konten.
     */
    @Test
    public void testTop5() {
        create10Accounts();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bank.printTop5();
        System.setOut(System.out);

        assertEquals("S-1010: 1010\n" +
                "S-1009: 1009\n" +
                "S-1008: 1008\n" +
                "S-1007: 1007\n" +
                "S-1006: 1006", outContent.toString().trim());
    }

    /**
     * Tested die Ausgabe der "top 5" Konten mit keinen vorhandenen Konten.
     */
    @Test
    public void testTop5WithNoAccounts() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bank.printTop5();
        System.setOut(System.out);

        assertEquals("", outContent.toString().trim());
    }

    /**
     * Tested die Ausgabe der "bottom 5" Konten mit keinen vorhandenen Konten.
     */
    @Test
    public void testBottom5() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bank.printBottom5();
        System.setOut(System.out);

        assertEquals("", outContent.toString().trim());
    }

    /**
     * Tested die Ausgabe der "bottom 5" Konten
     */
    @Test
    public void testBottom5WithNoAccounts() {
        create10Accounts();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bank.printBottom5();
        System.setOut(System.out);

        assertEquals("S-1000: 1000\n" +
                "S-1001: 1001\n" +
                "S-1002: 1002\n" +
                "S-1003: 1003\n" +
                "S-1004: 1004", outContent.toString().trim());
    }

    void create10Accounts (){
        for (int i = 0; i <= 10; i++) {
            String id= bank.createSavingsAccount();
            bank.deposit(id, 10092023, 1000+i);
        }
    }

}
