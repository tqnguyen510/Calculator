/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Mainmenu;


public class CalculatorController {
        Mainmenu main = new Mainmenu();
        public void run()
        {  boolean x= true;
          do { 
             int choice = main.calculatorMenu();
             
             switch(choice)
           {
               case 1: main.calculatorview();
               break;
               case 2:main.BMIview();break;
               case 3: x=false;
               default: break;
                            
           }
        } while(x);
        }
}
