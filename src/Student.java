public class Student extends Person {
    private String msv;

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
    public Student(String name,int birthYear,String msv) {
        super(name,birthYear);
        this.msv=msv;

    }


}
