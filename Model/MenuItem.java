package Model;

import java.util.Date;

public class MenuItem {
    int quantity;
    String name;
    double cost;
    Date dateSold;
    public int getQuantity() {
        return this.quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    public Date getDateSold() {
        return this.dateSold;
    }
}
