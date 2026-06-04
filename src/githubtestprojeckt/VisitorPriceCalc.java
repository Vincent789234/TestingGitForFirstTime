/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubtestprojeckt;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author 14257009
 */
public class VisitorPriceCalc {
    Scanner scan = new Scanner(System.in);
    double CurrentPrice;
    int NumberOfVisitors;
    int NumberOfCars;
    ArrayList<Visitor> Visitors = new ArrayList<Visitor>();
    
    
    
    VisitorPriceCalc () {
        Menu();    
        CurrentPrice = 0;
        NumberOfVisitors = 0;
        NumberOfCars = 0;
    }
    
    
    
    
    public  void Menu() {
        
        int ChoosenOption;
        
        System.out.println("How many peoples are you ??");
        
        
        NumberOfVisitors = scan.nextInt();
        
        for (int i = 0;i < NumberOfVisitors;i++) {
            Visitors.add(new Visitor());
        }
        
        
        System.out.println("And with how many cars did you park in our Parking Garage ??");
        
        NumberOfCars = scan.nextInt();
        
        
        
        for (int i = 0;i < NumberOfVisitors;i++) {
            
            
            System.out.print("Person "+ (i+1) + ":\n");
            System.out.print("""
            Eintritt(wird bezahlt pro person)
            1  -Pauschale Erwachsen
            2  -Pauschale Kind(u10)
            3  -Pauschale Ermäßigt               
            """);
        
        
            ChoosenOption = scan.nextInt();
        
            switch (ChoosenOption) {
                case 1:
                    Visitors.get(i).Price = 1;
                case 2:
                    Visitors.get(i).Price = 2; 
                case 3:
                    Visitors.get(i).Price = 3;
           }
            
        }
        
      
    }
    
}
