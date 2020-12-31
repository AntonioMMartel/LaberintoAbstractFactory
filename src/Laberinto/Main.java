/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Laberinto;

import MazeFactory.Maze;
import MazeFactory.MazeFactory;
import MazeFactory.TreasureMazeFactory;
import java.util.ArrayList;

/**
 * @author Antonio Miguel Martel
 */
public class Main {
    
    private static Maze createMaze(MazeFactory mazeFactory){
        Maze maze = mazeFactory.makeMaze();
        Compartment exterior = mazeFactory.makeCompartment();
        
        Compartment sala1 = mazeFactory.makeRoom(1);
        Compartment sala2 = mazeFactory.makeRoom(2);
        
        sala1.setDoorConnection(DIRECTION.SOUTH, sala2);
        sala1.setDoorConnection(DIRECTION.NORTH, exterior);
        sala1.setWallConnection(DIRECTION.EAST, null);
        sala1.setWallConnection(DIRECTION.WEST, null);
        
        sala1.setDoorConnection(DIRECTION.SOUTH, null);
        sala1.setWallConnection(DIRECTION.NORTH, sala1);
        sala1.setWallConnection(DIRECTION.EAST, null);
        sala1.setWallConnection(DIRECTION.WEST, null);
        
        maze.add(sala1);
        maze.add(sala2);
        return maze;
    }
    
    public static void main(String[] args) {
        
        //Sin maze factory
        //Maze maze = createMaze();
        
        // Laberinto normal
        MazeFactory mazeFactory = new MazeFactory();
        Maze mazeConfactory = createMaze(mazeFactory);
        
        // Laberinto de tesoros
        MazeFactory treasureMazeFactory = new TreasureMazeFactory();
        Maze treasureMaze = createMaze(treasureMazeFactory);
        
        ArrayList<Compartment> a = treasureMaze.getCompartments();
        TreasureRoom sala = (TreasureRoom) a.get(1);
        sala.verTesoro();
    }

}
