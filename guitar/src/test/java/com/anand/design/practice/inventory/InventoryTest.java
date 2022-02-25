package com.anand.design.practice.inventory;

import com.anand.design.practice.allowedValues.Builder;
import com.anand.design.practice.allowedValues.InstrumentType;
import com.anand.design.practice.allowedValues.Type;
import com.anand.design.practice.allowedValues.Wood;
import com.anand.design.practice.instrument.spec.InstrumentSpec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InventoryTest {

    @org.junit.jupiter.api.Test
    void testSearch() {

        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);
        InstrumentSpec spec = new InstrumentSpec(properties);

        List actualInstruments = inventory.search(spec);
        System.out.println(actualInstruments.size());

    }

    private void initialiseInventory(Inventory inventory) {
        Map properties = new HashMap();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.SITKA);
        InstrumentSpec spec = new InstrumentSpec(properties);

        properties.put("backWood", Wood.ADIRONDACK);
        inventory.addInstrument("2",1202d, spec);

    }
}