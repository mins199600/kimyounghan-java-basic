package solution01.studentManagementUseClass;

public class StudentFor {
    public static void main(String[] args) {

        StudentInformation student1;
        student1 = new StudentInformation();
        student1.StudentName = "학생1";
        student1.StudentAge = 15;
        student1.studentGrade = "90";


        StudentInformation student2 = new StudentInformation();     //주소 보관하는곳
        student2.StudentName = "학생2";   //자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        student2.StudentAge = 17;
        student2.studentGrade = "80";

        //배열사용
        StudentInformation[] students = {student1,student2};
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].StudentName + " 나이 : " + students[i].StudentAge + " 성적 : " + students[i].studentGrade);
        }
    }
}
