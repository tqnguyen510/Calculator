/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.Menu;
import java.util.Scanner;
import model.Fruit;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Menu a= new Menu();
        Scanner sc = new Scanner(System.in);
         
        String[] options = {"Create Fruit", "View Order", " Shopping(for buyer)", "Exit"};
        int choice;
        FruitManagement FRUIT = new FruitManagement();
        
        do {
            System.out.println("-------MENU-------");
            choice = a.getchoice(options);
            switch(choice)
            {
                case 1 :
                    FRUIT.createFruit();
                    break;
                case 2: 
                    FRUIT.viewOrder();
                            break;
                case 3:
                    FRUIT.shopping();
                case 4:
                    System.out.println();
                default :
                    break;
                
            }

        } while (true);
    }
}
