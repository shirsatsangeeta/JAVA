import java.io.*;
class CountChars1
{
public static void main(String args[])
{
File f=new File("my.txt");
			if(!f.exists())
			{
				System.out.println("file does not exists");
				System.exit(0);
			}


try
{
FileInputStream fr=new FileInputStream(f);
BufferedReader br=new BufferedReader(fr);
String line;
int countwords=0;
		while((line=br.readLine())!=null){	
				String words[]=line.split(" ");
				countwords=countwords+words.length;
		}

fr.close();
System.out.println("Total words in file:- "+countwords);
}
catch(Exception e) {
System.out.println(e);
 
}
}
}