package org.leeonscoding;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar searchParam = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ADLER, Wood.ADLER);
        Guitar guitar = inventory.search(searchParam);

        if(guitar != null) {
            System.out.println(guitar.getSerialNumber());
        } else {
            System.out.println("not found");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        //Add guitars to the inventory
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ADLER, Wood.ADLER);
    }
}
