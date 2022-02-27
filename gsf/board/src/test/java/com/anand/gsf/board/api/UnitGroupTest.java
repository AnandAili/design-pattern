package com.anand.gsf.board.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitGroupTest {

    @Test
    void addUnit() {
        List unitList = getUnitList();
        UnitGroup group = new UnitGroup(unitList);

        group.addUnit(new Unit(3));

        Assertions.assertEquals(group.getUnits().size(), 3);

    }



    @Test
    void removeUnit() {
        List unitList = getUnitList();
        UnitGroup group = new UnitGroup(unitList);

        group.removeUnit(1);

        Assertions.assertEquals(group.getUnits().size(), 1);
        Assertions.assertNull(group.getUnit(1));
    }

    @Test
    void getUnit() {
        List unitList = getUnitList();
        UnitGroup group = new UnitGroup(unitList);

        Assertions.assertNotNull(group.getUnit(1));

    }

    @Test
    void getUnits() {

        List unitList = getUnitList();
        UnitGroup group = new UnitGroup(unitList);

        List actual =group.getUnits();

        Assertions.assertTrue(actual.containsAll(unitList));
        Assertions.assertTrue(unitList.containsAll(actual));

    }

    private List getUnitList() {
        List unitList = new LinkedList();

        Unit unit1 = new Unit(1);
        unitList.add(unit1);

        Unit unit2 = new Unit(2);
        unitList.add(unit2);

        return unitList;

    }
}