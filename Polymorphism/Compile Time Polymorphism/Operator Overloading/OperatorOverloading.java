class operator
{
	void operator(String str1,String str2)
	{
		String s=str1+str2;
		System.out.println("Concatinated String"+s);
	}
	void operator(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum="+c);
	}
}
class OperatorOverloading
{
		public static void main(String args[])
		{
			operator obj=new operator();
			obj.operator(2,3);
			obj.operator("Vijay","Shraddha");	
		}
}