/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Laberinto;

import temp.Explorer;

/**
 * @author Antonio Miguel Martel
 * Las puertas me permiten especificar si puedo ir al otro compartimento desde mi
 * puerta. Tambien puedo darles propiedades con el type para hacer que se sucedan
 * eventos al pasar por una puerta.
 * 
 * Por poder, podria poner las puertas y las paredes en una clase llamada
 * CompartmentElement pero esto ya seria demasiado.
 */
public class Door {
    
    private final Compartment compartment1,compartment2;
    boolean isOpen = false;
    DOOR_TYPE type;

    public Door(Compartment compartment1, Compartment compartment2) {
        this.compartment1 = compartment1;
        this.compartment2 = compartment2;
        type = DOOR_TYPE.NORMAl;
    }
    
    public Door(Compartment compartment1, Compartment compartment2, DOOR_TYPE type) {
        this.compartment1 = compartment1;
        this.compartment2 = compartment2;
        this.type = type;
    }
    
    public Compartment atOtherSide(Compartment compartment) {
        //Operador ternario anidado.
        return compartment == compartment1 ? compartment2 : compartment == compartment2 ? compartment1: null;
    }
    
    public void open(Explorer explorer) {
        //AQUI ME DIO UN ERROR DE FOUND VALUE REQUIRED VARIABLE
        // type != DOOR_TYPE.KEY ? isOpen = true : explorer.getKeyAmount() > 0? isOpen = true : isOpen = false;
        //Se me soluciona asi:
        //Vamos que si tengo llaves lo abro y si no pues no lo abro.
        //Si es de tipo normal se abre y punto sin necesidad de yo tener llaves.
        
        // Las puertas que nunca se abren son de tipo muro.
        
        // Es mejor que las puertas tengan tipo muro porque reutilizo codigo.
        if(type != DOOR_TYPE.WALL)
        isOpen = type != DOOR_TYPE.KEY ? true : explorer.getKeyAmount() > 0;
        
        
        
    }
    
    
    
}
