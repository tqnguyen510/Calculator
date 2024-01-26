package view;

import common.Checkvalid;
import java.util.ArrayList;
import java.util.Scanner;
import model.Country;
import model.EastAsiaCountries;
public class AllView {
    public int MenuView(){
     Menu a= new Menu();
        Scanner sc = new Scanner(System.in);
        String[] options = {"Input the information of 11 countries in East Asia", "Display the information of country you've just input", " Search the information of country by user-entered name", "Display the information of countries sorted name in ascending order","Exit"};
        return a.getchoice(options);
    }
    public EastAsiaCountries InputView() {
        Checkvalid data = new Checkvalid();
        String code = data.getString("Enter code of country: ");
        String name = data.getString("Enter name of country: ");
        float totalArea = data.getFloat("Enter total Area: ");
        String terrain = data.getString("Enter terrain of country: ");
        return new EastAsiaCountries(terrain, code, name, totalArea);
    }
    public void DisplayView( ArrayList<EastAsiaCountries> list)
    {
        System.out.println("ID       Name       Total Area       Terrain");
        for (EastAsiaCountries l: list){
         System.out.printf("%s       %s       %3f       %s\n",l.getCountryCode(),l.getCountryName(),l.getTotalArea(),l.getCountryTerrain());   
        }
    }
    public ArrayList<EastAsiaCountries> SearchView(ArrayList<EastAsiaCountries> list)
    {   Checkvalid data= new Checkvalid();
    
       ArrayList<EastAsiaCountries> SearchList = new ArrayList<>();
       String SearchName=data.getString("Enter the name you want to search: ");
        for (EastAsiaCountries l : list)
        {
            if (l.getCountryName().equals(SearchName))
            {
                SearchList.add(l);
            }
        }
        return SearchList;
    }
}
