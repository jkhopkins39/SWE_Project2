package Model;

public class Drink extends MenuItem {
    public char size;
    public int quantity;
    public String name;

    public Drink() {
        this.name = "";
        this.size = 'x';
        this.quantity = 0;
    }

    public Drink(String name, char size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }
}
