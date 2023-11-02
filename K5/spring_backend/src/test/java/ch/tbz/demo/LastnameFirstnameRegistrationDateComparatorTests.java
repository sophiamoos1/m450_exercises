package ch.tbz.demo;

import ch.tbz.demo.domain.addressbook.Addressbook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

class LastnameFirstnameRegistrationDateComparatorTests {

    @Test
    void testComparator() {
        Addressbook addressbook1 = new Addressbook(UUID.randomUUID(), "Max", "Mustermann", "max@mustermann.com", "geheim123");
        Addressbook addressbook2 = new Addressbook(UUID.randomUUID(), "Luis", "Meier", "luis@meier.com", "14082001");
        Addressbook addressbook3 = new Addressbook(UUID.randomUUID(), "Ursula", "Graf", "ursula@graf.com", "phggfd12");

        List<Addressbook> addresses = Arrays.asList(addressbook1, addressbook2, addressbook3);

        Assertions.assertEquals(addressbook3, addresses.get(2)); //Ursula Graf
        Assertions.assertEquals(addressbook2, addresses.get(1)); // Luis Meier
        Assertions.assertEquals(addressbook1, addresses.get(0)); //Max Mustermann

    }
}
