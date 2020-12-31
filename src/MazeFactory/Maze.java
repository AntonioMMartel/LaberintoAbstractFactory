/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MazeFactory;

import Laberinto.Compartment;
import java.util.ArrayList;

/**
 * @author Antonio Miguel Martel
 */
public class Maze {
    //Pq no es un mapa?
    //Porque se me quedan huecos en la implementacion.
    private final ArrayList<Compartment> compartments = new ArrayList<>();

    public boolean add(Compartment e) {
        return compartments.add(e);
    }

    public ArrayList<Compartment> getCompartments() {
        return compartments;
    }
    
    
    

    
    
    
    
}
