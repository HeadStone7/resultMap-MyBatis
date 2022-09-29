package second.entity;

public class Clazz {
    private Integer id;
    private String className;
    private String College;
    private String specialty;
    private Integer EnterYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        this.College = college;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getEnterYear() {
        return EnterYear;
    }

    public void setEnterYear(Integer enterYear) {
        EnterYear = enterYear;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", college='" + College + '\'' +
                ", specialty='" + specialty + '\'' +
                ", EnterYear=" + EnterYear +
                '}';
    }
}
