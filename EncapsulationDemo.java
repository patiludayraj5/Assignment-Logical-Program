public class EncapsulationDemo {
    String StudentName;
    int StudentId;
    int Stud_phoneNumber;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public int getStud_phoneNumber() {
        return Stud_phoneNumber;
    }

    public void setStud_phoneNumber(int stud_phoneNumber) {
        Stud_phoneNumber = stud_phoneNumber;
    }

    public String getStud_Address() {
        return Stud_Address;
    }

    public void setStud_Address(String stud_Address) {
        Stud_Address = stud_Address;
    }

    String Stud_Address;


    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setStudentName("Udayraj Patil");
        encapsulationDemo.setStudentId(7);
        encapsulationDemo.setStud_Address("Pune, Mahararastra-411015");
        encapsulationDemo.setStud_phoneNumber(999999999);
        System.out.println(encapsulationDemo.getStudentName()+" ID-"+encapsulationDemo.getStudentId()+" Address-"+encapsulationDemo.getStud_Address()+" Phone No-"+encapsulationDemo.getStud_phoneNumber());

    }
}
//StudentId Name,Address,phonenumber