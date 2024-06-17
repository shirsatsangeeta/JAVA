import java.io.*;
class count_words{
	public static void main(String arg[]) throws IOException{
		FileReader fr=new FileReader("my.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		int count=0;
		while((line=br.readLine())!=null){
			String words[]=line.split(" ");
			count=count+words.length;
		}
		System.out.println("Words: "+count);
	}
}