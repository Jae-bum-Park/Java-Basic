public class ArrayDemo3_loop {
    public static void main(String[] args){
        //배열과 반복문간의 조화가 중요함.
        String[] members = {"김", "나", "박", "이"};
        for(int i = 0; i<members.length; i++){
            String member = members[i];
            System.out.println(member + "clear");
        }
    }
}
