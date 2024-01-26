
package model;

import java.util.Objects;


public class EastAsiaCountries extends Country{
    private String countryTerrain;

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }
    
    
    public String getCountryTerrain() {
        return countryTerrain;
    }

    @Override
    public String getCountryCode() {
        return countryCode;
    }

   
    @Override
    public String getCountryName() {
        return countryName;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    @Override
    public float getTotalArea() {
        return totalArea;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.countryTerrain);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EastAsiaCountries other = (EastAsiaCountries) obj;
        return Objects.equals(this.countryTerrain, other.countryTerrain);
    }
    
    
}
