

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ScannerDemo3 {
    public static void main(String[] args) {
        try{
            File file = new File("out.txt"); //파일을 불러온다.
            Scanner sc = new Scanner(file); //파일의 내용을 가져와라.
            while (sc.hasNextInt()){
                System.out.println(sc.nextInt()*1000);
            }
            sc.close();
        } catch(FileNotFoundException e){//파일의 내용이나 파일을 찾을수 없을 경우 에러가 나는경우 에러의 내용을 표출해라
            e.printStackTrace();
        }
    }
}
