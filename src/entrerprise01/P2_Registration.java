package entrerprise01;

public class P2_Registration {

    String name;
    String classroom;
    int studentNum;

    public P2_Registration() {													//Bu bir constructor

    }
    public P2_Registration(String name, String classroom, int studentNum) {	    // Bu bir constructor
        this.name=name;
        this.classroom=classroom;
        this.studentNum=studentNum;
    }
    public void StudentInfos () { 												// Bu bir metoddur.
        System.out.println("Information of the student...");
        System.out.println("Name : " + this.name);
        System.out.println("Classroom : " + this.classroom);
        System.out.println("Student number : " + this.studentNum);
        System.out.println("The student has been successfully registered.");
    }
}
