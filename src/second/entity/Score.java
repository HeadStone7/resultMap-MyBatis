package second.entity;


public class Score {
    private Student student;
    private Course course;
    private double uScore;
    private double endScore;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getuScore() {
        return uScore;
    }

    public void setuScore(double uScore) {
        this.uScore = uScore;
    }

    public double getEndScore() {
        return endScore;
    }

    public void setEndScore(double endScore) {
        this.endScore = endScore;
    }

    @Override
    public String toString() {
        return "Score{" + student +
                ", " + course +
                ", uScore = " + uScore +
                ", endScore=" + endScore +
                '}';
    }
}
