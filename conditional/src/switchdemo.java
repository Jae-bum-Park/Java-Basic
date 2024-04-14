public class switchdemo {
    public static void main(String[] args) {

        System.out.println("switch");
        switch(1){
            case 1:
                System.out.println("one");
                break; //switch 종료
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            default://스위치 조건에 만족하는 것이 없을때 실행
                System.out.println("default");
        }
        switch(2){
            case 1:
                System.out.println("one");
            case 2://2부터 실행
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
    }
}
