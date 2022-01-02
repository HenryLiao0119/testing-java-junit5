package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l,"Henry", "Liao");
        owner.setCity("New York");
        owner.setTelephone("8881234567");

        assertAll("Properties Test",
                ()->assertAll("Person Properties",
                        ()-> assertEquals("Henry", owner.getFirstName()),
                        ()->assertEquals("Liao", owner.getLastName())),
                ()->assertAll("Owner Properties",
                        ()-> assertEquals("New York", owner.getCity()),
                        ()-> assertEquals("8881234567", owner.getTelephone())
                ));
    }
}
