package com.yang49.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang on 03/06/16.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Amber");
        }
        else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        } // end of else
        return brands;
    }
}
