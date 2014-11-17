/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez.piezas;

/**
 *
 * @author mautematico
 */
public class Rey extends Pieza {

    @Override
    boolean[][] posicionesPosibles() {
        boolean [][] posicionesPosibles = new boolean [8][8];
        int x = this.getPosicionActual().getX();
        int y = this.getPosicionActual().getY();
        posicionesPosibles[x][y] = true;
        for(int i = 0; i <= 8; i++){
            for(int j = 0; j <= 8; j++){
                if (i == x || i == x+1 || i == x-1){
                    if(j == y || j == y+1 || j == y-1)
                        posicionesPosibles[i][j] = true;
                }
                    
                                
            }
        }
        return posicionesPosibles;
    }
    
}
