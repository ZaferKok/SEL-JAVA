package entrerprise01;

import java.util.Scanner;

public class P4_AutoSecretReg {

    private String name = "No Name";
    private String classroom = "No Classroom";
    private int studentNum = 0000;

    public P4_AutoSecretReg() {													//Bu bir constructor

    }
    public P4_AutoSecretReg(String name, String classroom, int studentNum) {	// Bu bir constructor
        this.name=name;
        this.classroom=classroom;
        this.studentNum=studentNum;
    }

    public void StudentDataEntry() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter student name and lastname : ");
        String name = scan.nextLine();
        setName(name);
        System.out.println("Enter classroom : ");
        String classroom = scan.nextLine();
        setClassroom(classroom);
        System.out.println("Enter student number : ");
        int studentNum = scan.nextInt();
        setStudentNum(studentNum);
    }

    public void StudentInfos () { 												// Bu bir metoddur.
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
