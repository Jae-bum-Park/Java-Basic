public class MethodArrayDemo {

    public static String[] getMembers(){
        String[] members = {"김", "나", "박"};
        return members;
    }

    public static void main(String[] args){
        String[] members = getMembers();
        System.out.println(members[0]);
    }
}
