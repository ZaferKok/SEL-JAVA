package entrerprise01;

public class P6_FindStudent extends P5_ClassroomEntry {

    private int findNum;
    private String  nameList[] = {"Samet Tur","Badem Sur","Serkan Tas"};
    private String classroom [] = {"1A","1A","1A"};
    private int studentNum [] = {1001,2002,3003};

    public P6_FindStudent() {

    }
    public P6_FindStudent(int findNum) {
        this.findNum = findNum;
    }
    public void findStudent() {
        for (int i=0; i<classroom.length; i++) {
            if(studentNum[i]==findNum) {
                System.out.println("Name of the student =======> " + nameList[i]);
                System.out.println("Classroom of the student ==> " + classroom[i]);
                System.out.println("Number of the student =====> " + studentNum[i]);
            }
        }
    }
}
