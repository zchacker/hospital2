
package hospital2;

public class Service implements Comparable<Service> {
    private int ID;
    private String name;
    private int price;
    private Doctor doctor;
    
    public Service() {
    }

    public Service(int ID, String name, int price, Doctor doctor) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.doctor = doctor;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    @Override     
    public int compareTo(Service candidate) {          
      if(this.getPrice() < candidate.getPrice()){
          return -1;
      }else{
          if(this.getPrice() == candidate.getPrice()){
              return 0;
          }else{
              return 1;
          }
      }     
    }
    
}
