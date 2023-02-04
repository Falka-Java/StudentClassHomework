public class Main {
    public static void main(String[] args) {
        Student[] students ={
          new Student("Anna", 17, 11),
          new Student("Vladyslav", 17, 11.5),
          new Student("Student-1", 21, 10.2),
          new Student("Student-2", 17, 9.7),
          new Student("Student-3", 20, 8.8),
          new Student("Student-4", 22, 10.1),
          new Student("Student-5", 24, 7.8),
          new Student("Student-6", 22, 8.8),
          new Student("Student-7", 19, 9.2),
          new Student("Student-8", 18, 10.3)
        };

        for(Student st : students){
            System.out.println(st);
        }
    }
}