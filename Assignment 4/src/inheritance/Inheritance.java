package inheritance;

interface Adder//interface
{
  public int add(int x,int y);	//method declaration
}
interface Upperstring
{
	public void str();//method declaration
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Adder x=(n1,n2)->//used lambda expression
     {
    	 return n1+n2;
     };
     String s1="welcome";//declare string
     Upperstring s11=()->//using lambda expression
     {
    	 
     System.out.println(s1.toUpperCase());//print
    
     };
    
    System.out.println( x.add(5,45));//calling method
    s11.str();//calling method
}
}