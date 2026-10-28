public class Student {
    

    String name;
    int grade1;
    int grade2;
    int grade3;

    public Student(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }
}
    

