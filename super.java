class super
{
	String user;
	int number;
	//creating constructor of the class 
	public super(String user)
	{
		this.user=user;	
		//using this keyword to differentiate  b/w instance variables and local variables 
	}
	public void generateNo()
	{
		number=(int)(Math.random()*10);
		//generate random number b/w 1 and 10
	}
	public void identify()
	{
		System.out.println("Identity of Class1.");
	}
	public void print()
	{
		//prints name and number
		System.out.println("Name-->"+user);
		System.out.println("Lucky number-->"+number);	
	}
}
