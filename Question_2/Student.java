package Question_2;
public class Student {
    private String studentId;
    private String name;
    private double score;
    
    public Student(String studentId, String name, double score) {
        this.studentId = studentId;
        this.name = name;
        setScore(score);
        
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        if(score >= 0 && score <= 100){
            this.score = score;
        }else{
            System.out.println("Invalid Score.");
        }
        
    }

    public char getGrade(){
        if(score >= 70){
            return 'A';
        }
        else if (score >= 60 ) {
            return 'B';
        }
        else if(score >= 50 ){
            return 'C';
        }
        else if(score >= 45){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void main(String[] args) {
        Student student = new Student("22407542", "Asante Joel", 98.5);

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
