
package hospital2;

import java.util.ArrayList;


public class Patients extends Person{
    String type;
    ArrayList<Service> services = new ArrayList<Service>();

    public Patients() {
    }

    public Patients(int ID, String name, String address, String phone, String email, int salary, String type) {
        super(ID, name, address, phone, email, salary);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    
    
}
