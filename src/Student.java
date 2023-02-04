public class Student {
    private String name;
    private int age;
    private double averageGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student(String name, int age, double averageGrade){
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString(){
        return "> Name: " + name +"; Age: " + age + "; Average grade: " + averageGrade;
    }
}
