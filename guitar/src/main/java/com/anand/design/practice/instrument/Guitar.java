package com.anand.design.practice.instrument;

import com.anand.design.practice.instrument.spec.GuitarSpec;

public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
    }
}
