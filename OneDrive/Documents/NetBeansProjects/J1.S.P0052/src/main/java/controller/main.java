/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Scanner;
import view.Menu;
import view.AllView;
/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        AllView view = new AllView();
        boolean x = true;
        do {
           int choice = view.MenuView();
            switch(choice)
            {   
                case 1 :
                    manager.InputInformation();
                    break;
                case 2: 
                    manager.DisplayCountry();
                     break;
                case 3:
                    manager.SearchCountry();
                    break;
                case 4:
                    manager.SortCountry();
                    break;
                case 5:
                    x=false;
                default : 
                    break;
            }

        } while (x);
    }
}
