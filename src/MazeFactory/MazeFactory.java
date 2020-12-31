/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MazeFactory;

import Laberinto.Compartment;
import Laberinto.DOOR_TYPE;
import Laberinto.Room;
import Laberinto.Door;

/**
 * @author Antonio Miguel Martel
 */
public class MazeFactory {
    
    public Maze makeMaze(){
        Maze maze = new Maze();
        return maze;
    }
    
    
    public Compartment makeCompartment() {
        Compartment compartment = new Compartment();
        return compartment;
    }
    
    public Door makeDoor(Compartment compartment1, Compartment compartment2) {
        Door door = new Door(compartment1, compartment2);
        return door;
    }
    
    public Door makeWall(Compartment compartment1, Compartment compartment2) {
        Door door = new Door(compartment1, compartment2, DOOR_TYPE.WALL);
        return door;
    }
    
    public Room makeRoom(int roomId) {
        Room room = new Room(roomId);
        return room;
    }
    
    
}
