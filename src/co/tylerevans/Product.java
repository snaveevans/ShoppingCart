package co.tylerevans;

public class Product {
	private static int ID = 1;

	private int id;
	private String name;
	
	public Product()
	{
		this.id = ID;
		ID++;
	}
	
	public Product(String name)
	{
		this.id = ID;
		ID++;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
