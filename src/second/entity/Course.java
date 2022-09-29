package second.entity;

public class Course {
    private Integer id;
    private String Cname;
    private double Credit;
    private Integer ClassHour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public double getCredit() {
        return Credit;
    }

    public void setCredit(double credit) {
        Credit = credit;
    }

    public Integer getClassHour() {
        return ClassHour;
    }

    public void setClassHour(Integer classHour) {
        ClassHour = classHour;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", Cname='" + Cname + '\'' +
                ", Credit=" + Credit +
                ", ClassHour=" + ClassHour +
                '}';
    }
}
