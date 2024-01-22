/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import model.Fruit;

public class FruitManagement {

    private ArrayList<Fruit> fruitList;
    private Hashtable<String, ArrayList<Fruit> > hashTable;
    Scanner sc = new Scanner(System.in);

    public FruitManagement() {
        fruitList = new ArrayList<>();
        hashTable = new Hashtable<>();
    }

    Checkvalid data = new Checkvalid();
    public void defaultFruit(){
      
          
    }
    public void createFruit() {
        while (true) {
            String nameF = data.getName("Enter Name Fruit: ");
            double pricef = data.getDouble("Enter Price Fruit: ");
            String originF = data.getOrigin("Enter Origin Fruit: ");
            int quantityf = data.getInt("Enter Quantity: ");
            Fruit ff = new Fruit(fruitList.size()+1, nameF, pricef,quantityf, originF);
            fruitList.add(ff);
            System.out.println("Do you want to continue? (Y/N): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void shopping() {
        ArrayList<Fruit> listBought = new ArrayList<>();
        exportFruit();
        while (true) {
            int selected = data.getInt("To order, please select item: ");
            Fruit selectedFruit = null;
            for (Fruit fruit : fruitList) {
                if (fruit.getFruitid() == selected) {
                    selectedFruit = fruit;
                    System.out.println("Your selected is:" + selectedFruit.getFruitName());
                    break;
                }
            }
            if (selectedFruit != null) {
                int quatity = data.getInt("Please input quantity: ");
                if (quatity > selectedFruit.getQuantity())
                {
                    System.out.println("We don't have enough fruit for you,thanks!!");
                }
                else {
                selectedFruit.setQuantity(selectedFruit.getQuantity()-quatity);
                selectedFruit.setBuyQuantity(quatity);
                listBought.add(selectedFruit);
                }
               
            }
            String op = data.getOrigin("Do you want to continue buying? (Y/N): ");
            if (op.equalsIgnoreCase("N")) {
                break;
            }
        }
        if (!listBought.isEmpty())
        {
            System.out.println("Product | Quantity | Price | Amount");
            double total=0;
            for(Fruit fruit:listBought){
                    double amount=fruit.getBuyQuantity()*fruit.getPrice();
                     System.out.printf("|%-10s |%-15s |%-12s |%-12s |\n", fruit.getFruitName(), fruit.getBuyQuantity(), fruit.getPrice()+"$",amount+"$" );
                     total+=amount;
            }
            System.out.println("Total = "+total);
            String nameCustomer = data.getName("Please input your name: ");
            hashTable.put(nameCustomer,listBought);
            System.out.println();
            System.out.println("Input successfull");
        }
    }

    public void exportFruit() {
        System.out.println("List of Fruit");
        System.out.println("| ++ Item ++ |++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |  ");
        for (Fruit fruit : fruitList) {
            System.out.printf("|%-10s |%-15s |%-12s |%-12s |\n", fruit.getFruitid(), fruit.getFruitName(), fruit.getOrigin(), fruit.getPrice());
        }
    }
    
    public void viewOrder()
    {
        for (String name: hashTable.keySet())
        {   
            System.out.println("Customer Name: "+ name);
            System.out.println("    Product    |   Quantity    |   Price   |     Amount   ");
            double total =0;
            for (Fruit fruit:hashTable.get(name)){
                System.out.printf("|%-10s |%-15s |%-12s |%-12s |\n", fruit.getFruitName(), fruit.getBuyQuantity(), fruit.getPrice(), fruit.getPrice()*fruit.getQuantity());
                total+=fruit.getPrice()*fruit.getBuyQuantity();
            }
            System.out.println("Total= "+total);
        }
    }
}
