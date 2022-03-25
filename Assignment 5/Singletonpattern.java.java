package day5.java;

 class Singleton1
{
  private static Singleton1 s=null;
  public String s1;
  private Singleton1()
  {
	  s1="Hello am Singleton Pattern";
  }
  public static Singleton1 getInstance()
  {
	  if(s==null)
	  {
		  s=new Singleton1();
	  }
	  return s;
  }
}
class Singletonpattern
{
	public static void main(String args[])
	{
		Singleton1 t1=Singleton1.getInstance();
		Singleton1 t2=Singleton1.getInstance();
		Singleton1 t3=Singleton1.getInstance();
		System.out.println("Hash code of t1 is" +t1.hashCode());
		System.out.println("Hash code of t2 is" +t2.hashCode());
		System.out.println("Hash code of t3 is" +t3.hashCode());
	}
}