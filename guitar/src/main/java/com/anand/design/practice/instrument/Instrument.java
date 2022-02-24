package com.anand.design.practice.instrument;

import com.anand.design.practice.instrument.spec.InstrumentSpec;

public abstract class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

    public void setSpec(InstrumentSpec spec) {
        this.spec = spec;
    }
}
