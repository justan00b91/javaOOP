/**The following class demonstrates various concepts of OOP
with the various methods/functions.*/
class sub extends super1 implements interface1
{
	private String value = "";
	//private variable to denonstrate encapsulation
	static String color = "";
	//private variable to demonstrate data-abstraction
	public sub(String color) //DATA-ABSTRACTION 
	{
		//constructor of class sub
		this.color=color;
		//initialises variable color
		if(color.equals(BLUE_COLOR)) //checks from interface variable
			this.color=RED_COLOR; // changes the value
	}
	public void printcolor() //DATA-ABSTRACTION
	{
		System.out.println(color);
		//prints the changed value of color 
	}
	public void classcall() //CREATING-CLASSES
	{
		super1 obj = new super1(); 
		//object of other class
		obj.getname("justan00b"); 
		obj.generateNo(); 
		//calling methods from other classes
		obj.print();
	}
	public void identify() //INHERITANCE
	{
		System.out.println("Identity of Class 'sub'.");
		//print statement of this class
		super.identify(); 
		//print statement of other class
	}
	public void func1() //POLYMORPHISM
	{ 
		//via function overloading
		System.out.println("Function1 is without any formal parameters");
	}
	public void func1(int n) //POLYMORPHISM
	{ 
		//overloaded function
		System.out.println("Function1 is not with formal parameter 'n' (int) having value "+n);
	}
	public void setfunc(String val) //ENCAPSULATION
	{
		//setting up get/set methods to update the value of variable via public methods
		value=val;
	}
	public String getfunc() //ENCAPSULATION
	{ 
		//returning the changed value of private variable
		return value;
	}
	public static void displaylines() //for fancy display
	{
		for(int i=0;i<20;i++)
			System.out.print("-");
		System.out.println();
	}
	public static void main(String args[]) //main method
	{
		sub obj=new sub("blue"); 
		//creating object of this class 

		System.out.println("Creating Class"+"\n");
		obj.classcall();
		displaylines();

		System.out.println("Inheritance"+"\n");
		obj.identify();
		displaylines();

		System.out.println("Polymorphism"+"\n");	
		obj.func1();
		obj.func1(100);
		displaylines();

		System.out.println("Data-Abstraction"+"\n");
		obj.printcolor();
		displaylines();

		System.out.println("Encapsulation"+"\n");
		obj.setfunc("NONE");
		System.out.println(obj.getfunc());
		displaylines();
	}
}
