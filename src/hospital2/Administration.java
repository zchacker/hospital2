
package hospital2;

public class Administration extends Person {
    private String position;

    
    public Administration() {
        
    }

    public Administration(String position, int ID, String name, String address, String phone, String email, int salary) {
        super(ID, name, address, phone, email, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    

    
}
