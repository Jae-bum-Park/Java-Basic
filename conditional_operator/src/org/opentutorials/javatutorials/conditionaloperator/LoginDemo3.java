package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];

        //&&  사용하여 아이디와 비번 모두 같을시 로그인 된다.
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}