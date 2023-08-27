package org.leeonscoding;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this){
            case FENDER -> {
                return "fender";
            }
            case MARTIN -> {
                return "martin";
            }
            case GIBSON -> {
                return "gibson";
            }
            case COLLINS -> {
                return "collins";
            }
            case OLSON -> {
                return "olson";
            }
            case RYAN -> {
                return "ryan";
            }
            case PRS -> {
                return "prs";
            }
            case ANY -> {
                return "any";
            }
        }
        return "";
    }
}