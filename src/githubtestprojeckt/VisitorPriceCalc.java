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
    ArrayList<Integer> SpecialActvy = new ArrayList<Integer>();
    
    
    VisitorPriceCalc () {
        Menu();    
        CurrentPrice = 0;
        NumberOfVisitors = 0;
        NumberOfCars = 0;
    }
    
    
    
    
    public  void Menu() {
        
        int ChoosenOption;
        String Options;
        
        
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
                    break;
                case 2:
                    Visitors.get(i).Price = 2;
                    break;
                case 3:
                    Visitors.get(i).Price = 3;
                    break;
            }
            
            System.out.print("""
                Zusatz Aktivitäten 
                    0 - Nothing
                    1 - Streichel Gehäge/Ziegenfutter
                    2 - Orca Show 
                    3 - Both 
            """);
            
            ChoosenOption = scan.nextInt();
        
            switch (ChoosenOption) {
                case 1:
                    Visitors.get(i).ZuSatzOrca = true;
                    Visitors.get(i).ZuSatzStreichel = false;
                    break;
                case 2:
                    Visitors.get(i).ZuSatzStreichel = true; 
                    Visitors.get(i).ZuSatzOrca = false;
                    break;
                case 3:
                    Visitors.get(i).ZuSatzStreichel = true;
                    Visitors.get(i).ZuSatzOrca = true;
                    break;                    
            }
            
            
            
            
            
        }
        
        System.out.print("""
        Themenwelten(wird auf gesammte Gruppe abgerechnet)(multiple are possible just put them with a , after another like this 1,4,5)
            0 - Only Special activatys 
            1 - Eurasien
            2 - Afrika
            3 - Nordamerica
            4 - Südamerika
            5 - Australien/Ozianien
            6 - tropisches Zentrum
            7 - Meereselt
        """);
        
        Options = scan.next();
            
        String[] parts = Options.split(",");
        for (String part : parts) {
            SpecialActvy.add(Integer.parseInt(part));
        }
        
        
        
        
        
        
        
        
        
      
    }
    
    
    
    
    float CalculateTotalPrice() {
    
    
    
    } 
}
