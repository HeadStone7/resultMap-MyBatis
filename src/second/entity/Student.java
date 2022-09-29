package second.entity;

import java.util.Date;

public class Student {
    private Integer id;
    private String Sno;
    private String Sname;
    private Integer Sex;
    private Date Birth;
    private Clazz clazz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public Integer getSex() {
        return Sex;
    }

    public void setSex(Integer sex) {
        Sex = sex;
    }

    public Date getBirth() {
        return Birth;
    }

    public void setBirth(Date birth) {
        Birth = birth;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Sno='" + Sno + '\'' +
                ", Sname='" + Sname + '\'' +
                ", Sex=" + Sex +
                ", Birth=" + Birth +
                ", class=" + clazz +
                '}';
    }
}
