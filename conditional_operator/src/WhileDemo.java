public class WhileDemo {
    public static void main(String[] args) {
       //while문은 종료조건을 잘못 지정하면 무한반복이 되거나, 반복문이 실행되지 않음.
        int i = 0;
        while (i<10) {
            System.out.println("i = " +i);
            i++;
        }
    }
}
