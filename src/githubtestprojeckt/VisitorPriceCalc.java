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
        CurrentPrice = 0;
        NumberOfVisitors = 0;
        NumberOfCars = 0;
        Menu();    
        
        
        System.out.println("Total Price:\n"+this.CalculateTotalPrice());
    }
    
    
    
    
    public  void Menu() {
        
        int ChoosenOption;
        String Options;
        
        
        System.out.println("How many peoples are you ??");
        
        
        this.NumberOfVisitors = scan.nextInt();
        
        for (int i = 0;i < this.NumberOfVisitors;i++) {
            Visitors.add(new Visitor());
        }
        
        
        System.out.println("And with how many cars did you park in our Parking Garage ??");
        
        this.NumberOfCars = scan.nextInt();
        
        
        
        for (int i = 0;i < this.NumberOfVisitors;i++) {
            
            
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
            
        String[] FullInput = Options.split(",");
        for (String OnlyOneOption : FullInput) {
            SpecialActvy.add(Integer.parseInt(OnlyOneOption));
        }
        
        
        
        
        
      
    }
    
    
    
    
    double CalculateTotalPrice() {
        
        
        CurrentPrice = CurrentPrice + (5.5*this.NumberOfCars);
        
        
        for (int i = 0;i < this.NumberOfVisitors;i++) {
            CurrentPrice = CurrentPrice + Visitors.get(0).GivePriceBack();

        }
        
        
        //Check if any Number are Redundent
        for (int i = 0;i < 7;i++) {
            boolean NumberExists = false;
            
            for (int j = 0;j < SpecialActvy.size();j++) {
                
                while (true) {
                    if (SpecialActvy.size() > j) {
                        if (i == SpecialActvy.get(j)) {
                            if (NumberExists == true && i == SpecialActvy.get(j)) {
                                SpecialActvy.remove(j);
                                //System.out.print("Tried"+j+"\n");
                            }
                            else if (i == SpecialActvy.get(j)) {
                                NumberExists = true;
                                break;
                            } 
                            else {
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        break;
                    }
                }
                
                 
            } 
        }
        
        
        
        
        /*
        for (int i = 0;i < SpecialActvy.size();i++) {
            for (int j = 0;j < SpecialActvy.size();j++) {
                if ((SpecialActvy.get(i) == SpecialActvy.get(j)) && (j != i)) {
                    SpecialActvy.remove(j);
                }
            }    
        }
        */
        
        
        
        boolean OnlySpecialActivity = false;
        for (int i = 0;i < SpecialActvy.size();i++) {
            if (SpecialActvy.get(i) == 0) {
                OnlySpecialActivity = true;
            }
        }
        
        if (OnlySpecialActivity == true) {
            for (int i = 0;i < SpecialActvy.size();i++) {
                switch(SpecialActvy.get(i)) {
                    case 1:
                        CurrentPrice = CurrentPrice + 5;
                        break;
                    case 2:
                        CurrentPrice = CurrentPrice + 6;
                        break;
                    case 3:
                        CurrentPrice = CurrentPrice + 3;
                        break;
                    case 4:
                        CurrentPrice = CurrentPrice + 4;
                        break;
                    case 5:
                        CurrentPrice = CurrentPrice + 7;
                        break;    
                    case 6:
                        CurrentPrice = CurrentPrice + 4;
                        break;
                    case 7:
                        CurrentPrice = CurrentPrice + 7.5;
                        break;
                }
            }
        }
        
        
        
        
        
        
        return CurrentPrice;
    } 
}
