package model;

import java.util.Objects;

public class Country {

    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public float getTotalArea() {
        return totalArea;
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
    public String toString() {
        return "Country{" + "countryCode=" + countryCode + ", countryName=" + countryName + ", totalArea=" + totalArea + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.countryCode);
        hash = 41 * hash + Objects.hashCode(this.countryName);
        hash = 41 * hash + Float.floatToIntBits(this.totalArea);
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
        final Country other = (Country) obj;
        if (Float.floatToIntBits(this.totalArea) != Float.floatToIntBits(other.totalArea)) {
            return false;
        }
        if (!Objects.equals(this.countryCode, other.countryCode)) {
            return false;
        }
        return Objects.equals(this.countryName, other.countryName);
    }
    
    
}
