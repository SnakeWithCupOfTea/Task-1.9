//Ввести с клавиатуры 3 строки и вывести в файл слова
// из этих строк по одному слову
// на каждой строке файла.

package Prog;

import java.util.*;
import java.io.*;


public class Main {

    public static final String FILE_NAME = "Text.txt";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line");
        String str1 = in.nextLine();
        System.out.println("Enter line two");
        String str2 = in.nextLine();
        System.out.println("Enter line three");
        String str3 = in.nextLine();
        String strsum =str1+" "+str2+" "+str3;
        try(FileWriter writer = new FileWriter(FILE_NAME, false))
        {
            String[] line = strsum.split(" ");
            int lastitem = line.length;
            for (int i=0; i<lastitem; i++){
                writer.write(line[i]);
                writer.append(System.lineSeparator());
            }

            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
