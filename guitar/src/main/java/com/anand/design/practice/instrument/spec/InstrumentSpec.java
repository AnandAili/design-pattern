package com.anand.design.practice.instrument.spec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
    Map properties;

    public InstrumentSpec(Map properties) {
        if(properties == null) {
            this.properties = new HashMap();
        }else
            this.properties = new HashMap(properties);
    }

    public Map getProperties() {
        return properties;
    }

    public  Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
            String propertyName = (String) i.next();
            if(!properties.get(propertyName).equals(otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }
}
