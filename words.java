import java.io.*;

class words{
		public static void main(String arg[]) throws IOException{
			File file=new File("my.txt");
			FileInputStream fis= new FileInputStream(file);
		byte bytearray[]=new byte[(int)file.length()];
		fis.read(bytearray);
		String s=new String(bytearray);
		String words1[]=s.split(" ");
		int count=0;
		for(int i=0;i<words1.length;i++){
				count++;
		}
		System.out.println("Words:"+count);
		}
}