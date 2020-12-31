/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Laberinto;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Antonio Miguel Martel
 */
public class Compartment {
    private final Map<DIRECTION, Compartment> connections = new HashMap<>();
    private final Map<DIRECTION, Door> doorBorder = new HashMap<>();
    
    public void setDoorConnection(DIRECTION direction, Compartment compartment) {
        //Si ya hay una sala en esa direccion no la ponemos
        if ( !connections.containsKey(direction)) {
            //Pongo el compartimento en esa direccion
            this.connections.put(direction, compartment);
            //Pongo una puerta en esa direccion
            doorBorder.put(direction, new Door(this, compartment));
        }
    }
    public void setWallConnection(DIRECTION direction, Compartment compartment) {
        //Si ya hay una sala en esa direccion no la ponemos
        if ( !connections.containsKey(direction)) {
            //Pongo el compartimento en esa direccion
            this.connections.put(direction, compartment);
            //Pongo una puerta en esa direccion
            doorBorder.put(direction, new Door(this, compartment, DOOR_TYPE.WALL));
        }
    }
    
    
    public Compartment getBorder(DIRECTION direction) {
        return this.connections.get(direction);
    }

    public boolean searchCompartment(Compartment compartment) {
        return connections.containsValue(compartment);
    }

    
    
    
    
}
