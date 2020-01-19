/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intership;

import java.util.ArrayList;

/**
 *
 * @author dj922
 */
public class Vans {
    private String plate;
    private ArrayList<String> plates = new ArrayList();

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public ArrayList<String> getPlates() {
        return plates;
    }

    public void setPlates(ArrayList<String> plates) {
        this.plates = plates;
    }

    public Vans(String plate) {
        this.plate = plate;
    }
    public void addVan(String plate){
        plates.add(plate);
    }
    public void removeVan(String plate){
        plates.remove(plate);
    }
}
