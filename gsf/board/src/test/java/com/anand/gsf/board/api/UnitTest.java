package com.anand.gsf.board.api;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnitTest {

    @Test
    void getCommonProperty() {
        String expected = "infantry";
        Unit unit = new Unit(1);
        unit.setType(expected);

        String actual = (String) unit.getType();
        Assertions.assertEquals(actual, expected);

    }

    @Test
    void getUnitSpecificProperty() {
        int expectedHitsPoints = 25;
        Unit unit = new Unit(1);
        unit.setProperties("hitPoints", expectedHitsPoints);
        Assertions.assertEquals(unit.getProperty("hitPoints"),expectedHitsPoints);
    }
    @Test
    void updateUnitSpecificProperty() {
        int expectedHitsPoints = 25;
        Unit unit = new Unit(1);
        unit.setProperties("hitPoints", expectedHitsPoints);
        unit.setProperties("hitPoints", 25);
        Assertions.assertEquals(unit.getProperty("hitPoints"),25);
    }

    @Test
    void testNonExistingProperty() {
        Unit unit = new Unit(1);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Object actual = unit.getProperty("dummy");
        });
    }
}