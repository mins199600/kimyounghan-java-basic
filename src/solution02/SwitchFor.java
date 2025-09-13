package solution02;

public class SwitchFor {
    public static void main(String[] args) {
        //if~else문 형태를 switch문을 이용하는 형태로 바꿔보자
/*        int n = 24;

        String result = switch (n / 10) {
            case 0 -> "0이상 10미만인 수";
            case 1 -> "10이상 20 미만인 수";
            case 2 -> "20 이상 30 미만인 수";
            default -> "음수 혹은 30 이상의 수";
        };
        System.out.println(result);*/

        int n = 24;
        int range = -1;

        if (n >= 0 && n < 10) range = 0;
        else if (n >= 10 && n < 20) range = 1;
        else if (n >= 20 && n < 30) range = 2;
        else range = 3;

        switch (range) {
            case 0:
                System.out.println("0이상 10 미만인 수");
                break;
            case 1:
                System.out.println("10이상 20 미만인 수");
                break;
            case 2:
                System.out.println("20 이상 30 미만인 수");
                break;
            default:
                System.out.println("음수 혹은 30이상인 수");
        }
    }
}
