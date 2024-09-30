public class Student {
    private String name;
    private int birthYear;
    private String msv;


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

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
    public Student(Student s) {
      this.name=name;
      this.birthYear=birthYear;
      this.msv=msv;
    }
}
