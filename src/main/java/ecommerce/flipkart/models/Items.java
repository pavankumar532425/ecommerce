package ecommerce.flipkart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Items {
    @Id
    @GeneratedValue
    int id;
    String itemname;
    String itemdescription;
    double itemprices;
    boolean itemavailability;
    int numberofitemsavailable;
    int Itemrating;

    public int getItemrating() {
        return Itemrating;
    }

    public void setItemrating(int itemrating) {
        Itemrating = itemrating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public double getItemprices() {
        return itemprices;
    }

    public void setItemprices(double itemprices) {
        this.itemprices = itemprices;
    }

    public boolean isItemavailability() {
        return itemavailability;
    }

    public void setItemavailability(boolean itemavailability) {
        this.itemavailability = itemavailability;
    }

    public int getNumberofitemsavailable() {
        return numberofitemsavailable;
    }

    public void setNumberofitemsavailable(int numberofitemsavailable) {
        this.numberofitemsavailable = numberofitemsavailable;
    }
}
