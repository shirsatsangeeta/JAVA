import java.io.*;
class file{
	public static void main(String arg[]) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\vinay\\Desktop\\SEM 4\\JAVA\\Programs\\my.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		int count=0;
		int countl=0;
		while((line=br.readLine())!=null){
			if(line.equals("")){
				countl+=1;
			}else{
			String words[]=line.split(" ");
			count = count+words.length;}
		}
		System.out.println("No of Lines="+countl);
		System.out.println("No of Words="+count);

	}
}