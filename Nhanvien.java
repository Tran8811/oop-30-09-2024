public class Nhanvien {
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
    public Nhanvien(Nhanvien nv) {
        this.name=name;
        this.birthYear=birthYear;
    }
}
