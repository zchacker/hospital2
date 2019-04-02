
package hospital2;

public class Service {
    private int ID;
    private String name;
    private int price;

    public Service() {
    }

    public Service(int ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
