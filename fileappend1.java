import java.io.*;
class fileappend1{
		public static void main(String arg[]){
			try{
		FileReader fr=new FileReader("C:\\Users\\vinay\\Desktop\\SEM 4\\JAVA\\Programs\\my.txt");
		FileWriter fw=new FileWriter("C:\\Users\\vinay\\Desktop\\SEM 4\\JAVA\\Programs\\my1.txt",true);
				int c;
		while((c=fr.read())!=-1){
			fw.write(c);
		}
		System.out.println("File Coppied Sucessfully");
		fr.close();
		fw.close();
		}catch(Exception e){
			System.out.println("Error");
		}
	}
}