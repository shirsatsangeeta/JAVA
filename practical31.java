import java.io.*;
class practical31{
	public static void main(String arg[]) throws IOException{
		File f=new File("my.txt");
		FileInputStream fis = new FileInputStream(f);
		byte bytearray[]=new byte[(int)f.length()];
	fis.read(bytearray);
		String s=new String(bytearray);
		String words[]=s.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++){
			count++;	
		}
		System.out.println("Words:"+count);
	}
}