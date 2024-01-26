package model;
import java.util.Comparator;

public class CountryComparator implements Comparator<EastAsiaCountries> {
    @Override
    public int compare(EastAsiaCountries c1, EastAsiaCountries o2) {
       
        return c1.getCountryName().compareToIgnoreCase(o2.getCountryName());
    }
}