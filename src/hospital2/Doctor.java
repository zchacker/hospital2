package hospital2;

public class Doctor extends Person implements Comparable<Doctor> {

    String specialty;
    int rank;
    Nurse nurse;

    public Doctor(String specialty, int rank, Nurse nurse, int ID, String name, String address, String phone, String email, int salary) {
        super(ID, name, address, phone, email, salary);
        this.specialty = specialty;
        this.rank = rank;
        this.nurse = nurse;
    }

    public Doctor() {
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

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public int compareTo(Doctor candidate) {
        if (this.getSalary() < candidate.getSalary()) {
            return -1;
        } else {
            if (this.getSalary() == candidate.getSalary()) {
                return 0;
            } else {
                return 1;
            }
        }
    }

}
