/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubtestprojeckt;

/**
 *
 * @author 14257009
 */
public class Visitor {
    boolean ZuSatzOrca;
    boolean ZuSatzStreichel;
    int Price; // 1 == Pauschale Erwachsen ; 2 ==  Pauschale Kind(u10); 3 == Pauschale Ermäßigt
    
    
    double GivePriceBack() {
        double PriceOutput = 0;
        
        switch (Price) {
            case 1:
                PriceOutput = PriceOutput + 3.5;
                break;
            case 3:
                PriceOutput = PriceOutput + 1.5;
                break;
        }
        
        
        if (ZuSatzOrca) {
            PriceOutput = PriceOutput + 7;
        }
        if (ZuSatzStreichel) {
            PriceOutput = PriceOutput + 2;
        }
        
        
        return PriceOutput;    
    }
}
