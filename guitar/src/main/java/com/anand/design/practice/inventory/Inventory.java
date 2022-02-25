package com.anand.design.practice.inventory;

import com.anand.design.practice.instrument.Instrument;
import com.anand.design.practice.instrument.spec.InstrumentSpec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;
    public Inventory() {
        this.inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }
    public Instrument getInstrument(String serialNumber) {
        for(Iterator i = inventory.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument) i.next();
            if(instrument.getSerialNumber().equals(serialNumber))
                return instrument;
        }
        return null;
    }

    public List search(InstrumentSpec spec) {
        List matchingInstruments = new LinkedList<>();
        for(Iterator i=inventory.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument) i.next();
            if(instrument.getSpec().matches(spec)) matchingInstruments.add(instrument);
        }
        return matchingInstruments;
    }


}
