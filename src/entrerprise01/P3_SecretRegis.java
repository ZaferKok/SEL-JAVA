package entrerprise01;

public class P3_SecretRegis {

    private String name = "No Name";
    private String classroom = "No Classroom";
    private int studentNum = 0000;

    public P3_SecretRegis() {												//Bu bir constructor

    }
    public P3_SecretRegis(String name, String classroom, int studentNum) {	// Bu bir constructor
        this.name=name;
        this.classroom=classroom;
        this.studentNum=studentNum;
    }
    public void StudentInfos () { 											// Bu bir metoddur.
        System.out.println("Information of the student...");
        System.out.println("Name : " + getName());
        System.out.println("Classroom : " + getClassroom());
        System.out.println("Student number : " + getStudentNum());
        System.out.println("The student has been successfully registered.");
    }

    //===================================================
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //===================================================
    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    //===================================================
    public int getStudentNum() {
        return studentNum;
    }
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
    //===================================================

}


