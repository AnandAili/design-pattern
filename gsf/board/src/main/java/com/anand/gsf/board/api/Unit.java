package com.anand.gsf.board.api;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Unit {
    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;
    public Unit(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addWeapon(Weapon weapon) {
        if(weapons == null) this.weapons = new LinkedList();
        this.weapons.add(weapon);
    }

    public List getWeapons() {
        return weapons;
    }

    public void setProperties(String property, Object value) {
        if(properties == null) {
            properties = new HashMap();
        }
        properties.put(property, value);
    }

    public Object getProperty(String property) {
        if(properties == null) throw new IllegalArgumentException("no proerties found");
        Object value = properties.get(property);
        if(value == null) {
            throw new IllegalArgumentException(property + " is not found");
        }
        return value;
    }
}
