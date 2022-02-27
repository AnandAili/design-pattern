package com.anand.gsf.board.api;

import java.util.LinkedList;
import java.util.List;

public class Tile {

    private List units;
    public Tile() {
        units = new LinkedList();
    }
    protected void addUnit(Unit unit) {
        this.units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        this.units.remove(unit);
    }

    public List getUnits() {
        return units;
    }
}
