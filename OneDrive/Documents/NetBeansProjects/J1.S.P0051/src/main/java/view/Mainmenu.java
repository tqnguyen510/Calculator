/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Checkvalid;
import java.util.Scanner;
import model.Calculator;

public class Mainmenu {
    Menu menu = new Menu();
    Checkvalid data= new Checkvalid();
    Calculator calculator = new Calculator();
    Scanner sc = new Scanner(System.in);
    public int calculatorMenu(){
            String[] Options={"Normal Calculator","BMI Calculator","Exit"};
            int choice;
            return choice = menu.getchoice(Options);
    }
    public void BMIview()
    {
       
        int weight= data.getInt("Enter Weight(kg):" );
        int height= data.getInt("Enter Height(cm): ");
        System.out.println(calculator.BMICalculator(weight, height));
    }
    public void calculatorview()
    {
        float a=data.getInt("Enter number: ");
        char b=data.getOperator("Enter Operator: ");
        float c=data.getInt("Enter number: ");
        System.out.printf("Memory %.1f%n \n ",calculator.Calculator(a, b, c));
      
    }
    
    
}
