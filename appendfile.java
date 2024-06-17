import java.io.*;
class appendfile{
	public static void main(String arg[]) throws IOException{
	FileReader fr=new FileReader("my.txt");
	FileWriter fw=new FileWriter("my1.txt",true);
	int c;
	while((c=fr.read())!=-1){
		fw.write(c);
	}
	fr.close();
	fw.close();
	System.out.println("Data appended");
	}
}