
package controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.Country;
import model.EastAsiaCountries;
import view.AllView;
import view.Menu;
public class ManageEastAsiaCountries {
    AllView View= new AllView();
    ArrayList<EastAsiaCountries> CountryList= new ArrayList<>();
   public void InputInformation()
   {
        EastAsiaCountries a = View.InputView();
        CountryList.add(a);
   }
   public void DisplayCountry()
   {
       View.DisplayView(CountryList);
   }
   public void SearchCountry()
   {  ArrayList<EastAsiaCountries> SearchList = new ArrayList<>();
        
    View.DisplayView( View.SearchView(CountryList));
   }
   public void SortCountry()
   {
      // Collections.sort(CountryList);
       View.DisplayView(CountryList);
   }
   
}
