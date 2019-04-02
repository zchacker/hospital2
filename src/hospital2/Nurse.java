package hospital2;

public class Nurse extends Person {

    private String specialty;
    private int rank;

    public Nurse(String specialty, int rank, int ID, String name, String address, String phone, String email, int salary) {
        super(ID, name, address, phone, email, salary);
        this.specialty = specialty;
        this.rank = rank;
    }

    public Nurse() {
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
