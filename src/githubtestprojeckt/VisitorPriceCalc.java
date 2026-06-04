/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubtestprojeckt;

import java.util.Scanner;

/**
 *
 * @author 14257009
 */
public class VisitorPriceCalc {
    Scanner scan = new Scanner(System.in);
    double CurrentPrice;
    int NumberOfVisitors;
    
    VisitorPriceCalc () {
        Menu();    
        CurrentPrice = 0;
        NumberOfVisitors = 0;
    }
    
    
    
    
    public  void Menu() {
        
        int ChoosenOption;
        
        System.out.println("How many peoples are you ??");
        
        
        NumberOfVisitors = scan.nextInt();
        
        
        
        
        
        
        
        
        System.out.print("""
        Hallo Zoobesucher
                         
        Eintritt
            1  -Pauschale Erwachsen
            2  -Pauschale Kind(u10)
            3 -Pauschale Ermäßigt
                               
        """);
        
        
        
        
        
        ChoosenOption = scan.nextInt();
        
        switch (ChoosenOption) {
            case 1:
                
        
        
        
        }
      
    }
    
}
