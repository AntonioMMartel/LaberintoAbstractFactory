/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MazeFactory;

import Laberinto.Room;
import Laberinto.Treasure;
import Laberinto.TreasureRoom;

/**
 * @author Antonio Miguel Martel
 */
public class TreasureMazeFactory extends MazeFactory {
    
    @Override
    public Room makeRoom(int roomId) {
        Treasure treasure = new Treasure(243);
        TreasureRoom room = new TreasureRoom(treasure, roomId);
        return room;
    }
    
}
