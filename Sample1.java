import java.io.*;
public class Sample1 {
   public static void main(String args[]) throws Exception{

      int count =0;
      File file = new File("my.txt");
      FileInputStream fis = new FileInputStream(file);
      byte[] bytesArray = new byte[(int)file.length()];
      fis.read(bytesArray);
      String s = new String(bytesArray);
      String words[] = s.split(" ");
      for (int i=0; i<words.length; i++) {
         count++;
      }
      System.out.println("Number of words in the given file are " +count);
   }
}