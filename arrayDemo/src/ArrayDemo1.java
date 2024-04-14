public class ArrayDemo1 {
    //변수 String a = "coding"
    //배열은 변수에 연관된 정보들을 그룹핑(모아서 관리)한다고 생각하면 됨.
    public static void main(String[] args) {
        String[] classGroup = { "소", "박", "김", "재", "희"};
        for(int i=0; i<5; i++){
            System.out.println(classGroup[i]);
        }

    }
}