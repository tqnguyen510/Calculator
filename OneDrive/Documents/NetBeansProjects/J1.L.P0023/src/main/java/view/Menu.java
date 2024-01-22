package view;


import java.util.Scanner;


public class Menu 
{
    public int getchoice(Object[] Options)
    {
        for (int i=0; i < Options.length; i++)
        {
            System.out.println((i+1) + "-" + Options[i]);
        }
        System.out.println("Choose 1->" + Options.length);
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    } 
}
