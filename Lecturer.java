public class Lecturer {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public Lecturer(Lecturer l) {
        this.name=name;
        this.birthYear=birthYear;
    }
}
