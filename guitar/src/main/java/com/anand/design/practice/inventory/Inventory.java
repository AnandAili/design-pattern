package com.anand.design.practice.inventory;

import com.anand.design.practice.instrument.Guitar;
import com.anand.design.practice.instrument.Instrument;
import com.anand.design.practice.instrument.Mandolin;
import com.anand.design.practice.instrument.spec.GuitarSpec;
import com.anand.design.practice.instrument.spec.InstrumentSpec;
import com.anand.design.practice.instrument.spec.MandolinSpec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;
    public Inventory() {
        this.inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if(spec instanceof GuitarSpec)
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        else
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
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

    public List search(GuitarSpec spec) {
        List matchingGuitar = new LinkedList<>();
        for(Iterator i=inventory.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if(guitar.getSpec().matches(spec)) matchingGuitar.add(guitar);
        }
        return matchingGuitar;
    }
    public List search(MandolinSpec spec) {
        List matchingMandolina = new LinkedList<>();
        for(Iterator i=inventory.iterator(); i.hasNext();) {
            Mandolin mandolin = (Mandolin) i.next();
            if(mandolin.getSpec().matches(spec)) matchingMandolina.add(mandolin);
        }
        return matchingMandolina;
    }


}
