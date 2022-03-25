package day4;

 class Product1 {
	String productName;
	int productId;
	int productPrice;
	Product1(String productName,int productId,int productPrice)
	{
		this.productName=productName;
		this.productId=productId;
		this.productPrice=productPrice;
	}
	public void display()
	{
		System.out.println("Product name is:" +productName+ " " + "Product id is:" +productId+ " "
				+ "Product price is:" +productPrice);
		System.out.println();
	}
}
class Product
{
	public static void main(String args[])
	{
		Product1[] arr=new Product1[5];
		arr[0]=new Product1("baby oil",120,5000);
		arr[1]=new Product1("kurkure",121,4000);
		arr[2]=new Product1("powder",122,3000);
		arr[3]=new Product1("facewash",123,2000);
		arr[4]=new Product1("baby oil",124,1000);
		arr[0].display();
		arr[1].display();
	    arr[2].display();
		arr[3].display();
		arr[4].display();
		
		
	}
	}
