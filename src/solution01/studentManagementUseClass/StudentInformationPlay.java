package solution01.studentManagementUseClass;

public class StudentInformationPlay {
    public static void main(String[] args) {
        StudentInformation student1;
        student1 = new StudentInformation();
        student1.StudentName = "학생1";
        student1.StudentAge = 15;
        student1.studentGrade = "90";


        StudentInformation student2 = new StudentInformation();
        student2.StudentName = "학생2";
        student2.StudentAge = 17;
        student2.studentGrade = "80";

        System.out.println("=========================================");
        System.out.println("이름 : " + student1.StudentName + " 나이 : " + student1.StudentAge + " 성적 : " + student1.studentGrade);
        System.out.println("이름 : " + student2.StudentName + " 나이 : " + student2.StudentAge + " 성적 : " + student2.studentGrade);
    }
}
