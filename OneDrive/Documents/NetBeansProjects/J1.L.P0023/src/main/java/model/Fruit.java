
package model;

import java.util.Objects;

public class Fruit {
    private int fruitid;
    private String fruitName;
    private double Price;
    private int quantity;
    private String origin;
    private int buyQuantity;

    public Fruit(int fruitid, String fruitName, double Price,int quantity, String origin) {
        this.fruitid = fruitid;
        this.fruitName = fruitName;
        this.Price = Price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public int getFruitid() {
        return fruitid;
    }

    public void setBuyQuantity(int buyQuantity) {
        this.buyQuantity = buyQuantity;
    }

    public int getBuyQuantity() {
        return buyQuantity;
    }

    public void setFruitid(int fruitid) {
        this.fruitid = fruitid;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFruitName() {
        return fruitName;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.fruitid;
        hash = 83 * hash + Objects.hashCode(this.fruitName);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.Price) ^ (Double.doubleToLongBits(this.Price) >>> 32));
        hash = 83 * hash + this.quantity;
        hash = 83 * hash + Objects.hashCode(this.origin);
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
        final Fruit other = (Fruit) obj;
        if (this.fruitid != other.fruitid) {
            return false;
        }
        if (Double.doubleToLongBits(this.Price) != Double.doubleToLongBits(other.Price)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.fruitName, other.fruitName)) {
            return false;
        }
        return Objects.equals(this.origin, other.origin);
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitid=" + fruitid + ", fruitName=" + fruitName + ", Price=" + Price + ", quantity=" + quantity + ", origin=" + origin + '}';
    }
    
     
}
