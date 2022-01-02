package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void groupedAssertions() {
        //given
        Person person  = new Person(1l,"Henry", "Liao");

        //then
        assertAll("Test Props Set",
                ()-> assertEquals("Henry", person.getFirstName(),"First Name Failed"),
                ()-> assertEquals( "Liao", person.getLastName(),"Last Name Failed"));
    }
}