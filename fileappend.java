import java.io.*;
class fileappend{
		public static void main(String arg[])throws IOException{
		FileReader fr=new FileReader("C:\\Users\\vinay\\Desktop\\SEM 4\\JAVA\\Programs\\my.txt");
		FileWriter fw=new FileWriter("C:\\Users\\vinay\\Desktop\\SEM 4\\JAVA\\Programs\\my1.txt");
		try(
		BufferedReader in=new BufferedReader(fr);
		BufferedWriter out=new BufferedWriter(fw)){
		int c;
		while((c=in.read())!=-1){
			out.write(c);
		}
		System.out.println("File Coppied Sucessfully");
		}
	}
}
