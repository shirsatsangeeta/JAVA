import java.io.*;
class CountChars
{
public static void main(String args[])
{
try
{
FileReader fr=new FileReader("C:\\Users\\vinay\\Desktop\\SEM 4\\JAVA\\Programs\\my.txt");
int ch; int c=0;
while((ch=fr.read())!=-1)
{
c++;
}
fr.close();
System.out.println(c);
}
catch(Exception e) { }
} 
}