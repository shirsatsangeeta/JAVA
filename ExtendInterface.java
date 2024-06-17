interface NewShape
{
void draw();
}
interface Circle extends NewShape {
void getRadius();

}
class NewCircle implements Circle
{
	int radius=10;
	@Override
	public void draw(){
	}
	@Override
public void getRadius()
{

System.out.println(radius);
}
}
class ExtendInterface 
{
public static void main(String aregs[])
{
Circle nc=new NewCircle();
 nc.getRadius();

}
}