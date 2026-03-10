package Question_2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("", "", 98.5);

        System.out.println("Inputting Valid scores:98.5 (Between 0 & 100)");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Grade: " + student.getGrade());
        System.out.println();

        System.out.println("Inputting an Invalid score: 120 (Score > 100)");
        student.setScore(120);
        System.out.println();

        System.out.println("Inputting an Invalid score: -70 (Score < 0)");
        student.setScore(-70);
        System.out.println();


    }
}
