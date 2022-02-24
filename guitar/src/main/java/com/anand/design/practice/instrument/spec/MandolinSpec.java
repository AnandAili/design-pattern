package com.anand.design.practice.instrument.spec;

import com.anand.design.practice.Builder;
import com.anand.design.practice.Style;
import com.anand.design.practice.Type;
import com.anand.design.practice.Wood;

public class MandolinSpec extends InstrumentSpec {

    private Style style;
    public MandolinSpec(Style style,Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec)) return false;
        MandolinSpec spec = (MandolinSpec) otherSpec;
        if(spec.style != this.style) return false;
        return true;
    }
}
