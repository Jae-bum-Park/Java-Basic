//입력 출력, 매개변수와 인자

//매개변수 parameter :  a,b
public class MethodDemo2 {
    public static void numbering(int a, int b){
        while (a < b) {
            System.out.println(a);
            a++;
        }
    }
//인자 argument : 0, 10, 3, 20
    public static void main(String[] args) {
        numbering(0, 10);
        numbering(3, 20);
    }
}
