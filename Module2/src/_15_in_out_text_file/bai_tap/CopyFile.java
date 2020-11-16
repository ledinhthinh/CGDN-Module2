package _15_in_out_text_file.bai_tap;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader(new File("src/_15_in_out_text_file/bai_tap/textFile.txt")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/_15_in_out_text_file/bai_tap/writeFile.txt")));

        String line = null ;
        while ((line = reader.readLine()) != null) {
            writer.write(line+"\n");
        }
        writer.close();
    }

}
