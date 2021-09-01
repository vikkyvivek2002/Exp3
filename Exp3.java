
public class Exp3 {

	public static void main(String[] args) {
try
{
	int arr[] = new int[10];
	arr[5] = 12/2;
     String str = null;
     System.out.println(str.length());
}
catch(ArithmeticException obj2)
{
	System.out.println("ArithmeticException occured");
}
catch(Exception obj)
{
	 System.out.println("Exception occured");
}
	
} }