import java.util.*; //Scanner 객체를 가져오기위해 사용. 패키지를 가져옴.

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in은 키보드장치를 직접 제어하고 키 입력을 받는 표준 입력 스트림 객체, 입력된 키를 바이트로 제공하기 때문에 다시 문자나 숫자로 변경해주어야 함.
                                              // System.in자리에 파일을 넣을 수도 있음. Scanner객체를 sc라는 변수에 담는다.
        int i = sc.nextInt(); //Scanner객체의 nextInt 메소드를 사용함. int 타입으로 리턴해줌.
        System.out.println(i*1000);
        sc.close();

    }
}