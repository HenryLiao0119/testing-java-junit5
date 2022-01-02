package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//test test 123
class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    //more meaningful name
    @DisplayName("Test Proper View name")
    @Test
    void index() {
        // normal way
        assertEquals("index", controller.index());
        // add msg
        assertEquals("index", controller.index(), "Wrong View Returned");
        // lambda way
        assertEquals("index", controller.index(), () -> "This is some expensive " +
                " Message to build");
    }

    @Test
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, ()-> {
            controller.oupsHandler();
        });
        //assertTrue("notimplemented".equals(controller.oupsHandler()));
    }

    @Test
    void testAssumptionTrue() {

    }
}