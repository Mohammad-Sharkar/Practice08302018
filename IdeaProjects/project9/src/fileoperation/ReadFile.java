package fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path ="";
        try{
            fr = new FileReader(path);
        }catch (Exception ex){
            System.out.print("File is not found, plz check the path ");
        }
        try{
            br = new BufferedReader(fr);
            String data = "/Users/nishatsultana/eclipse-workspace-July2018/filereader.txt";
            while((data = br.readLine()) != null){
                System.out.println(data);
            }
        }catch (Exception ex){
            System.out.print("File is not readable");
        }
    }
}
//tough