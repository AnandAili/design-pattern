package com.anand.design.practice.instrument.spec;

import com.anand.design.practice.Builder;
import com.anand.design.practice.Type;
import com.anand.design.practice.Wood;

public class GuitarSpec extends InstrumentSpec {
    private int numString;
    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        super(builder, model, type, backWood, topWood);
        this.numString = numString;
    }

    public int getNumString() {
        return numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec)) {
            return false;
        }
        GuitarSpec spec = (GuitarSpec) otherSpec;
        if(spec.numString != this.numString) return false;
        return true;
    }
}
