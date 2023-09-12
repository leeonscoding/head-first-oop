package org.leeonscoding;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar searchParam = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ADLER, Wood.ADLER);
        List matchingGuitars = inventory.search(searchParam);

        if(!matchingGuitars.isEmpty()) {
            System.out.println("Search result: ");

            for(Iterator i =matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar) i.next();
                System.out.println(guitar.getSerialNumber());
                System.out.println("We have a "+
                        guitar.getBuilder() + " " + guitar.getModel() + " "+
                        guitar.getType() + " guitar:\n"+
                        guitar.getBackWood() + " back and sides,\n"+
                        guitar.getTopWood() + " top.\n You can have it only $" + guitar.getPrice() + "!\n");
            }
        } else {
            System.out.println("Sorry, we have nothing for you");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        //Add guitars to the inventory
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ADLER, Wood.ADLER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ADLER, Wood.ADLER);
    }
}
