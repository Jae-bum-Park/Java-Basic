public class  MethodDemo1{
    //numbering 메소드를 정의한다. Method Define
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    //numbering 메소드가 3번 호출된다. Method Call
    public static void main (String[] args) {
        numbering();
        numbering();
        numbering();
    }
}