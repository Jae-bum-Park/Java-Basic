//출력
public class MethodDemo3 {

    //String은 numbering 메소드가 반드시 문자열을 return하게 한다.
    //따라서 main 메소드에서 쓰인 변수값은 String으로 지정해주어야 함.
    public static String numbering(int init, int limit) {
        int i = init;

        //output은 빈 문자열
        String output = "";
        while (i < limit) {

            //output = output + i 라는 의미
            output += i;
            i++;
        }
        //return은 메소드의 출력값을 외부로 출력해준다.
        return output;
    }
    //void는 메소드앞에 붙게 되면 메소드의 return값은 존재하지 않는다.
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
    }
}
