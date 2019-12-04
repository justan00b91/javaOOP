/**The following is qa super class made to 
demonstrate inheritance in java. The class
has four functions which are called  y the
sub class. */
class super1
{ 
	String user;
	int number;
	 //saves randomly generated number 
	public void getname(String user)
	{
		this.user=user;
		//distinguish between local and instance variables
	}
	public void generateNo()
	{
		number=(int)(Math.random()*10);
		//generate random number b/w 1 and 10
	}
	public void identify()
	{
		//displays a statement from this class when called by the sub class
		System.out.println("Identity of Class 'super1'.");
	}
	public void print()
	{
		//prints name and number
		System.out.println("Name-->"+user);
		System.out.println("Lucky number-->"+number);	
	}
}
