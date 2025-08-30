package solution01;

public class StudentDataHandler {
    /*학생 종보 출력 프로그램 만들기
    * 당신은 두 명의 학생 정보를 출력하는 프로그램을 작성해야 한다.
    * 각 학생은 이름, 나이, 성적을 가지고 있다
    *
    * [요구사항]
    * 첫번째 학생의 이름은 "학생1", 나이는 15, 성적은 90 입니다.
    * 두번째 학생의 이름은 "학생2", 나이는 16, 성적은 80 입니다.
    * 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다.
    * 이름 : [] 나이 : [] 성적 : []
    * 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
    * */
    public static void main(String[] args) {
        String studentName1 = "학생1";
        String studentName2 = "학생2";
        int age1 = 15;
        int age2 = 16;
        int grade1 = 90;
        int grade2 = 80;
        /* System.out.println(("이름 : [" + studentName1 + "]") + (" 나이 : [" + age1 + "]") + (" 성적 : [" + grade1 + "]"));
        System.out.println(("이름 : [" + studentName2 + "]") + (" 나이 : [" + age2 + "]") + (" 성적 : [" + grade2 + "]"));*/

        //이제 배열을 사용해서 풀어보자
        String[] studentName = {"학생1","학생2"};
        int[] age = {15, 16};
        int[] grade = {90, 80};
        System.out.println("이름 : [" + studentName[0] + "]" + " 나이 : [" + age[0] + "]" + " 성적 : ["  + grade[0] + "]");
        System.out.println("이름 : [" + studentName[1] + "]" + " 나이 : [" + age[1] + "]" + " 성적 : ["  + grade[1] + "]");

        //이건 김영한 코드
        for(int i = 0; i < studentName.length; i++) {
            System.out.println("김영한 답지");
            System.out.println("이름 : [" + studentName[i] + "]" + " 나이 : [" + age[i] + "]" + " 성적 : ["  + grade[i] + "]");
        }
    }
}
