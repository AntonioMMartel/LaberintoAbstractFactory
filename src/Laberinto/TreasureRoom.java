/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Laberinto;

/**
 * @author Antonio Miguel Martel
 */
public class TreasureRoom extends Room {
    
    Treasure treasure;

    public TreasureRoom(Treasure treasure, int roomId) {
        super(roomId);
        this.treasure = treasure;
    }
    
    public void verTesoro() {
        System.out.println("En esta sala hay " + treasure.coins + " monedas.");
    }
}
