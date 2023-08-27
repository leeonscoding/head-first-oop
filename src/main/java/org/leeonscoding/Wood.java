package org.leeonscoding;

public enum Wood {
    INDIAN, ROSEWOOD, BRAZILIAN, MAHOGANY, MAPLE, CEDAR, ADLER;

    @Override
    public String toString() {
        switch (this) {
            case INDIAN -> {
                return "indian";
            }
            case ROSEWOOD -> {
                return "rosewood";
            }
            case BRAZILIAN -> {
                return "brazilian";
            }
            case MAHOGANY -> {
                return "mahogany";
            }
            case MAPLE -> {
                return "maple";
            }
            case CEDAR -> {
                return "cedar";
            }
            case ADLER -> {
                return "adler";
            }
        }
        return "";
    }
}