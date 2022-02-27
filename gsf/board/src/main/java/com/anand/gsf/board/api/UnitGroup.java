package com.anand.gsf.board.api;

import java.util.*;

public class UnitGroup {
    Map units;

    UnitGroup() {
        units = new HashMap();
    }

    UnitGroup(List unitList) {
        this();
        for(Object object: unitList) {
            Unit unit = (Unit) object;
            units.put(unit.getId(), unit);
        }
    }

    public void addUnit(Unit unit) {
        units.put(unit.getId(), unit);
    }

    public void removeUnit(int id) {
        units.remove(id);
    }

    public Unit getUnit(int id) {
        return (Unit) units.get(id);
    }

    public List getUnits() {
        List unitList = new LinkedList();
        for(Iterator i= units.entrySet().iterator(); i.hasNext();) {
            Unit unit = (Unit) ((Map.Entry) i.next()).getValue();
            unitList.add(unit);
        }
        return unitList;
    }
}
