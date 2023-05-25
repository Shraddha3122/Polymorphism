class parent
{
	void print()
	{
		System.out.println("parent class");
	}
}
class subclass extends parent
{
	void print()
	{
		System.out.println("sub class");
	}
}
class subclass2 extends parent
{
	void print()
	{
		System.out.println("subclass 2");
	}
}
class RunTime
{
	public static void main(String args[])
	{
		parent a;
		a=new subclass();
		a.print();
		a=new subclass2();
		a.print(); 
	}
}