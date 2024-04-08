public class Main {
    public static void main(String[] args) {
        // 조건문 true or false


        //if(조건){}
        if(true){
            System.out.println("result : true1");
            System.out.println("result : true2");
            System.out.println("result : true3");
            System.out.println("result : true4");
        }
        System.out.println("hi");
        if(false){
            System.out.println("result : false");
        }

        //if(){} else{}
        int a=1, b=3;
        if(a>b) {
            System.out.println("a>b");
        } else if(a==b) {
            System.out.println("a=b");
        } else {
            System.out.println("a<b");
        }

    }
}