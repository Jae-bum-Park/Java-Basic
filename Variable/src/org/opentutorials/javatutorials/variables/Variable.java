package org.opentutorials.javatutorials.variables;

//변수를 사용하는 이유 : 중복의 제거, 가독성, 유지보수

public class Variable {
    public static void main(java.lang.String[] args) {
        //int 정수
        int a;
        a = 1;
        System.out.println(a+2);

        a = a + 3;
        System.out.println(a);

        //double 실수
        double b;
        b = 1.1;
        System.out.println(b+a);

        //string 문자
        String c;
        c = "Acsdc";

        System.out.println(c);
    }
}
