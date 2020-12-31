/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temp;

import Laberinto.Compartment;
import Laberinto.Room;

/**
 * @author Antonio Miguel Martel
 * Podriamos crear tipos de Exploradores a partir de este explorador
 * Como un demolicionista que abra muros con "llaves especiales" que son bombas
 * O un cerrajero que si no tiene llaves abre las puertas igualmente.
 */
public class Explorer {
    
    String name;
    Compartment compartment;
    int keyAmount;

    public Explorer(String name, int keys) {
        this.name = name;
        this.compartment = compartment;
        this.keyAmount = keys;
    }

    public String getName() {
        return name;
    }

    public Compartment getCompartment() {
        return compartment;
    }

    public int getKeyAmount() {
        return keyAmount;
    }

    public void enter(Compartment compartment) {
        this.compartment = compartment;
    }

    public void setKeyAmount(int keyAmount) {
        this.keyAmount = keyAmount;
    }
    
    // Esto esta para que la sala encantada te cambie el nombre.
    public void setName(String name) {
        this.name = name;
    }

    void decreaseKeyAmount() {
        keyAmount = keyAmount - 1;
    }
    
    void move(Compartment compartment) {
        if (compartment instanceof Room && this.compartment.searchCompartment(compartment)){
            
        } 
    }
    
}
