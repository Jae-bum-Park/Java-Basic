package org.opentutorials.javatutorials.operator;


public class stringg {
    public stringg(java.lang.String helloWorld) {
    }

    public static void main(java.lang.String[] args) {
       //number
        System.out.println(1+2);
        System.out.println(1*2);
        System.out.println(1/2);

      //String
        System.out.println("park");
        System.out.println("jae");
        //  /n next line
        System.out.println("park\njae\nbeom");

        //++i, i++




        //++i , i++
        int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력

        //비교연산자 조건문에 잘 쓰인다.
        //==같은가?
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println("one"=="two");
        System.out.println("one"=="one");

        //!= 같지않는가?
        System.out.println(1!=2);
        System.out.println(1!=1);
        System.out.println("one"!="two");
        System.out.println("one"!="one");

        //equals 메소드
        String d = "Hello world";
        String f = "Hello ffworld";
        System.out.println(d != f);
        System.out.println(d.equals(f));
    }
}
