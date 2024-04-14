public class ArrayDemo2 {

    public static void main(String[] args) {
        //length : 4, index 0~3, element 김,나,박,이
        String[] classGroup = new String[4];
        classGroup[0] = "김";
        System.out.println(classGroup.length);
        classGroup[1] = "나";
        System.out.println(classGroup.length);
        classGroup[2] = "박";
        System.out.println(classGroup.length);
        classGroup[3] = "이";
        System.out.println(classGroup.length);

        for(int i = 0; i<4; i++){
            System.out.println(classGroup[i]);
        }

    }

}