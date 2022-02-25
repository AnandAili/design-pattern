package com.anand.design.practice.allowedValues;

public enum InstrumentType {
    GUITAR, MANDOLIN, BANJO, DOBRA, FIDDLE, BASS;

    public String toString() {
        switch (this) {
            case BASS: return "Bass";
            case BANJO: return "Banjo";
            case DOBRA: return "Dobra";
            case FIDDLE: return "Fiddle";
            case GUITAR: return "Guitar";
            case MANDOLIN:return "Mandolin";
            default: return "Inspecified";
        }
    }
}
