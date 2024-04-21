import java.util.*;
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){//숫자가 아닌 문자를 입력하면 False가 되어 반복문이 종료된다.
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();

    }
}
