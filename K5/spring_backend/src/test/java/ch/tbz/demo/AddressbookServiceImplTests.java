package ch.tbz.demo;

import ch.tbz.demo.domain.addressbook.Addressbook;
import ch.tbz.demo.domain.addressbook.AddressbookRepository;
import ch.tbz.demo.domain.addressbook.AddressbookService;
import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
//mock
@RunWith(MockitoJUnitRunner.class)
class AddressbookServiceImplTests {
    @Mock
    private AddressbookRepository repository;

    @InjectMocks
    private AddressbookService service;

    //test-object
    static Addressbook addressbook = new Addressbook();

    //Before each, resets the test-object
    @BeforeEach
    public void init(){
        addressbook = new Addressbook();
    }

    @Test
     void findById() {
        // Check for the Repository-Behavior
        when(repository.findById(addressbook.getId())).thenReturn(Optional.of(new Addressbook()));

        // Tests the service-method
        Addressbook entity = service.findById(addressbook.getId());
        assertNotNull(entity);
    }

}
