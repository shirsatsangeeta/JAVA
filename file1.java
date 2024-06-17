import java.io.*;
class file1{
	public static void main(String arg[]) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\vinay\\Desktop\\SEM 4\\JAVA\\Programs\\my.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		int countpara=0;
		int countwords=0;
		while((line=br.readLine())!=null){
			if(line.equals("")){
				countpara++;
				
			}
			else{
				String words[]=line.split(" ");
				countwords=countwords+words.length;
			}
		}
		System.out.println("Words:"+countwords);
		
	}
}