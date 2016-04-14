import java.util.Arrays;

public class GenericExample<Naistam> {
	 public  Naistam getTypevar() {
		return typevar;
	}
	public void setTypevar(Naistam typevar) {
		this.typevar = typevar;
	}
 Naistam typevar;
 Naistam height;
	public Naistam getHeight() {
	return height;
}
public void setHeight(Naistam height) {
	this.height = height;
}

//Generic method

public static <Naistam>void interestingprint(Naistam [] a)
{
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	
}
	public static void main(String[] args) {
		GenericExample<Integer> intobj=new GenericExample<Integer>();
		Integer intobj1[]=new Integer [2];
		
		intobj1[0]=1;
		intobj1[1]=2;
		
		//I can assign only Integer values
		
		GenericExample<String> strobj=new GenericExample<String>();
		
		//I can assign only string values
		intobj.setTypevar(10);
		strobj.setTypevar("fd");
		System.out.println(intobj.getTypevar());
		System.out.println(strobj.getTypevar());
		GenericExample e=new GenericExample ();//Generic class object
		GenericExample e1=new GenericExample ();//Generic class object
		e1.setTypevar(false);
		e1.setHeight(5.555555);
		e.setTypevar("jask");//I can assign any type of values
		e.setHeight(10);
		System.out.println(e.getTypevar());
		System.out.println(e);
		GenericExample Naistamarray[]=new GenericExample[10];//create an generic  type array
		//ading the objects to  generic array
		Naistamarray[0]=e;
		Naistamarray[1]=e1;
		
	for(int i=0;i<10 && Naistamarray[i]!=null;i++)//printing out the values
	{
				
				System.out.println( " values of generic array "+Naistamarray[i].height);
	

	}
	//calling generic method
	interestingprint(intobj1);//just pass the object from the method  that can be of any type(Naistam)
}
}