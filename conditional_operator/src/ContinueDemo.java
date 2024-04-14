public class ContinueDemo {
    public static void main(String[] args) {
        //continue는 반복문을 중단하고 다시 시작한다.

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("Coding i =  " + i);
        }

    }

}