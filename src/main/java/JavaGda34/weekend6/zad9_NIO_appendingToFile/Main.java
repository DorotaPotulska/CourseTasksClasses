package JavaGda34.weekend6.zad9_NIO_appendingToFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path sciezka= Paths.get("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\dniTygodnia.txt");
        //System.out.println(sciezka.getName());//root c: ?? cos nie tak
        System.out.println(sciezka.getName(0));

        System.out.println(sciezka.getName(1).getParent()); // null?? cos nie tak


        //////////cz2
        List<String> list;
        try  {
            list = Files.readAllLines(sciezka);
            System.out.println(list);
        }catch(IOException e){
            e.printStackTrace();
        }
///////////////cz3
        try{
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("C:\\Users\\cdc4\\Desktop\\SDA_JAVA\\dniTygodnia.txt"),true));
            printWriter.append("Cos nowego");
            printWriter.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
